package com.onelink.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.onelink.app.models.Red;

public interface IRedService {
    
    public List<Red> getAllRed();
    
    public ResponseEntity <Red> getById(int id); 
    
    public Red save (Red red);
    
    public boolean delete (int id); 

    List <Red> search(Integer filtro) throws Exception;



}
