package com.rentacar.spring1b.dtos.responses.car;


import com.rentacar.spring1b.entities.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCarListResponse {
    private List<Car> cars;
}
