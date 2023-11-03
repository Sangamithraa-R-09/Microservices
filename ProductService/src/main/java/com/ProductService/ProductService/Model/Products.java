package com.ProductService.ProductService.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "products_seq", sequenceName = "products_seq", allocationSize = 1)
    private long id;
    private String productName;
    private String productDescription;
    private int price;

}
