package com.rentacar.spring1b.services.dtos.responses.order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderResponse {
    private LocalDate date;
    private LocalDate rentalStartDate;
    private LocalDate rentalEndDate;
}
