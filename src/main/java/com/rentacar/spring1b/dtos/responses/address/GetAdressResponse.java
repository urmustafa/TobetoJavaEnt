package com.rentacar.spring1b.dtos.responses.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAdressResponse {
    private String address;
}
