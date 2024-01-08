package com.coffeemanagement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {

    private Long orderId;
    private Long tableNumber;
    private Double price;
    private LocalDateTime orderDate;
    private List<OrderItemResponse> orderItemResponses;
}
