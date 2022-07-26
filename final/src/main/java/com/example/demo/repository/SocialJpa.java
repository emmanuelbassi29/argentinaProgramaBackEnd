
package com.example.demo.repository;

import com.example.demo.models.Social;
import com.example.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialJpa extends JpaRepository<Social, Long>{
    
       Social findByUser(Usuario user); 

}
