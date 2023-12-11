package com.rentacar.spring1b.services.abstracts;

import com.rentacar.spring1b.services.dtos.requests.car.AddCarRequest;
import com.rentacar.spring1b.services.dtos.requests.car.UpdateCarRequest;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarListResponse;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarResponse;

import java.util.List;

public interface CarService {
    List<GetCarListResponse> getAll();
    List<GetCarListResponse> search (String search);
    GetCarResponse getById(int id);
    void add (AddCarRequest request);
    void update (int id, UpdateCarRequest updateCar);
    void delete (int id);
}
