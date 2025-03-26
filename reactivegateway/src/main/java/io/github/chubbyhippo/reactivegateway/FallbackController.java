package io.github.chubbyhippo.reactivegateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/fallback")
    Mono<String> fallbackHello() {
        return Mono.just("hello from fallback gateway");
    }
}
