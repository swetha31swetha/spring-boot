package com.brand.brand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int laptopId;
    @Column(name="laptop_name")
    private String name;
    @Column(name="laptop_price")
    private int price;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="brand_id")
    private List<brand>brand;
}
