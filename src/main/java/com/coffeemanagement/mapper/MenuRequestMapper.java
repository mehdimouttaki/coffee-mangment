package com.coffeemanagement.mapper;

import com.coffeemanagement.dto.request.MenuRequest;
import com.coffeemanagement.model.Menu;
import com.coffeemanagement.utils.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MenuRequestMapper extends GenericMapper<Menu, MenuRequest> {
    @Override
    @Mapping(source = "category.id",target = "category")
    MenuRequest sourceToTarget(Menu source) throws Exception, IllegalAccessException;

    @Override
    @Mapping(target = "category.id",source = "category")
    Menu targetToSource(MenuRequest target);
}
