package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.dtos.requests.car.AddCarRequest;
import com.rentacar.spring1b.dtos.requests.car.UpdateCarRequest;
import com.rentacar.spring1b.dtos.responses.car.GetCarListResponse;
import com.rentacar.spring1b.dtos.responses.car.GetCarResponse;
import com.rentacar.spring1b.entities.Car;
import com.rentacar.spring1b.repositories.CarRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cars")
public class CarController {

    private final CarRepository carRepository;

    CarController(CarRepository carRepository){
        this.carRepository=carRepository;
    }
    @GetMapping
    public GetCarListResponse getAll(){
        GetCarListResponse carList=new GetCarListResponse();
        carList.setCars(carRepository.findAll());
        return carList;
    }
    @GetMapping("{id}")
    public GetCarResponse getById(@PathVariable int id){
        Car car=carRepository.findById(id).orElseThrow();
        GetCarResponse carDto=new GetCarResponse();

        carDto.setColor(car.getColor());
        carDto.setName(carDto.getName());
        carDto.setModelYear(car.getModelYear());
        return carDto;
    }
    @PostMapping
    public void add(@RequestBody AddCarRequest addCarRequest){
        Car car=new Car();
        car.setColor(addCarRequest.getColor());
        car.setModelYear(addCarRequest.getYear());
    }
    @PutMapping("{id}")
    public void update(@RequestBody UpdateCarRequest updateCarRequest,@PathVariable int id){
        Car car =carRepository.findById(id).orElseThrow();

        car.setModelYear(updateCarRequest.getYear());
        car.setModelName(updateCarRequest.getName());
        car.setColor(updateCarRequest.getColor());

        carRepository.save(car);
    }
    @DeleteMapping("{id}")
    public void delete (@PathVariable int id){
        carRepository.deleteById(id);
    }
}
