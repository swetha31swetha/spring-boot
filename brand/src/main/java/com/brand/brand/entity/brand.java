package com.brand.brand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="brand")

public class brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int brand_id;
    @Column(name="brand_color")
    private String color;
    @Column(name="brand_qly")
    private int qly;
}
