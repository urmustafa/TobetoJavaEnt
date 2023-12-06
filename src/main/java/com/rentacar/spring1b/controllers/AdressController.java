package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.dtos.requests.address.AddAdressRequest;
import com.rentacar.spring1b.dtos.requests.address.UpdateAdressRequest;
import com.rentacar.spring1b.dtos.responses.address.GetAdressListResponse;
import com.rentacar.spring1b.dtos.responses.address.GetAdressResponse;
import com.rentacar.spring1b.entities.Address;
import com.rentacar.spring1b.repositories.AddressRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/address")
public class AdressController {

    private final AddressRepository addressRepository;

    AdressController(AddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }
    @GetMapping
    public GetAdressListResponse getAll(){
        GetAdressListResponse adressListResponse=new GetAdressListResponse();
        adressListResponse.setAddresses(addressRepository.findAll());
        return adressListResponse;
    }
    @GetMapping("{id}")
    public GetAdressResponse getById(@PathVariable int id){
        Address address=addressRepository.findById(id).orElseThrow();
        GetAdressResponse adressResponse=new GetAdressResponse();
        adressResponse.setAddress(address.getAddressText());
        return adressResponse;
    }
    @PostMapping
    public void add(@RequestBody AddAdressRequest addAdressRequest){
        Address address=new Address();
        address.setAddressText(addAdressRequest.getAddress());

        addressRepository.save(address);
    }
    @PutMapping("{id}")
    public void update(@RequestBody UpdateAdressRequest updateAdressRequest,@PathVariable int id){
        Address address=addressRepository.findById(id).orElseThrow();
        address.setAddressText(updateAdressRequest.getAddress());

        addressRepository.save(address);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        addressRepository.deleteById(id);
    }
}
