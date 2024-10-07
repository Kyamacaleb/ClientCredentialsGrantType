package com.caleb.ClientCredentialsGrantType.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/client-resource")
    public String getResource() {
        return "This is client credentials grant type.";
    }
}
