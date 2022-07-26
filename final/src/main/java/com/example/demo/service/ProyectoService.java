
package com.example.demo.service;

import com.example.demo.models.Proyecto;
import com.example.demo.models.Usuario;
import com.example.demo.repository.ProyectoJpa;
import com.example.demo.repository.UsuarioJpa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    ProyectoJpa projpa;
    @Autowired
    UsuarioJpa usujpa;
    
    @Override
    public List<Proyecto> crearProyecto(Long id, Proyecto pro) {

        Usuario user = usujpa.findById(id).orElse(null);
        
        Proyecto proyecto = pro;
        proyecto.setUser(user);
        projpa.save(proyecto);
        
        return projpa.findByUser(user);
    }

    @Override
    public List<Proyecto> mostrarProyecto(Long id) {
                
        Usuario user = usujpa.findById(id).orElse(null);

        return projpa.findByUser(user);
    }

    @Override
    public List<Proyecto> editarProyecto(Long id, Proyecto pro) {
        
        Proyecto proyecto = projpa.findById(id).orElse(null);
        proyecto.setTitulo(pro.getTitulo());
        proyecto.setImagen(pro.getImagen());
        proyecto.setDescripcion(pro.getDescripcion());
        projpa.save(proyecto);
        
        return projpa.findByUser(proyecto.getUser());

        
        
    }

    @Override
    public void deleteProyecto(Long id) {
        
        projpa.deleteById(id);
    
    }
    
    
    
}
