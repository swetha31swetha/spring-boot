package com.socialmedia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name = "student_details")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name ="dob")
    private String dob;

    @Column(name ="age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_no")
    private String contactNo;
}