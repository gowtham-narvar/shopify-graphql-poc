package com.shopify.graphql.util;

import com.shopify.graphql.constant.GraphQueryConstants;

public class ShopifyUtils {

    public static String getStoreDomain(String storeName) {
        return String.format(GraphQueryConstants.SHOPIFY_STORE_DOMAIN, storeName);
    }

    public static String getBaseUrl(String storeName) {
        return String.format(GraphQueryConstants.SHOPIFY_BASE_URL, getStoreDomain(storeName));
    }
}
