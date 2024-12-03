package com.shopify.graphql.constant.query;

public class ProductQuery {
    public static final String QUERY = "query { %s  %s }";

    public static final String BASIC_PRODUCT_PROJECTION = "{\n" +
            "    pageInfo {\n" +
            "      hasNextPage\n" +
            "      endCursor\n" +
            "    }\n" +
            "    edges {\n" +
            "      cursor\n" +
            "      node {\n" +
            "       id\n" +
            "        title\n" +
            "        bodyHtml\n" +
            "        vendor\n" +
            "        productType\n" +
            "        createdAt\n" +
            "        handle\n" +
            "        updatedAt\n" +
            "        publishedAt\n" +
            "        templateSuffix\n" +
            "        tags\n" +
            "        status\n" +
            "        media(first: 250, query: \"media_type:IMAGE\") { \n" +
            "            pageInfo {\n" +
            "                hasNextPage\n" +
            "                endCursor\n" +
            "            }\n" +
            "            edges {\n" +
            "                node {\n" +
            "                    id\n" +
            "                    alt\n" +
            "                    preview {\n" +
            "                            image {\n" +
            "                                src\n" +
            "                            }\n" +
            "                        }\n" +
            "                    }\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        variants (first: 250){\n" +
            "            pageInfo {\n" +
            "                hasNextPage\n" +
            "                endCursor\n" +
            "            }\n" +
            "            edges {\n" +
            "                node {\n" +
            "                    id\n" +
            "                    product_id: product {\n" +
            "                        id\n" +
            "                    }\n" +
            "                    title\n" +
            "                    price\n" +
            "                    position\n" +
            "                    inventory_policy: inventoryPolicy\n" +
            "                    compare_at_Price: compareAtPrice\n" +
            "                    taxable\n" +
            "                    createdAt\n" +
            "                    updatedAt\n" +
            "                    barcode\n" +
            "                    sku\n" +
            "                    inventoryItem {\n" +
            "                                id\n" +
            "                    }\n" +
            "                    inventoryQuantity\n" +
            "                    image {\n" +
            "                        id\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "        options {\n" +
            "                id\n" +
            "                name\n" +
            "                position\n" +
            "                values\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }";

    public static final String BASIC_PRODUCTS_FILTER = "products(first: 10)";
}
