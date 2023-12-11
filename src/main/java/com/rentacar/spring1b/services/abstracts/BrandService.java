package com.rentacar.spring1b.services.abstracts;

import com.rentacar.spring1b.entities.Brand;
import com.rentacar.spring1b.services.dtos.requests.brand.AddBradRequest;
import com.rentacar.spring1b.services.dtos.requests.brand.UpdateBrandRequest;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandListResponse;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandResponse;

import java.util.List;

public interface BrandService {
    GetBrandResponse getAll();
    void add(AddBradRequest request);
    GetBrandResponse getById(int id);

    List<GetBrandListResponse> getByName(String name, int id);
    List<Brand> search(String name);
    void update(int id, UpdateBrandRequest updateBrands);
    void delete(int id);

}
