package com.rentacar.spring1b.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="address")
@Data
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "address_text")
    private String addressText;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
