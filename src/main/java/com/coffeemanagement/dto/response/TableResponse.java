package com.coffeemanagement.dto.response;

import com.coffeemanagement.enums.Floor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TableResponse {

    private Long number;

    private Long numberChair;

    private Floor floor;

    private Boolean free;
}
