package com.coffeemanagement.controller;

import com.coffeemanagement.dto.request.OrderRequest;
import com.coffeemanagement.dto.response.OrderResponse;
import com.coffeemanagement.service.OrderService;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController {
    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public OrderResponse createOrder(@RequestBody OrderRequest orderRequest) throws Exception {
        return orderService.creatOrder(orderRequest);

    }
}
