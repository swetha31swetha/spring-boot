package com.county.county.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="city2")
public class City2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int city2Id;
    @Column(name="name")
    private String cityName;
    @ManyToOne(cascade = CascadeType.ALL)
    private Country country;
}
