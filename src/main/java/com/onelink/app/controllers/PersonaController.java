package com.onelink.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onelink.app.models.Persona;
import com.onelink.app.service.PersonaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/persona")

public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getById(@PathVariable(value = "id") int id) {
    return personaService.getById(id);
    }

    @PostMapping
    public Persona save(@Validated @RequestBody Persona persona) {
        return personaService.save(persona);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Persona> update(@PathVariable(value = "id") int id, @Validated @RequestBody Persona persona) {
        if (id == persona.getIdpersonas()){
            Persona mute = personaService.save(persona);
            return ResponseEntity.ok().body(mute);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Persona> delete(@PathVariable int id){
        boolean ok = personaService.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) {
        try {            
            return ResponseEntity.status(HttpStatus.OK).body(personaService.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" + e.getMessage() + "\"}"));
        }
    }


}
