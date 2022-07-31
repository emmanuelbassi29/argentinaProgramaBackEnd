
package com.example.demo.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    private String nombre;
    private String profesion;
    private String mail;
    private String password;
    
  
    
    public Usuario (Long Id, String nombre, String profesion, String mail, String password) {this.Id = Id;
        this.nombre = nombre;
        this.profesion = profesion;
        this.mail = mail;
        this.password = password;
}

    public Usuario() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password){
        boolean p;
        if (this.password.equals(password)){
        p = true;
        }
        else {
        p = false;
        }
        
        return p;
    } 
   
    
    
}

