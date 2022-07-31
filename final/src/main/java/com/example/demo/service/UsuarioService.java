
package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.models.Usuario;
import com.example.demo.repository.UsuarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    UsuarioJpa jpa;
    
    
    @Override
    public void crearUser(Usuario user) {
    jpa.save(user);
    }

    @Override
    public Usuario mostrarUser(Long id) {
        
        return jpa.findById(id).orElseThrow(() -> new ResourceNotFoundException("No se encontro ningun usuario"));
    }

    @Override
    public Usuario checkUser(String mail) {
       
        return jpa.findByMail(mail);
    }

    
    
    
}
