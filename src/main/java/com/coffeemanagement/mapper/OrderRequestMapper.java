package com.coffeemanagement.mapper;


import com.coffeemanagement.dto.request.OrderRequest;
import com.coffeemanagement.model.Order;
import com.coffeemanagement.utils.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderRequestMapper extends GenericMapper<Order, OrderRequest> {

    @Override
    @Mapping(source = "table",target = "tableNumber")
    OrderRequest sourceToTarget(Order source) throws Exception, IllegalAccessException;

    @Override
    @Mapping(target = "table",source = "tableNumber")
    Order targetToSource(OrderRequest target);
}
