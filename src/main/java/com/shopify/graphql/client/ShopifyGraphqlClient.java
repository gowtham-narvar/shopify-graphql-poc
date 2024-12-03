package com.shopify.graphql.client;

import com.shopify.graphql.model.shopify.product.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

@Component
public class ShopifyGraphqlClient {

    @Autowired
    private HttpGraphQlClient graphqlClient;

    public Products query(String query) {
        return graphqlClient

                .document(query)
                .retrieve("products")
                .toEntity(Products.class)
                .block();
    }

    public <T> T query(String query, String gqlQuery, Class<T> clazz) {
        return graphqlClient
                .document(query)
                .retrieve(gqlQuery)
                .toEntity(clazz)
                .block();
    }
}
