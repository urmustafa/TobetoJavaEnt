package com.rentacar.spring1b.dtos.responses.order;

import com.rentacar.spring1b.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderListResponse {
    private List<Order> order;
}
