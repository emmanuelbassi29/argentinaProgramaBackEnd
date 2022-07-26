
package com.example.demo.repository;

import com.example.demo.models.Perfil;
import com.example.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilJpa extends JpaRepository<Perfil, Long>{

   Perfil findByUser(Usuario user); 
    
}
