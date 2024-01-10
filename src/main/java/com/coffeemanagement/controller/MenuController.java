package com.coffeemanagement.controller;

import com.coffeemanagement.dto.request
        .MenuRequest;
import com.coffeemanagement.dto.response.MenuResponse;
import com.coffeemanagement.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/menu")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping
    public ResponseEntity<MenuResponse> createMenu(@RequestBody MenuRequest menuRequest) throws Exception {
        return new ResponseEntity<>(menuService.createMenu(menuRequest), HttpStatus.CREATED);

    }
}
