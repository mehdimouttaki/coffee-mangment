package com.coffeemanagement.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequest {

    private Long tableNumber;

    private List<OrderItemRequest> orderItemRequests;
}
