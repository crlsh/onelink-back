package com.onelink.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.onelink.app.models.Red;
import com.onelink.app.repository.RedRepo;

@Service
public class RedService {
  @Autowired
  RedRepo redRepo;


  public List<Red> getAllRed() {
    return (List<Red>) redRepo.findAll();
  }

  public ResponseEntity <Red> getById(int id) {
    Optional<Red> red = redRepo.findById(id);

    if (red.isPresent()) {
      return ResponseEntity.ok().body(red.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }


    public Red save (Red red) {
        return redRepo.save(red);
    }

    public boolean delete (int id) {
        try {
            redRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
