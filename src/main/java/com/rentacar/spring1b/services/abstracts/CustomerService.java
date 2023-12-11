package com.rentacar.spring1b.services.abstracts;

import com.rentacar.spring1b.entities.Customer;
import com.rentacar.spring1b.services.dtos.requests.customer.AddCustomerRequest;
import com.rentacar.spring1b.services.dtos.requests.customer.UpdateCustomerRequest;
import com.rentacar.spring1b.services.dtos.responses.customer.GetCustomerListResponse;
import com.rentacar.spring1b.services.dtos.responses.customer.GetCustomerResponse;

import java.util.List;

public interface CustomerService {
    List<GetCustomerListResponse> getAll();
    GetCustomerResponse getById(int id);
    void add(AddCustomerRequest addUserRequest);
    void update(int id, UpdateCustomerRequest updateCustomerRequest);
    void delete(int id);
    List<GetCustomerListResponse> getCustomerByName(String firstName, String lastName);
}
