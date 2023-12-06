package com.rentacar.spring1b.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="customers")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;



    @Column(name = "surmane")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;


}
