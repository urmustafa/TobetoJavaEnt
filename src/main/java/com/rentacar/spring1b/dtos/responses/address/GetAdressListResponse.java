package com.rentacar.spring1b.dtos.responses.address;

import com.rentacar.spring1b.entities.Address;
//import com.rentacar.spring1b.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAdressListResponse {
    private List<Address> addresses;
}
