package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.services.abstracts.CarService;
import com.rentacar.spring1b.services.dtos.requests.car.AddCarRequest;
import com.rentacar.spring1b.services.dtos.requests.car.UpdateCarRequest;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarListResponse;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarResponse;
import com.rentacar.spring1b.entities.Car;
import com.rentacar.spring1b.repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("search")
    public List<GetCarListResponse> search (@RequestParam String search){
        return this.carService.search(search);
    }
    @GetMapping
    public List<GetCarListResponse> getAll(){

        return carService.getAll();
    }
    @GetMapping("{id}")
    public GetCarResponse getById(@PathVariable int id) {

        return carService.getById(id);
    }
    @PostMapping
    public void add(@RequestBody AddCarRequest addCarsRequest) {
        carService.add(addCarsRequest);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, UpdateCarRequest updateCarsRequest) {
        carService.update(id, updateCarsRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        carService.delete(id);
    }
}
