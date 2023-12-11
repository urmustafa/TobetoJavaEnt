package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.services.abstracts.CustomerService;
import com.rentacar.spring1b.services.dtos.requests.customer.AddCustomerRequest;
import com.rentacar.spring1b.services.dtos.requests.customer.UpdateCustomerRequest;
import com.rentacar.spring1b.services.dtos.responses.customer.GetCustomerListResponse;
import com.rentacar.spring1b.services.dtos.responses.customer.GetCustomerResponse;
import com.rentacar.spring1b.entities.Customer;
import com.rentacar.spring1b.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<GetCustomerListResponse> getAll() {
        return customerService.getAll();
    }

    @GetMapping("{id}")
    public GetCustomerResponse getById(@PathVariable int id) {
        return customerService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody AddCustomerRequest addCustomerRequest) {
        customerService.add(addCustomerRequest);
    }

    @PutMapping
    public void update(@PathVariable int id, UpdateCustomerRequest updateCustomerRequest) {
        customerService.update(id, updateCustomerRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        customerService.delete(id);
    }
    @GetMapping("/search")
    public List<GetCustomerListResponse> getUsersByNames(
            @RequestParam String firstName,
            @RequestParam String lastName) {
        return this.customerService.getCustomerByName(firstName, lastName);
    }





}



