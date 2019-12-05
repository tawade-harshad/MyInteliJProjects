package com.example.demo.services;

import com.example.demo.entity.Loan;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanServices {

    @Autowired
    private MyRepository repo;

    public List<Loan> findLoanByLoanType(String loanType){
        return this.repo.getLoanByLoanType(loanType);
    }

    public List<Loan> findLoanByStatus(String status){
        return this.repo.getLoanByStatus(status);

    }

    public Loan findLoanById(int id){
        Loan NullResult = null;
        Optional<Loan> result = this.repo.findById(id);
        if(result.isPresent()){
            NullResult= result.get();
        }
        return NullResult;
//        return this.repo.findById(id).get();
    }
}
