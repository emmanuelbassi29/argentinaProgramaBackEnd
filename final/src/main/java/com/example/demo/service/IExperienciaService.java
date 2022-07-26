
package com.example.demo.service;

import com.example.demo.models.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
   
    
   List<Experiencia> crearExp(Long id, Experiencia exp);

   List<Experiencia> editarExp(Long id, Experiencia exp);
   
   void deleteExp(Long id);

    List<Experiencia> mostrarExp(Long id);
}
