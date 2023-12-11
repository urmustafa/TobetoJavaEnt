package com.rentacar.spring1b.services.abstracts;

import com.rentacar.spring1b.services.dtos.requests.address.AddAdressRequest;
import com.rentacar.spring1b.services.dtos.requests.address.UpdateAdressRequest;
import com.rentacar.spring1b.services.dtos.responses.address.GetAdressListResponse;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandResponse;

import java.util.List;

public interface AddressService {
    GetBrandResponse getById(int id);
    void add(AddAdressRequest request);
    void update(int id, UpdateAdressRequest updateAdressRequest);
    void delete (int id);
    List<GetAdressListResponse> getByName(String name);
}
