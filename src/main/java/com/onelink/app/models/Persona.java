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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idpersonas;
    private String nombre;
    private String apellido;
    private String correo;
    private String user;
    private String pass;

    public Persona() {

    }
    public Persona(int idpersonas, String nombre, String apellido, String correo, String user, String pass) {
        this.idpersonas = idpersonas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.user = user;
        this.pass = pass;
    }
    public int getIdpersonas() {
        return this.idpersonas;
    }

    
}
