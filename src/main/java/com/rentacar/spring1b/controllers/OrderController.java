package com.rentacar.spring1b.controllers;

import com.rentacar.spring1b.services.dtos.requests.order.AddOrderRequest;
import com.rentacar.spring1b.services.dtos.requests.order.UpdateOrderRequest;
import com.rentacar.spring1b.services.dtos.responses.order.GetOrderListResponse;
import com.rentacar.spring1b.services.dtos.responses.order.GetOrderResponse;
import com.rentacar.spring1b.entities.Order;
import com.rentacar.spring1b.repositories.OrderRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
public class OrderController {
    private final OrderRepository orderRepository;


    public OrderController(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }
    @GetMapping
    public GetOrderListResponse getAll(){
        GetOrderListResponse orderListResponse = new GetOrderListResponse();
        orderListResponse.setOrder(orderRepository.findAll());
        return orderListResponse;
    }

    @GetMapping("{id}")
    public GetOrderResponse getById(@PathVariable int id){
        Order order = orderRepository.findById(id).orElseThrow();


        GetOrderResponse getOrderResponse = new GetOrderResponse();
        //getOrderResponse.setDate(order.getDate());


        return getOrderResponse;

    }

    @PostMapping
    public void add(@RequestBody AddOrderRequest addOrderRequest){
        Order order = new Order();

        //order.setDate(addOrderRequest.getDate());


        orderRepository.save(order);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateOrderRequest updateOrderRequest, @PathVariable int id){
        Order order = orderRepository.findById(id).orElseThrow();


       // order.setDate(updateOrderRequest.getDate());

        orderRepository.save(order);

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        orderRepository.deleteById(id);
    }
}
