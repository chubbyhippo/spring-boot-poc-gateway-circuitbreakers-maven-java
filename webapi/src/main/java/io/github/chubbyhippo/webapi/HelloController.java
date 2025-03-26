package io.github.chubbyhippo.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
class HelloController {
    @GetMapping("/hello")
    String getHello() {
        return "Hello!";
    }

    @GetMapping("/delayedhello")
    String getDelayedHello() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        return "Hello! from delayed";
    }

    @GetMapping("/error")
    String getErroredHello() {
        throw new IllegalStateException("error");
    }

    @GetMapping("/fallback")
    String getFallbackHello() {
        return "Hello! from fallback";
    }
}
