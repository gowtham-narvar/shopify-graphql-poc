package com.shopify.graphql.model.shopify.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
   private ProductData data;
   private Extensions extensions;
}