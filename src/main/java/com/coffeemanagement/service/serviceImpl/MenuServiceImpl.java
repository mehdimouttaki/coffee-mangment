package com.coffeemanagement.service.serviceImpl;

import com.coffeemanagement.dto.request.MenuRequest;
import com.coffeemanagement.dto.response.MenuResponse;
import com.coffeemanagement.mapper.MenuRequestMapper;
import com.coffeemanagement.mapper.MenuResponseMapper;
import com.coffeemanagement.model.Category;
import com.coffeemanagement.model.Menu;
import com.coffeemanagement.repository.CategoryRepository;
import com.coffeemanagement.repository.MenuRepository;
import com.coffeemanagement.service.MenuService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;
    private final MenuRequestMapper menuRequestMapper;
    private final MenuResponseMapper menuResponseMapper;
    private final CategoryRepository categoryRepository;

    public MenuServiceImpl(MenuRepository menuRepository, MenuRequestMapper menuRequestMapper, MenuResponseMapper menuResponseMapper, CategoryRepository categoryRepository) {
        this.menuRepository = menuRepository;
        this.menuRequestMapper = menuRequestMapper;
        this.menuResponseMapper = menuResponseMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public MenuResponse createMenu(MenuRequest menuRequest) throws Exception {

        Menu menu = menuRequestMapper.targetToSource(menuRequest);
         categoryRepository.findById(menuRequest.getCategory()).orElseThrow();
        return menuResponseMapper.sourceToTarget(menuRepository.save(menu));

    }
}
