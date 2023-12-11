package com.rentacar.spring1b.services.concretes;

import com.rentacar.spring1b.services.abstracts.AddressService;
import com.rentacar.spring1b.services.dtos.requests.address.AddAdressRequest;
import com.rentacar.spring1b.services.dtos.requests.address.UpdateAdressRequest;
import com.rentacar.spring1b.services.dtos.responses.address.GetAdressListResponse;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandResponse;

import java.util.List;

public class AddressManager implements AddressService {
    @Override
    public GetBrandResponse getById(int id) {
        return null;
    }

    @Override
    public void add(AddAdressRequest request) {

    }

    @Override
    public void update(int id, UpdateAdressRequest updateAdressRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<GetAdressListResponse> getByName(String name) {
        return null;
    }
}
