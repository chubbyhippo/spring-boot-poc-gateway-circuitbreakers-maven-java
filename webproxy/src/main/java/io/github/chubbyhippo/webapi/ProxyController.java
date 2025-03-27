package io.github.chubbyhippo.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
class ProxyController {
    private final RestClient restClient;

    ProxyController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("/hello")
    String getHello() {
        return restClient.get()
                .uri("http://localhost:8081/delayedhello")
                .retrieve()
                .body(String.class);
    }

}
