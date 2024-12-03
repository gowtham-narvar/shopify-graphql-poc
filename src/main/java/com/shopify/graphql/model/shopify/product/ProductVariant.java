package com.shopify.graphql.model.shopify.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariant {
    private String id;
    private ProductId product_id;
    private String title;
    private String price;
    private int position;
    private String inventory_policy;
    private String compare_at_Price;
    private boolean taxable;
    private Instant createdAt;
    private Instant updatedAt;
    private String barcode;
    private String sku;
    private InventoryItem inventoryItem;
    private int inventoryQuantity;
    private Object image;
}