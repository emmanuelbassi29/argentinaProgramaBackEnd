
package com.example.demo.service;

import com.example.demo.models.Usuario;

public interface IUsuarioService {
    
    public void crearUser (Usuario user);
    
    public Usuario mostrarUser(Long id);
    
    public Usuario checkUser(String mail);
}
