
package com.example.demo.controler;

import com.example.demo.models.Usuario;
import com.example.demo.service.IPerfilService;
import com.example.demo.service.ISocialService;
import com.example.demo.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class UsuarioControl {
    @Autowired
    IUsuarioService iuser;
    @Autowired
    IPerfilService perSer;
    @Autowired
    ISocialService socialSer;
    @GetMapping("/check/{mail}/{password}")
    public long checkUser(@PathVariable String mail,@PathVariable String password){
    
        long i;
       Usuario user = iuser.checkUser(mail);
        
        if(user != null){
           
           if( user.checkPassword(password)){
           i = user.getId();
           }
           else {
           i = 0;
           }
        }
        else{
        i = 0;
        }
        return i;
    }
    
   @GetMapping("/holis/{id}")
   public Usuario getUser(@PathVariable long id){
   
   return iuser.mostrarUser(id);
   }
   
   @PostMapping("/register")
   public long nuevo(@RequestBody Usuario user){
      
       iuser.crearUser(user);
       socialSer.crearSocial(user);
       perSer.crearPerfil(user);
       return user.getId();
   }
   
   @PutMapping("/editar/user/{id}")
   public Usuario editar(@PathVariable long id,@RequestBody Usuario user){
   
   Usuario usuario = iuser.mostrarUser(id);
   
   usuario.setNombre(user.getNombre());
   usuario.setMail(user.getMail());
   usuario.setPassword(user.getPassword());
   usuario.setProfesion(user.getProfesion());
   
   iuser.crearUser(usuario);
   return usuario;
   }
  
   @GetMapping("buscar/user/{mail}")
   public long buscarUser(@PathVariable String mail){
   
        long i;
       Usuario user = iuser.checkUser(mail);
       i = user.getId();
       return i;
       
   
   }
   }

