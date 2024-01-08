package com.coffeemanagement.service;

import com.coffeemanagement.dto.request.MenuRequest;
import com.coffeemanagement.dto.response.MenuResponse;

public interface MenuService {
    MenuResponse createMenu(MenuRequest menuRequest) throws Exception;
}
