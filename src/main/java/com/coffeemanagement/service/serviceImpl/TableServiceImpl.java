package com.coffeemanagement.service.serviceImpl;

import com.coffeemanagement.dto.request.TableRequest;
import com.coffeemanagement.dto.response.TableResponse;
import com.coffeemanagement.mapper.TableRequestMapper;
import com.coffeemanagement.mapper.TableResponseMapper;
import com.coffeemanagement.model.Table;
import com.coffeemanagement.repository.TableRepository;
import com.coffeemanagement.service.TableService;
import org.springframework.stereotype.Service;

@Service
public class TableServiceImpl implements TableService {
    private final TableRepository tableRepository;
    private final TableRequestMapper tableRequestMapper;
    private final TableResponseMapper tableResponseMapper;

    public TableServiceImpl(TableRepository tableRepository, TableRequestMapper tableRequestMapper, TableResponseMapper tableResponseMapper) {
        this.tableRepository = tableRepository;
        this.tableRequestMapper = tableRequestMapper;
        this.tableResponseMapper = tableResponseMapper;
    }

    @Override
    public TableResponse createTable(TableRequest tableRequest) throws Exception {
        Table table = tableRequestMapper.targetToSource(tableRequest);

        table.setFree(Boolean.TRUE);

      return   tableResponseMapper.sourceToTarget(tableRepository.save(table));

    }
}
