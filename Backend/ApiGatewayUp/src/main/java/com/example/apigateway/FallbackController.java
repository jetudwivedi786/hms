package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
@GetMapping("/ownerFallback")
    public String orderFallback(){
        return "Owner service is down";
    }

    @GetMapping("/managerFallback")
    public String managerFallback(){
        return "Manager service is down";
    }

    @GetMapping("/receptionistFallback")
    public String receptionistFallback(){
        return "Receptionist service is down";
    }
}
