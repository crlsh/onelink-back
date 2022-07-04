package com.onelink.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.onelink.app.models.Persona;

public interface IPersonaService {
    
    public List<Persona> getAllPersonas();

    public ResponseEntity <Persona> getById(int id);

    public Persona save (Persona personas); 

    public boolean delete (int id); 

    List <Persona> search(String filtro) throws Exception;

    /* List <?> searchPersonaRedes(Integer filtro) throws Exception; */

}
