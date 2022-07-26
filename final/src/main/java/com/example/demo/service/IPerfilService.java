
package com.example.demo.service;

import com.example.demo.models.Perfil;
import com.example.demo.models.Usuario;

public interface IPerfilService{
    
    public void crearPerfil(Usuario user);
    
    
    
    public Perfil mostrarPerfil(Long id);
}
