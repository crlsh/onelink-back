package com.onelink.app.models;

import javax.persistence.Column;
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
    private String nombre_red;
    private String link;
    private String icono;
    @Column(name = "personas_idpersonas")
    private String personas_idpersonas;

    public Red() {
    
    }
    
    public Red(int idredes, String nombre, String link, String icono, String personas_idpersonas) {
        this.idredes = idredes;
        this.nombre_red = nombre;
        this.link = link;
        this.icono = icono;
        this.personas_idpersonas = personas_idpersonas;
    }

}


