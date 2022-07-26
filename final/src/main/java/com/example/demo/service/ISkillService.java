
package com.example.demo.service;

import com.example.demo.models.Skill;
import java.util.List;


public interface ISkillService {
    
    List<Skill> mostrarSkill(Long id);
    
    void crearSkill(Long id, Skill ski);
    
    void eliminarSkill(Long id);
}
