package com.shopify.graphql.model.shopify.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThrottleStatus {
    private double maximumAvailable;
    private int currentlyAvailable;
    private double restoreRate;
}