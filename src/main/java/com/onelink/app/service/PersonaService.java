package com.onelink.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.onelink.app.models.Persona;
import com.onelink.app.repository.PersonaRepo;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepo personasRepo;
    
    @Override
    public List<Persona> getAllPersonas() {
        return (List<Persona>) personasRepo.findAll();
    }

    @Override
    public ResponseEntity <Persona> getById(int id) {
        Optional<Persona> personas = personasRepo.findById(id);

        if (personas.isPresent()) {
            return ResponseEntity.ok().body(personas.get());
        } else {
            return ResponseEntity.notFound().build();
        }
           
    }

    @Override
    public Persona save (Persona personas) {
        return personasRepo.save(personas);
    }

    @Override
    public boolean delete (int id) {
        try {
            personasRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {            
              List<Persona> persona = personasRepo.search(filtro);                                     //usando consultas SQL
            return persona;
           } catch (Exception e) {
              throw new Exception(e.getMessage());      
           }
    }

    @Override
    public List<Persona> searchBynickname(String filtro) throws Exception {
        try {            
            List<Persona> persona = personasRepo.searchBynickname(filtro);                                     //usando consultas SQL
          return persona;
         } catch (Exception e) {
            throw new Exception(e.getMessage());      
         }
    }

    /* @Override
    public List<?> searchPersonaRedes(Integer filtro) throws Exception {
        try {            
            List<?> persona = personasRepo.searchPersonaRedes(filtro);                                     //usando consultas SQL
          return persona;
         } catch (Exception e) {
            throw new Exception(e.getMessage());      
         }
    } */
}
