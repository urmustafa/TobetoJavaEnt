package com.rentacar.spring1b.services.concretes;

import com.rentacar.spring1b.entities.Order;
import com.rentacar.spring1b.repositories.OrderRepository;
import com.rentacar.spring1b.services.abstracts.OrderService;
import com.rentacar.spring1b.services.dtos.requests.order.UpdateOrderRequest;
import com.rentacar.spring1b.services.dtos.responses.order.GetOrderListResponse;
import com.rentacar.spring1b.services.dtos.responses.order.GetOrderResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class OrderManager implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public List<GetOrderListResponse> getAll() {
        List<Order> orders =orderRepository.findAll();
        for(Order order:orders){
            GetOrderListResponse orderListResponse=new GetOrderListResponse();

            //orderListResponse.setOrder(orders);
        }
        return null;
    }

    @Override
    public GetOrderResponse getById(int id) {
        return null;
    }

    @Override
    public void add(int id) {

    }

    @Override
    public void update(int id, UpdateOrderRequest updateOrderRequest) {

    }
}
