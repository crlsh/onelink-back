package com.onelink.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onelink.app.models.Red;

@Repository

public interface RedRepo extends JpaRepository<Red, Integer> {
    
    //List <Red> findByPersonas_IdpersonasContaining(Integer filtro); //usando metodo de JPA

    /*------------------------------------------ */
    //usando consultas SQL
    @Query(
            value = "SELECT * FROM redes WHERE redes.personas_idpersonas LIKE %:filtro%",
            nativeQuery = true
    )
    List <Red> search(@Param("filtro") String filtro) throws Exception;

    }


    

