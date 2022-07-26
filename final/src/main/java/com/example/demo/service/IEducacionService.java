
package com.example.demo.service;

import com.example.demo.models.Educacion;
import java.util.List;


public interface IEducacionService {
    
    List<Educacion> mostrarEdu(Long id);
    
    List<Educacion> crearEdu(Long id, Educacion edu);

    List<Educacion> editarEdu(Long id, Educacion edu);
   
   void deleteEdu(Long id);

   
}
