
package com.example.demo.controler;

import com.example.demo.models.Skill;
import com.example.demo.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin
public class SkillControl {
  @Autowired
  ISkillService skijpa;
  
  @GetMapping("skill/show/{id}")
  private List<Skill> showSkill(@PathVariable Long id){
  
  return skijpa.mostrarSkill(id);
  }

  @PostMapping("skill/add/{id}")
  private List<Skill> addSkill(@PathVariable Long id, @RequestBody Skill ski){
  
      skijpa.crearSkill(id, ski);
  return skijpa.mostrarSkill(id);
  }
  
  @DeleteMapping("skill/delete/{id}")
  private void deleteSkill(@PathVariable Long id){
  
      skijpa.eliminarSkill(id);
  
  }
    
}
