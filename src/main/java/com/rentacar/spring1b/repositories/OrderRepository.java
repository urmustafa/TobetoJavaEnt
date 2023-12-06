package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Customer;
import com.rentacar.spring1b.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
