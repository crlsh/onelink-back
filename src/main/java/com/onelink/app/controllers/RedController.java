package com.onelink.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.onelink.app.models.Red;
import com.onelink.app.service.RedService;

public class RedController {
    @Autowired
    private RedService redService;

    @GetMapping
    public List<Red> getAllReds() {
        return redService.getAllRed();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Red> getById(@PathVariable(value = "id") int id) {
    return redService.getById(id);
    }

    @PostMapping
    public Red save(@Validated @RequestBody Red Red) {
        return redService.save(Red);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Red> update(@PathVariable(value = "id") int id, @Validated @RequestBody Red red) {
        if (id == red.getIdredes()){
            Red mute = redService.save(red);
            return ResponseEntity.ok().body(mute);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Red> delete(@PathVariable int id){
        boolean ok = redService.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    
}
