package com.rentacar.spring1b.dtos.requests.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {
    private String name;
    private String surname;
    private String email;
    private String phone;
}
