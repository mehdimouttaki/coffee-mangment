package com.coffeemanagement.service;

import com.coffeemanagement.dto.request.TableRequest;
import com.coffeemanagement.dto.response.TableResponse;

public interface TableService {
    TableResponse createTable(TableRequest tableRequest) throws Exception;
}
