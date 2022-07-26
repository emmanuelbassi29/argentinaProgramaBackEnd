
package com.example.demo.service;

import com.example.demo.models.Social;
import com.example.demo.models.Usuario;


public interface ISocialService {
   
    void crearSocial(Usuario user);
    
    Social mostrarSocial(Long id);
    
    Social editarSocial(Long id, Social social);
    
    
}
