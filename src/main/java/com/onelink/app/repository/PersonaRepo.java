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
        value = "SELECT * FROM personas WHERE personas.idpersonas LIKE %:filtro%",
        nativeQuery = true
)
List <Persona> search(@Param("filtro") String filtro) throws Exception;
/* 
@Query(
        value = "SELECT personas.idpersonas, personas.apellido, personas.nombre, personas.correo, personas.user, redes.nombre, redes.link FROM personas LEFT JOIN redes ON idpersonas = personas_idpersonas WHERE idpersonas LIKE %:filtro%",
        nativeQuery = true
)
List <?> searchPersonaRedes(@Param("filtro") Integer filtro) throws Exception; */
@Query(
        value = "SELECT * FROM personas WHERE personas.nickname LIKE %:filtro%",
        nativeQuery = true
)
List <Persona> searchBynickname(@Param("filtro") String filtro) throws Exception;

}


    

