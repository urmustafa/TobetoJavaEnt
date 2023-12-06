package com.rentacar.spring1b.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name="cars")
@Entity
@Data
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "model_year")
    private int modelYear;
    @Column(name="model_name")
    private String modelName;
    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private double price;

    //one - to - many

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @OneToMany (mappedBy = "car")
    List<Order> orders;



}
