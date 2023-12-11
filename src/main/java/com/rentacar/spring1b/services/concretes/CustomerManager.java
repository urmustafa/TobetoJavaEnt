package com.rentacar.spring1b.services.concretes;

import com.rentacar.spring1b.entities.Customer;
import com.rentacar.spring1b.repositories.CustomerRepository;
import com.rentacar.spring1b.services.abstracts.CustomerService;
import com.rentacar.spring1b.services.dtos.requests.customer.AddCustomerRequest;
import com.rentacar.spring1b.services.dtos.requests.customer.UpdateCustomerRequest;
import com.rentacar.spring1b.services.dtos.responses.customer.GetCustomerListResponse;
import com.rentacar.spring1b.services.dtos.responses.customer.GetCustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Data
@Service
public class CustomerManager implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public List<GetCustomerListResponse> getAll() {
        List<Customer> customers= customerRepository.findAll();
        List<GetCustomerListResponse> customerListResponses=new ArrayList<>();
        for (Customer customer:customers){
            GetCustomerListResponse customerListResponseList=new GetCustomerListResponse();
            customerListResponseList.setName(customer.getName());
            customerListResponseList.setLastName(customer.getSurname());

        }
        return customerListResponses;
    }

    @Override
    public GetCustomerResponse getById(int id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        GetCustomerResponse dto = new GetCustomerResponse();
        dto.setName(customer.getName());
        dto.setSurname(customer.getSurname());
        return dto;
    }

    @Override
    public void add(AddCustomerRequest addUserRequest) {

    }

    @Override
    public void update(int id, UpdateCustomerRequest updateCustomerRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<GetCustomerListResponse> getCustomerByName(String firstName, String lastName) {

        return null;
    }
}
