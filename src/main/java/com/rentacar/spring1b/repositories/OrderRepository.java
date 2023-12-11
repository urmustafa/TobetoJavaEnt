package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Customer;
import com.rentacar.spring1b.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByName(String name);
}
