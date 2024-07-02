package io.github.chubbyhippo.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@SpringBootApplication
public class WebapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}

}

@RestController
class HelloController {
	@GetMapping("/hello")
	String getHello(){
		return "Hello World";
	}


	@GetMapping("/delayedhello")
	String getDelayedHello() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(5));
		return "Hello World";
	}
}
