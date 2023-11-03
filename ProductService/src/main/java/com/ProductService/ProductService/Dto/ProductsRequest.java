package com.ProductService.ProductService.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsRequest {
    private String productName;
    private String productDescription;
    private int price;
}
