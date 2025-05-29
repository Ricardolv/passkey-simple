package dev.richard.infrastructure.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardResource {

    @GetMapping
    public String index() {
        return "Hello World";
    }
}
