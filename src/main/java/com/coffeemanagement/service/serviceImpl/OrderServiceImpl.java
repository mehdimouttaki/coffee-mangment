package com.coffeemanagement.service.serviceImpl;

import com.coffeemanagement.dto.request.OrderItemRequest;
import com.coffeemanagement.dto.request.OrderRequest;
import com.coffeemanagement.dto.response.OrderResponse;
import com.coffeemanagement.enums.State;
import com.coffeemanagement.mapper.OrderRequestMapper;
import com.coffeemanagement.mapper.OrderResponseMapper;
import com.coffeemanagement.model.Menu;
import com.coffeemanagement.model.Order;
import com.coffeemanagement.model.OrderItem;
import com.coffeemanagement.repository.MenuRepository;
import com.coffeemanagement.repository.OrderRepository;
import com.coffeemanagement.service.OrderService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;
    private final MenuRepository menuRepository;
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRequestMapper orderRequestMapper, OrderResponseMapper orderResponseMapper, MenuRepository menuRepository, OrderRepository orderRepository) {
        this.orderRequestMapper = orderRequestMapper;
        this.orderResponseMapper = orderResponseMapper;
        this.menuRepository = menuRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderResponse creatOrder(OrderRequest orderRequest) throws Exception {
        Order order = orderRequestMapper.targetToSource(orderRequest);
        List<OrderItem> orderItems = new ArrayList<>();
        double totalPrice = 0.0; // Initialize total price to zero
        for (OrderItemRequest orderItemRequest : orderRequest.getOrderItemRequests()){
            OrderItem orderItem = new OrderItem();
            Menu menu = menuRepository.findById(orderItemRequest.getMenu()).orElseThrow(()->new Exception("Menu Id Not Found "));
            orderItem.setOrder(order);
            orderItem.setPrice(menu.getPrice());

            // Add the price of the current OrderItem to the total price
            totalPrice += orderItem.getPrice();
            // Add the created OrderItem to the list
            orderItems.add(orderItem);

        }

        // Set the list of OrderItems to the Order entity
        order.setOrderItems(orderItems);
        order.setPrice(totalPrice);
        order.setState(State.TODO);
        order.setOrderDate(LocalDateTime.now());


        return orderResponseMapper.sourceToTarget(orderRepository.save(order));

    }
}
