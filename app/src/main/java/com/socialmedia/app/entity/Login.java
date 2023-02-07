package com.socialmedia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "login")

public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name ="password")
    private String password;
    public void setAndEncryptPassword(String password) {
        setPassword(PasswordUtil.getEncryptedPassword(password));
    }
//
//    public void setAndEncryptPassword(String password) {
//        setPassword(PasswordUtil.getEncryptedPassword(password));
//    }
//PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

}
