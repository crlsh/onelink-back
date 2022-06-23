package com.onelink.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onelink.app.models.Persona;


@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer> {

    @Query(
        value = "SELECT * FROM personas WHERE personas.user LIKE %:filtro%",
        nativeQuery = true
)
List <Persona> search(@Param("filtro") String filtro) throws Exception;

}


    

