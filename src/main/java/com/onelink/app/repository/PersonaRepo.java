package com.onelink.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onelink.app.models.Persona;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer> {

}
    

