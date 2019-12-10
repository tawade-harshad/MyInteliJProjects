package com.example.demo.service;

import com.example.demo.entity.LoanCustomer;
import com.example.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo repo;

    public Iterable<LoanCustomer> sortyBy(String propName){
        Sort sortBy = Sort.by(propName);
        return this.repo.findAll(sortBy);
    }

    public Page<LoanCustomer> paginate(int pageNo, int size, String propName){
        Pageable pageRequest = PageRequest.of(pageNo, size, Sort.by(propName));

        Page<LoanCustomer> page = repo.findAll(pageRequest);

        List<LoanCustomer> custList = new ArrayList<>();
       /* if(page.hasContent()){
            custList = page.getContent();
        }*/
        return page;
    }

    public Iterable<LoanCustomer> findAll(){
        return this.repo.findAll();
    }

    public LoanCustomer addLoan(LoanCustomer newLoan){
            return this.repo.save(newLoan);
    }

    public Optional<LoanCustomer> getLoanById(long loanId){
        return this.repo.findById(loanId);
    }

    public LoanCustomer updateLoan(LoanCustomer existingLoan){
        return this.repo.save(existingLoan);
    }

    public boolean deleteLoanById(long loanId){
        boolean isPresent = true;
        this.repo.deleteById(loanId);
        boolean isDeleted = this.repo.existsById(loanId);
        if(!isDeleted){
            isPresent = false;
        }
        return isPresent;
    }

     public boolean deleteLoan(LoanCustomer existingLoan){
         boolean isPresent = true;
         this.repo.delete(existingLoan);
         boolean isDeleted = this.repo.existsById(existingLoan.getLoanId());
         if(!isDeleted){
             isPresent = false;
         }
         return isPresent;
     }
}
