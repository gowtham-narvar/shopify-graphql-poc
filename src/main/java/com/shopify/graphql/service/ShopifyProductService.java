package com.shopify.graphql.service;

import com.shopify.graphql.client.ShopifyGraphqlClient;
import com.shopify.graphql.constant.query.ProductQuery;
import com.shopify.graphql.model.shopify.product.Products;
import com.shopify.graphql.util.QueryUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShopifyProductService {

    @Autowired
    ShopifyGraphqlClient shopifyGraphqlClient;

    private static final String GQL_QUERY = "products";

    public Products getProducts() {
        return shopifyGraphqlClient.query(QueryUtils.getQuery(ProductQuery.BASIC_PRODUCTS_FILTER, ProductQuery.BASIC_PRODUCT_PROJECTION)
                , GQL_QUERY
                , Products.class);
    }
}
