package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.services.abstracts.AddressService;
import com.rentacar.spring1b.services.dtos.requests.address.AddAdressRequest;
import com.rentacar.spring1b.services.dtos.requests.address.UpdateAdressRequest;
import com.rentacar.spring1b.services.dtos.responses.address.GetAdressListResponse;
import com.rentacar.spring1b.services.dtos.responses.address.GetAdressResponse;
import com.rentacar.spring1b.entities.Address;
import com.rentacar.spring1b.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
@AllArgsConstructor
public class AdressController {

    //private final AddressService addressService;



}
