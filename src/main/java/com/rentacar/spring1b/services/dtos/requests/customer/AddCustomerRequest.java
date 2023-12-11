package com.rentacar.spring1b.services.dtos.requests.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCustomerRequest {
    private String name;
    private String surname;
    private String email;
    private String phone;
}
