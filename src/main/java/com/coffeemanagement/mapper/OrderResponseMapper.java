package com.coffeemanagement.mapper;


import com.coffeemanagement.dto.response.OrderResponse;
import com.coffeemanagement.model.Order;
import com.coffeemanagement.utils.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderResponseMapper extends GenericMapper<Order, OrderResponse> {

    @Override
    @Mapping(source = "table",target = "tableNumber")
    OrderResponse sourceToTarget(Order source) throws Exception, IllegalAccessException;

    @Override
    @Mapping(target = "table",source = "tableNumber")
    Order targetToSource(OrderResponse target);
}
