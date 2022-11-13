package com.bjtaga.apirest.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UsersDTO implements Serializable {
    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private Date createAt;
    private Date updateAt;
}
