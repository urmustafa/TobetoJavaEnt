package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.dtos.requests.brand.AddBradRequest;
import com.rentacar.spring1b.dtos.requests.brand.UpdateBrandRequest;
import com.rentacar.spring1b.dtos.responses.brand.GetBrandListResponse;
import com.rentacar.spring1b.dtos.responses.brand.GetBrandResponse;
import com.rentacar.spring1b.entities.Brand;
import com.rentacar.spring1b.repositories.BrandRepositoriy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {

    private final BrandRepositoriy brandRepositoriy;
    public BrandsController(BrandRepositoriy brandRepositoriy){
        this.brandRepositoriy=brandRepositoriy;
    }

    @GetMapping
    public GetBrandListResponse getAll(){
        GetBrandListResponse getBrandListResponse=new GetBrandListResponse();
        getBrandListResponse.setBrands(brandRepositoriy.findAll());
        return getBrandListResponse;
    }

    @GetMapping("{id}")
    public GetBrandResponse getByID(@PathVariable int id){
        Brand brand= brandRepositoriy.findById(id).orElseThrow();
        GetBrandResponse dto=new GetBrandResponse();
        dto.setName(brand.getName());
        return dto;
    }
    @PostMapping
    public void add(@RequestBody AddBradRequest request){
        Brand brand=new Brand();
        brand.setName(request.getName());
        brandRepositoriy.save(brand);
    }
    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest, @PathVariable int id){
        Brand existingBrand = brandRepositoriy.findById(id).orElseThrow();
        existingBrand.setName(updateBrandRequest.getName());
        brandRepositoriy.save(existingBrand);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        //Brand brandToDelete=brandRepositoriy.findById(id).orElseThrow();

        brandRepositoriy.deleteById(id);
    }
}
