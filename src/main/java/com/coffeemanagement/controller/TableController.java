package com.coffeemanagement.controller;

import com.coffeemanagement.dto.request.TableRequest;
import com.coffeemanagement.dto.response.TableResponse;
import com.coffeemanagement.service.TableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/table")
public class TableController {
    private final TableService tableService;


    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @PostMapping
   public ResponseEntity<TableResponse> createTable(@RequestBody TableRequest tableRequest) throws Exception {
    return new ResponseEntity<>(tableService.createTable(tableRequest),HttpStatus.CREATED);
    }
}
