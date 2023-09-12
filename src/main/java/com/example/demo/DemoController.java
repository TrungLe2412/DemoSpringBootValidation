package com.example.demo;


import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")

public class DemoController {

    @PostMapping("/addUser")
    public String createUser(@RequestBody @Valid DemoDto demoDto) {
        System.out.println(demoDto);
        return null ;
    }


}
