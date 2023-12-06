package com.rentacar.spring1b.dtos.requests.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCarRequest {
    private String name;
    private String color;
    private int year;
}
