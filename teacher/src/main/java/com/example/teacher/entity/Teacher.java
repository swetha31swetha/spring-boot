package com.example.teacher.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int teacherId;
    @Column(name="name")
    private String teacherName;
    @Column(name="age")
    private int teacherAge;
    @Column(name="address")
    private String teacherAddress;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teacher_id")
    private List<Department> department;

}
