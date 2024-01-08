package com.coffeemanagement.service;

import com.coffeemanagement.dto.request.OrderRequest;
import com.coffeemanagement.dto.response.OrderResponse;

public interface OrderService {
    OrderResponse creatOrder(OrderRequest orderRequest) throws Exception;
}
