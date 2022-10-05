package com.burle.observability;


import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
@SpringBootApplication
public class PrometheusIntegrationApplication {

    final static Logger logger = LoggerFactory.getLogger(PrometheusIntegrationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PrometheusIntegrationApplication.class, args);
    }

    @GetMapping("/something")
    public ResponseEntity<String> createLogs() {
        logger.warn("Just checking");
        return ResponseEntity.ok().body("All Ok");
    }
}
