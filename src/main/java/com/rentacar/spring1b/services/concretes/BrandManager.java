package com.rentacar.spring1b.services.concretes;

import com.rentacar.spring1b.entities.Brand;
import com.rentacar.spring1b.repositories.BrandRepositoriy;
import com.rentacar.spring1b.services.abstracts.BrandService;
import com.rentacar.spring1b.services.dtos.requests.brand.AddBradRequest;
import com.rentacar.spring1b.services.dtos.requests.brand.UpdateBrandRequest;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandListResponse;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private final BrandRepositoriy brandRepositoriy;
    @Override
    public void add(AddBradRequest request) {
        Brand brand=new Brand();
        brand.setName(request.getName());
        brandRepositoriy.save(brand);
    }
    public GetBrandResponse getAll(){
        GetBrandResponse dto=new GetBrandResponse();
        return dto;
    }

    @Override
    public GetBrandResponse getById(int id) {
        Brand brand= brandRepositoriy.findById(id).orElseThrow();
        GetBrandResponse dto=new GetBrandResponse();
        dto.setName(brand.getName());
        return dto;
    }

    @Override
    public List<GetBrandListResponse> getByName(String name, int id) {
        List<Brand> brands= brandRepositoriy.findByNameLikeOrIdEquals("%"+name+"%",id);
        List<GetBrandListResponse> response=new ArrayList<>();
        for(Brand brand:brands){
            response.add(new GetBrandListResponse(brand.getName()));
        }
        return response;
    }

    @Override
    public List<Brand> search(String name) {
        return brandRepositoriy.search( name);
    }

    @Override
    public void update(int id, UpdateBrandRequest updateBrands) {

    }

    @Override
    public void delete(int id) {

    }
}
