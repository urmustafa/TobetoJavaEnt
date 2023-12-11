package com.rentacar.spring1b.services.dtos.requests.address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddAdressRequest {
    private String address;
    private String postCode;
}
