package com.coffeemanagement.dto.request;

import com.coffeemanagement.enums.Floor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TableRequest {

    private Long number;

    private Long numberChair;

    private Floor floor;


}
