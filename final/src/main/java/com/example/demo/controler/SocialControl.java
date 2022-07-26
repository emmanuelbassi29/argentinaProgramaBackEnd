
package com.example.demo.controler;

import com.example.demo.models.Social;
import com.example.demo.service.ISocialService;
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

public class SocialControl {
 @Autowired
 ISocialService socialSer;
    
 @GetMapping("social/show/{id}")
 private Social showSocial(@PathVariable Long id){
 
 return socialSer.mostrarSocial(id);
 }
 
 @PutMapping("social/edit/{id}")
 private Social editSocial(@PathVariable Long id, @RequestBody Social social){
 
 return socialSer.editarSocial(id, social);
 }
 
}
