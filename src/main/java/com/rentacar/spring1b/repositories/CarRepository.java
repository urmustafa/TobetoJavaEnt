package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Car;
import com.rentacar.spring1b.services.dtos.responses.car.GetCarListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {
    @Query("SELECT new com.rentacar.spring1b.services.dtos.responses.car.GetCarListResponse(c.modelName, c.modelYear, c.color) "+
            "FROM Car c WHERE c.modelName LIKE %:search%")
    List<GetCarListResponse> search(String carType);
}
