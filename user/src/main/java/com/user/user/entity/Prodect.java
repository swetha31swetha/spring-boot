package com.user.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Prodect {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private int id;
    @Column(name="product_name")
    private String name;
    @Column(name="product_price")
    private int price;
    @Column(name="product_qly")
    private int qly;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk")
    private Customer Customer;

}
