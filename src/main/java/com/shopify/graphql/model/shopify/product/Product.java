package com.shopify.graphql.model.shopify.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String id;
    private String title;
    private String bodyHtml;
    private String vendor;
    private String productType;
    private Instant createdAt;
    private String handle;
    private Instant updatedAt;
    private Instant publishedAt;
    private String templateSuffix;
    private List<String> tags;
    private String status;
    private ProductMedia media;
    private Variants variants;
    private List<Option> options;
}