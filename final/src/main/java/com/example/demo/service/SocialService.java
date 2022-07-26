
package com.example.demo.service;

import com.example.demo.models.Social;
import com.example.demo.models.Usuario;
import com.example.demo.repository.SocialJpa;
import com.example.demo.repository.UsuarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialService implements ISocialService{

    @Autowired
    SocialJpa sojpa;
    @Autowired
    UsuarioJpa usujpa;
    
    @Override
    public void crearSocial(Usuario user) {
        Social social = new Social();
        social.setUser(user);
        sojpa.save(social);
    }

    @Override
    public Social mostrarSocial(Long id) {
        Usuario user = usujpa.findById(id).orElse(null);
        return sojpa.findByUser(user);
    }

    @Override
    public Social editarSocial(Long id, Social social) {
    
        Social soc = sojpa.findById(id).orElse(null);
        soc.setInstagram(social.getInstagram());
        soc.setGitHub(social.getGitHub());
        soc.setLinkedIn(social.getLinkedIn());
        
        sojpa.save(soc);
        return soc;
    }
    
    
    
}
