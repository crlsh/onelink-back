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
@Table(name= "personas")


public class Persona {
    
    /* @GeneratedValue(strategy = GenerationType.IDENTITY) */

    private String idpersonas;
    private String given_name;
    private String family_name;
    private String nickname;
    private String picture;
    private String descripcion;
    private String imagen_fondo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String background;
    private String theme;
   

    public Persona() {

    }
    public Persona(String idpersonas, 
                   String given_name, 
                   String family_name, 
                   String nickname, 
                   String picture,
                   String descripcion,
                   String imagen_fondo,
                   int id,
                   String background,
                   String theme) {
        this.idpersonas = idpersonas;
        this.given_name = given_name;
        this.family_name = family_name;
        this.nickname = nickname;
        this.picture = picture;
        this.descripcion = descripcion;
        this.imagen_fondo = imagen_fondo;
        this.id = id;
        this.background = background;
        this.theme = theme;
 
    }
      
}
