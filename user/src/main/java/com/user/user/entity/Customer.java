package com.user.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_id")
    private int id;
    @Column(name="customer_name")
    private String name;
    @Column(name="customer_age")
    private int age;
    @Column(name="customer_address")
    private String address;



}
