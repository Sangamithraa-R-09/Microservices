package com.ProductService.ProductService.Service;

import com.ProductService.ProductService.Dto.ProductsRequest;
import com.ProductService.ProductService.Model.Products;
import com.ProductService.ProductService.Repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductsService {

    private final ProductsRepository productsRepository;
    public void addProducts(ProductsRequest productsRequest) {
        Products productsRequest1=new Products();
        productsRequest1.setProductName(productsRequest.getProductName());
        productsRequest1.setProductDescription(productsRequest.getProductDescription());
        productsRequest1.setPrice(productsRequest.getPrice());
        productsRepository.save(productsRequest1);
        log.info("Product {} is added",productsRequest1.getId());
    }


    public List<Products> getProducts() {
        return this.productsRepository.findAll();
    }
}
