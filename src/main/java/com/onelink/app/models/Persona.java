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
    private String given_name;
    private String family_name;
    private String nickname;
    private String picture;
   

    public Persona() {

    }
    public Persona(int idpersonas, String given_name, String family_name, String nickname, String picture) {
        this.idpersonas = idpersonas;
        this.given_name = given_name;
        this.family_name = family_name;
        this.nickname = nickname;
        this.picture = picture;
 
    }
      
}
