package com.games.games.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="children")
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="children_id")
    private int id;
    @Column(name="children_name")
    private String name;
    @Column(name="children_age")
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk")
    private Games Games;

}
