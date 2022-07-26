
package com.example.demo.controler;

import com.example.demo.models.Proyecto;
import com.example.demo.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@CrossOrigin
public class ProyectoControl {
  
    @Autowired
    IProyectoService proser;
    
    @GetMapping("proyecto/show/{id}")
    private List<Proyecto> mostrarProyecto(@PathVariable Long id){
    
    return proser.mostrarProyecto(id);
    
    }
    
    @PostMapping("proyecto/add/{id}")
    private List<Proyecto> agregarProyecto(@PathVariable Long id,@RequestBody Proyecto pro){
    
    return proser.crearProyecto(id, pro);
    
    }
    
    @PutMapping("proyecto/edit/{id}")
    private List<Proyecto> editarProyecto(@PathVariable Long id, @RequestBody Proyecto pro){
    
    return proser.editarProyecto(id, pro);
    }
    
    @DeleteMapping("proyecto/delete/{id}")
    private void borrarProyecto(@PathVariable Long id){
    
    proser.deleteProyecto(id);
    }
    }
