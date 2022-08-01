
package com.example.demo.service;

import com.example.demo.models.Skill;
import com.example.demo.models.Usuario;
import com.example.demo.repository.SkillJpa;
import com.example.demo.repository.UsuarioJpa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

    @Autowired
    SkillJpa skijpa;
    @Autowired
    UsuarioJpa usujpa;
    
    @Override
    public List<Skill> mostrarSkill(Long id) {
    
        Usuario user = usujpa.findById(id).orElse(null);
        
        return skijpa.findByUser(user);
        
    
    }

    @Override
    public void crearSkill(Long id, Skill ski) {
    
    Usuario user = usujpa.findById(id).orElse(null);
    
    Skill skill = ski;
    skill.setUser(user);
        skijpa.save(skill);
    
    }

    @Override
    public void eliminarSkill(Long id) {
        
        skijpa.deleteById(id);


    }
 
    
}
