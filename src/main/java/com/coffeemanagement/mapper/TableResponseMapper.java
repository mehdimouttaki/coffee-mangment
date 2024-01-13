package com.coffeemanagement.mapper;

import com.coffeemanagement.dto.response.TableResponse;
import com.coffeemanagement.model.Table;
import com.coffeemanagement.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TableResponseMapper extends GenericMapper<Table, TableResponse> {
}
