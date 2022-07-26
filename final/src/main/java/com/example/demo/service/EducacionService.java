
package com.example.demo.service;

import com.example.demo.models.Educacion;
import com.example.demo.models.Usuario;
import com.example.demo.repository.EducacionJpa;
import com.example.demo.repository.UsuarioJpa;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    EducacionJpa edujpa;
    @Autowired
    UsuarioJpa usujpa;
    
    
    @Override
    public List<Educacion> mostrarEdu(Long id) {
    
       Usuario user = usujpa.findById(id).orElse(null);
        
       List<Educacion> edus = new ArrayList<>();
       
       edus = edujpa.findByUser(user);
       
       return edus;
    }

    @Override
    public List<Educacion> crearEdu(Long id, Educacion edu) {
        
     Usuario user = usujpa.findById(id).orElse(null);
     
     Educacion educacion = edu;
     
     educacion.setUser(user);
     
        edujpa.save(educacion);
        
        return edujpa.findByUser(user);
        
    }

    @Override
    public List<Educacion> editarEdu(Long id, Educacion edu) {
                System.out.println((edu.getTitulo()));

        Educacion educacion = edujpa.findById(id).orElse(null);
        
        educacion.setImagen(edu.getImagen());
        educacion.setTitulo(edu.getTitulo());
        educacion.setFechaInicio(edu.getFechaInicio());
        educacion.setFechaFin(edu.getFechaFin());
        educacion.setDescripcion(edu.getDescripcion());
        
        edujpa.save(educacion);
        
        return edujpa.findByUser(educacion.getUser());
    }

    @Override
    public void deleteEdu(Long id) {
        
        edujpa.deleteById(id);
    }
   
    
}
