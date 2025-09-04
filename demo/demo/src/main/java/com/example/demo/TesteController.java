package com.example.demo;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("ping")
    public String ping() {

        User user = new User();

        return "pong";
    }
}
