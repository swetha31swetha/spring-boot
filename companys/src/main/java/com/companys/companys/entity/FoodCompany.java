package com.companys.companys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="food_company")
public class FoodCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int companyId;
    @Column(name="name")
    private String companyName;
    @Column(name="founder")
    private String companyFounder;
    @Column(name="customercare_no")
     private  int customerCareNo;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="company_id")
    private List<Products> products;
}
