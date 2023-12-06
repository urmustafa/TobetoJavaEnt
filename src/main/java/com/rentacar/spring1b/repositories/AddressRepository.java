package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
