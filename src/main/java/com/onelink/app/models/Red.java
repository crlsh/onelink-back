package com.onelink.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity 
@Table(name = "redes")
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idredes;
    private String nombre;
    private String link;
    private String icono;
    private int personas_idpersonas;

    public Red() {
    
    }
    
    public Red(int idredes, String nombre, String link, String icono, int personas_idpersonas) {
        this.idredes = idredes;
        this.nombre = nombre;
        this.link = link;
        this.icono = icono;
        this.personas_idpersonas = personas_idpersonas;
    }
    

}


