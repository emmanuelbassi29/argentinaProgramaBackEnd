
package com.example.demo.models;

import com.example.demo.models.Usuario;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Social {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String instagram;
    private String gitHub;
    private String linkedIn;
    
     @OneToOne
    @JoinColumn(name="usuario_id",referencedColumnName = "Id")
    private Usuario user;
     
    public Social(){}

    public Social(Long id, String instagram, String gitHub, String linkedIn) {
        this.id = id;
        this.instagram = instagram;
        this.gitHub = gitHub;
        this.linkedIn = linkedIn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    
    
    
}
