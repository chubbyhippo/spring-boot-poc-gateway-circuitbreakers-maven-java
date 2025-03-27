package io.github.chubbyhippo.webapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ResClientConfig {
    @Bean
    RestClient restClient() {
        return RestClient.builder().build();
    }
}
