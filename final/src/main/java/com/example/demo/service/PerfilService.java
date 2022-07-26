
package com.example.demo.service;

import com.example.demo.models.Perfil;
import com.example.demo.models.Usuario;
import com.example.demo.repository.PerfilJpa;
import com.example.demo.repository.UsuarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService{

    @Autowired
    PerfilJpa perjpa;
    @Autowired
    UsuarioJpa usa;
    
    @Override
    public void crearPerfil(Usuario user) {
        Perfil per = new Perfil();
        per.setUser(user);
        perjpa.save(per);

    }
  
    @Override
    public Perfil mostrarPerfil(Long id) {
        
        Usuario user = usa.findById(id).orElse(null);
        return perjpa.findByUser(user);
        
    }
    
}
