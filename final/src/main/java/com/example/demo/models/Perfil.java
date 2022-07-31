package com.example.demo.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Basic
    private String descripcion;
    @Column(length= 500)
    private String banner;
    private String photo;
    
    @OneToOne
    @JoinColumn(name="usuario_id",referencedColumnName = "Id")
    private Usuario user;
    
  
    
  
    
    public Perfil() {
    }

    public Perfil(Long Id, String descripcion, String banner, String photo) {
        this.Id = Id;
        this.descripcion = descripcion;
        this.banner = banner;
        this.photo = photo;
       
    }
    
  
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    

    
    
    

}   

   
    
   
    
    
    
