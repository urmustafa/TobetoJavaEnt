package com.rentacar.spring1b.services.concretes;

import com.rentacar.spring1b.entities.Car;
import com.rentacar.spring1b.repositories.CarRepository;
import com.rentacar.spring1b.services.abstracts.CarService;
import com.rentacar.spring1b.services.dtos.requests.car.AddCarRequest;
import com.rentacar.spring1b.services.dtos.requests.car.UpdateCarRequest;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarListResponse;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class CarManager implements CarService {
    private final CarRepository carRepository;
    @Override
    public List<GetCarListResponse> getAll() {
        List<Car> carsList = carRepository.findAll();
        List<GetCarListResponse> carsListResponses = new ArrayList<>();
        for (Car car: carsList) {
            GetCarListResponse carsListResponse = new GetCarListResponse();

            carsListResponses.add(carsListResponse);
        }

        return carsListResponses;
    }

    @Override
    public List<GetCarListResponse> search(String search) {
        return carRepository.search(search);
    }

    @Override
    public GetCarResponse getById(int id) {
        Car cars = carRepository.findById(id).orElseThrow();
        GetCarResponse dto = new GetCarResponse();
        dto.setName(cars.getModelName());
        return dto;
    }

    @Override
    public void add(AddCarRequest request) {
        Car car=new Car();

    }

    @Override
    public void update(int id, UpdateCarRequest updateCar) {
        Car car = carRepository.findById(id).orElseThrow();
        car.setColor(updateCar.getColor());
        car.setModelYear(updateCar.getYear());
        car.setModelName(updateCar.getName());
        carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        carRepository.deleteById(id);
    }
}
