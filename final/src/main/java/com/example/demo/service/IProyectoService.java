
package com.example.demo.service;

import com.example.demo.models.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    List<Proyecto> crearProyecto(Long id, Proyecto pro);
    
    List<Proyecto> mostrarProyecto(Long id);
    
    List<Proyecto> editarProyecto(Long id,Proyecto pro);
    
    void deleteProyecto(Long id);
}
