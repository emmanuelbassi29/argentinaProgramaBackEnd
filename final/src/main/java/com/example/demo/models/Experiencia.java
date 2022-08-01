
package com.example.demo.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Experiencia {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;   
 @Basic
 private String imagen;
 private String titulo;
 private String fechaI;
 private String fechaF;
 private String descripcion;
 
 @ManyToOne
 @JoinColumn(name="usuario_id",referencedColumnName = "Id")
 private Usuario user;
 
 public Experiencia(){}

    public Experiencia(Long id, String imagen, String titulo, String fechaI, String fechaF, String descripcion) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    

}
