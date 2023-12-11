package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
