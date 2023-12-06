package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
