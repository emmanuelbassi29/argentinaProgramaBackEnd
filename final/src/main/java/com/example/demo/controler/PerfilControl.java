
package com.example.demo.controler;

import com.example.demo.models.Perfil;
import com.example.demo.repository.PerfilJpa;
import com.example.demo.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin
public class PerfilControl {
    
    @Autowired
    IPerfilService perSer;
    @Autowired
    PerfilJpa perjpa;
    
    @GetMapping("acercaDe/{id}")
    public Perfil getPerfil(@PathVariable Long id){
        
        return perSer.mostrarPerfil(id);
    
    }
    
    @PutMapping("editar/acercaDe/{id}")
    public Perfil editPerfil(@PathVariable Long id, @RequestBody Perfil per){
        
        
        Perfil perfil = perSer.mostrarPerfil(id);
        
        perfil.setPhoto(per.getPhoto());
        perfil.setBanner(per.getBanner());
        perfil.setDescripcion(per.getDescripcion());
        
        perjpa.save(perfil);
        return perfil;
    }
    
    
}
