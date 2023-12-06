package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.dtos.requests.customer.AddCustomerRequest;
import com.rentacar.spring1b.dtos.requests.customer.UpdateCustomerRequest;
import com.rentacar.spring1b.dtos.responses.customer.GetCustomerListResponse;
import com.rentacar.spring1b.dtos.responses.customer.GetCustomerResponse;
import com.rentacar.spring1b.entities.Customer;
import com.rentacar.spring1b.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    @GetMapping
    public GetCustomerListResponse getAll(){
        GetCustomerListResponse customerList = new GetCustomerListResponse();
        customerList.setCustomers(customerRepository.findAll());
        return customerList;
    }


    @GetMapping("{id}")
    public GetCustomerResponse getById(@PathVariable int id){
        Customer customer = customerRepository.findById(id).orElseThrow();

        GetCustomerResponse customerDto = new GetCustomerResponse();
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
       // customerDto.setEmail(customer.getEmail());
        customerDto.setPhone(customer.getPhone());


        return customerDto;



    }

    @PostMapping
    public void add(@RequestBody AddCustomerRequest addCustomerRequest){
        Customer customer = new Customer();

        customer.setName(addCustomerRequest.getName());
        customer.setSurname(addCustomerRequest.getSurname());
       // customer.setEmail(addCustomerRequest.getEmail());
        customer.setPhone(addCustomerRequest.getPhone());

        customerRepository.save(customer);


    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateCustomerRequest updateCustomerRequest, @PathVariable int id){
        Customer customer = customerRepository.findById(id).orElseThrow();

        customer.setName(updateCustomerRequest.getName());
        customer.setSurname(updateCustomerRequest.getSurname());
        //customer.setEmail(updateCustomerRequest.getEmail());
        customer.setPhone(updateCustomerRequest.getPhone());

        customerRepository.save(customer);


    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        customerRepository.deleteById(id);
    }
}
