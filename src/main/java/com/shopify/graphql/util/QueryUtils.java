package com.shopify.graphql.util;

import com.shopify.graphql.constant.query.ProductQuery;

public class QueryUtils {

    public static String getQuery(String query, String projection) {
//        return String.format(ProductQuery.QUERY, ProductQuery.BASIC_PRODUCTS_FILTER, ProductQuery.BASIC_PRODUCT_PROJECTION);
        return String.format(ProductQuery.QUERY, query, projection);
    }
}
