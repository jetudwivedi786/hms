package com.example.ApiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
@GetMapping("/orderFallback")
    public String orderFallback(){
        return "Order service is down";
    }

    @GetMapping("/shopFallback")
    public String shopFallback(){
        return "Shop service is down";
    }
}
