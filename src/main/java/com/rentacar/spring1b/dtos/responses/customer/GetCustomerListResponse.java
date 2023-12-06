package com.rentacar.spring1b.dtos.responses.customer;
import com.rentacar.spring1b.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCustomerListResponse {
    private List<Customer> customers;
}
