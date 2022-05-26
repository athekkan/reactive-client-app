package com.spring.crud.reactiveclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Invoice {

    private Integer id;
    private String name;
    private String number;
    private Double amount;
}
