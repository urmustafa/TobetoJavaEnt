package com.rentacar.spring1b.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name = "order")
@Entity
@Data
public class Order {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "payment_type")
    private String paymentType;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
