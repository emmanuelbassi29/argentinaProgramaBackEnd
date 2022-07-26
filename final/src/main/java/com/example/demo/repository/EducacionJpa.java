
package com.example.demo.repository;

import com.example.demo.models.Educacion;
import com.example.demo.models.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionJpa extends JpaRepository<Educacion, Long>{
    
    List<Educacion> findByUser(Usuario user);
}
