package com.rentacar.spring1b.services.dtos.responses.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCustomerResponse {
    private String name;
    private String surname;
    private String email;
    private String phone;
}
