package com.whatrazvancooks.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(value = "/name")
    public String getName() {
        return "WhatRazvanCooks App";
    }

}
