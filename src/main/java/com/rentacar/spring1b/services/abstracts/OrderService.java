package com.rentacar.spring1b.services.abstracts;

import com.rentacar.spring1b.entities.Order;
import com.rentacar.spring1b.services.dtos.requests.order.UpdateOrderRequest;
import com.rentacar.spring1b.services.dtos.responses.order.GetOrderListResponse;
import com.rentacar.spring1b.services.dtos.responses.order.GetOrderResponse;

import java.util.List;

public interface OrderService {
    List<GetOrderListResponse> getAll();
    GetOrderResponse getById(int id);
    void add(int id);
    void update(int id, UpdateOrderRequest updateOrderRequest);


}
