
package com.example.demo.controler;

import com.example.demo.models.Experiencia;
import com.example.demo.service.IExperienciaService;
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
public class ExperienciaControl {
   
    @Autowired
    IExperienciaService expSer;
    
    
    @PostMapping("experiencia/new/{id}")
    private List<Experiencia> addExp(@PathVariable long id,@RequestBody Experiencia exp){
    
    return expSer.crearExp(id, exp);
    
    }
    
    @GetMapping("experiencia/show/{id}")
    private List<Experiencia> showExp(@PathVariable Long id){
    
     return expSer.mostrarExp(id);
    }
    
    @PutMapping("experiencia/edit/{id}")
    private List<Experiencia> editExp(@PathVariable long id, @RequestBody Experiencia exp){
        
      return expSer.editarExp(id, exp);
    }
    
    @DeleteMapping("experiencia/delete/{id}")
    private void deleteExp(@PathVariable long id){
    
        expSer.deleteExp(id);
    }


}
