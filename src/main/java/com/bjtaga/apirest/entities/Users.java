package com.bjtaga.apirest.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="users")
public class Users implements Serializable {

    @Id
    @Column(name = "user_id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)// le da formato
    private Date createdAt;

    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)// le da formato
    private Date updateAt;

    @PrePersist
    public void prePersist(){
        this.createdAt = new Date();
    }

    @PreUpdate
    public void preUpdate(){
        this.updateAt= new Date();
    }
}
