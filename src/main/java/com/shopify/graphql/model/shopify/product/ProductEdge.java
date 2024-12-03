package com.shopify.graphql.model.shopify.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEdge {
    private String cursor;
    private Product node;
}