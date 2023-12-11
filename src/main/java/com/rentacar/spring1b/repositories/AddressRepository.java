package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Address;
import com.rentacar.spring1b.services.dtos.responses.address.GetAdressListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Integer> {
    @Query("SELECT new com.rentacar.spring1b.services.dtos.responses.address.GetAdressListResponse(Address.addressText) FROM Address a WHERE LOWER(a.postalCode) LIKE CONCAT('%', LOWER(:postalcode), '%')")
    List<GetAdressListResponse> findByPostalCodeAndAddressText(String adressText);
    List<Address> findByPostalCodeAndAddressText(String adressText, int postalCode);
}
