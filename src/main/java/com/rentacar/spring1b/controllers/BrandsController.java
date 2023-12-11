package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.services.abstracts.BrandService;
import com.rentacar.spring1b.services.dtos.requests.brand.AddBradRequest;
import com.rentacar.spring1b.services.dtos.requests.brand.UpdateBrandRequest;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandListResponse;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandResponse;
import com.rentacar.spring1b.entities.Brand;
import com.rentacar.spring1b.repositories.BrandRepositoriy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {

    private final BrandService brandService;
    @GetMapping
    public List<GetBrandListResponse> getByName(@RequestParam String name,@RequestParam int id){
        return this.brandService.getByName(name,id);
    }


    @GetMapping("{id}")
    public GetBrandResponse getById(@PathVariable int id){
        return brandService.getById(id);
    }
    @PostMapping
    public void add(@RequestBody AddBradRequest request){
        brandService.add(request);
    }

    @GetMapping("search")
    public List<GetBrandListResponse> search(@RequestParam String name){
        //return this.brandService.search(name);
        return  null;
    }
    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody UpdateBrandRequest updateBrandsRequest) {
        brandService.update(id, updateBrandsRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        brandService.delete(id);
    }


}
