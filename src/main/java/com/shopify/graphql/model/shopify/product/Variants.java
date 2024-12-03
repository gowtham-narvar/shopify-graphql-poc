package com.shopify.graphql.model.shopify.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Variants {
    private PageInfo pageInfo;
    private List<ProductVariantEdge> edges;
}