package com.rentacar.spring1b.services.dtos.requests.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderRequest {
    private LocalDate date;
    private LocalDate rentalStartDate;
    private LocalDate rentalEndDate;
}
