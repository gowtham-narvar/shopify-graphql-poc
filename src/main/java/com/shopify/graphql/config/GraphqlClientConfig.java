package com.shopify.graphql.config;

import com.shopify.graphql.constant.GraphQueryConstants;
import com.shopify.graphql.util.ShopifyUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class GraphqlClientConfig {

    private static final String DEFAULT_TOKEN = "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";

    @Bean
    public HttpGraphQlClient graphqlClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl(ShopifyUtils.getBaseUrl(GraphQueryConstants.DEFAULT_STORE_NAME))
                .defaultHeader("X-Shopify-Access-Token", DEFAULT_TOKEN)
                .build();

        return HttpGraphQlClient.builder(webClient).build();
    }
}
