package com.coffeemanagement.dto.response;

import com.coffeemanagement.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemResponse {

    private Category category;
    private String menu;
    private Double price;

}
