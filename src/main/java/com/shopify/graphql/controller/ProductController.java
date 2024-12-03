package com.shopify.graphql.controller;

import com.shopify.graphql.model.shopify.product.Products;
import com.shopify.graphql.service.ShopifyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ShopifyProductService shopifyProductService;

    @GetMapping("shopify/poc/products")
    public Products getProducts() {
        return shopifyProductService.getProducts();
    }
}