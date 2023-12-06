package com.rentacar.spring1b.dtos.responses.brand;

import com.rentacar.spring1b.entities.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBrandListResponse {
    private List<Brand> brands;
}
