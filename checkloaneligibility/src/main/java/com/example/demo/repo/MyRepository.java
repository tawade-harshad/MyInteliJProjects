package com.example.demo.repo;

import com.example.demo.entity.CibilScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<CibilScore, Long> {
    public CibilScore findCibilScoreByPanCardNumber(String panCardNumber);

}
