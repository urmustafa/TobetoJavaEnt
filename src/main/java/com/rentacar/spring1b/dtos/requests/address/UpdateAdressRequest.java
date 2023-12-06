package com.rentacar.spring1b.dtos.requests.address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdressRequest {
    private String address;
    private String postCode;
}
