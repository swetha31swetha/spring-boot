package com.county.county.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="city1")
public class City1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int city1Id;
    @Column(name="name")
    private String cityName;
    @ManyToOne(cascade = CascadeType.ALL)
    private Country country;
}
