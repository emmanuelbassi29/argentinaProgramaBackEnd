
package com.example.demo.controler;

import com.example.demo.models.Educacion;
import com.example.demo.service.IEducacionService;
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
public class EducacionControl {
    @Autowired
    IEducacionService eduS;
    
    @GetMapping("educacion/show/{id}")
    private List<Educacion> mostrarEdu(@PathVariable Long id){
    
    return eduS.mostrarEdu(id);    
    }
    
    @PostMapping("educacion/add/{id}")
    private List<Educacion> crearEdu(@PathVariable Long id, @RequestBody Educacion edu){
    
     return eduS.crearEdu(id, edu);
        
    }
    
    @PutMapping("educacion/edit/{id}")
    private List<Educacion> editEdu(@PathVariable Long id,@RequestBody Educacion edu){
    
        return eduS.editarEdu(id, edu);
    
    }

    @DeleteMapping("educacion/delete/{id}")
    private void borrarEdu(@PathVariable Long id){
    
        eduS.deleteEdu(id);
    }
    
    
}
