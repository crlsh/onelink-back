package com.onelink.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onelink.app.models.Red;

@Repository

public interface RedRepo extends JpaRepository<Red, Integer> {
    
    }


    

