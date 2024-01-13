package com.coffeemanagement.mapper;

import com.coffeemanagement.dto.request.TableRequest;
import com.coffeemanagement.model.Table;
import com.coffeemanagement.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TableRequestMapper extends GenericMapper<Table, TableRequest> {
}
