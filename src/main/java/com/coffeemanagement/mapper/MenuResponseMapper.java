package com.coffeemanagement.mapper;

import com.coffeemanagement.dto.response.MenuResponse;
import com.coffeemanagement.model.Menu;
import com.coffeemanagement.utils.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MenuResponseMapper  extends GenericMapper<Menu, MenuResponse> {
    @Override
    @Mapping(source = "category.category",target = "category")
    @Mapping(source = "category.id",target = "categoryId")
    MenuResponse sourceToTarget(Menu source) throws Exception, IllegalAccessException;

    @Override
    @Mapping(target = "category.category",source = "category")
    @Mapping(target = "category.id",source = "categoryId")
    Menu targetToSource(MenuResponse target);
}
