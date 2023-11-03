package com.ProductService.ProductService.Controller;

import com.ProductService.ProductService.Dto.ProductsRequest;
import com.ProductService.ProductService.Model.Products;
import com.ProductService.ProductService.Service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @PostMapping("/add")
    public void addProducts(@RequestBody ProductsRequest productsRequest){
        this.productsService.addProducts(productsRequest);
    }

    @GetMapping("/get")
    public List<Products> getProducts(){
        return this.productsService.getProducts();
    }

}
