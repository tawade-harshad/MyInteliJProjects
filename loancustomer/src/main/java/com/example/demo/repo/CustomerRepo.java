package com.example.demo.repo;

import com.example.demo.entity.LoanCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends PagingAndSortingRepository<LoanCustomer, Long> {

    Iterable<LoanCustomer> findAll(Sort sort);
    Page<LoanCustomer> findAll(Pageable page);

}
