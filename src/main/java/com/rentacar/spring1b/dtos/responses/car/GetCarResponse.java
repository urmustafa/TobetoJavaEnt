package com.rentacar.spring1b.dtos.responses.car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCarResponse {
    private String name;
    private String color;
    private int modelYear;

}
