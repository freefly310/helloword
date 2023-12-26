package com.bob.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/")
public class HelloWorld {

        @RequestMapping("/hello")
        public String hello() {
            return "Hello World!!!!";
        }
}
