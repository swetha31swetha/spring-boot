package com.company.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int employeeId;
    @Column(name = "name")
    private String employeeName;
    @Column(name = "age")
    private int employeeAge;
    @Column(name = "salary")
    private int employeeSalary;
}
