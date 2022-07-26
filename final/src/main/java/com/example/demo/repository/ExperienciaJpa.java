
package com.example.demo.repository;

import com.example.demo.models.Experiencia;
import com.example.demo.models.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaJpa extends JpaRepository<Experiencia,Long >{
    
    List<Experiencia> findByUserOrderByFechaFDesc(Usuario user);
    
    
}
