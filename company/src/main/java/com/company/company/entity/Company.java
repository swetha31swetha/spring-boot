package com.company.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int companyId;
    @Column(name="name")
    private String companyName;
    @Column(name="address")
    private String companyAddress;
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name="company_id")
    private List<Employee> employee;
}
