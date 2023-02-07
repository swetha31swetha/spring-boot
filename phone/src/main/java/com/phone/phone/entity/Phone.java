package com.phone.phone.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="phone_id")
    private int id;
    @Column(name="phone_name")
    private String name;
    @Column(name="phone_color")
    private String color;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="PhoneId")
    
    private List<Brand> brand;


}
