package com.example.securitydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxh
 * @date 2024-01-24 15:37
 * @since 1.0.0
 */
@RestController
public class TestApiController {

    @GetMapping(value = "/test")
    @PreAuthorize("hasRole('admin11')")
    public String test() {
        return "have auth";
    }
}
