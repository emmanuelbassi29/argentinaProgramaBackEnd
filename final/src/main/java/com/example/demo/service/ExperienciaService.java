
package com.example.demo.service;

import com.example.demo.models.Experiencia;
import com.example.demo.models.Usuario;
import com.example.demo.repository.ExperienciaJpa;
import com.example.demo.repository.UsuarioJpa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    ExperienciaJpa expjpa;
    @Autowired
    UsuarioJpa jpa;
    
    
    @Override
    public List<Experiencia> crearExp(Long id, Experiencia exp) {
        Usuario user = jpa.findById(id).orElse(null);
        Experiencia expe = new Experiencia();        
        expe = exp;
        expe.setUser(user);
        expjpa.save(expe);
        return expjpa.findByUserOrderByFechaFDesc(user);
    }

    @Override
    public List<Experiencia> editarExp(Long id, Experiencia exp) {
  
        Experiencia expe = expjpa.findById(id).orElse(null);
        
        expe.setImagen(exp.getImagen());
        expe.setTitulo(exp.getTitulo());
        expe.setFechaI(exp.getFechaI());
        expe.setFechaF(exp.getFechaF());
        expe.setDescripcion(exp.getDescripcion());      
        expjpa.save(expe);
         
        return expjpa.findByUserOrderByFechaFDesc(expe.getUser());
    }

    @Override
    public void deleteExp(Long id) {
          
        expjpa.deleteById(id);
        
    } 

    @Override
    public List<Experiencia> mostrarExp(Long id) {
Usuario user = jpa.findById(id).orElse(null);

      
    
        
        return expjpa.findByUserOrderByFechaFDesc(user);
        
           }
}
