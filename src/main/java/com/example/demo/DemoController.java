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

    @PostMapping("/11")
    public String createUser(@RequestBody @Valid DemoDto demoDto, BindingResult bindingResult) {
        // Khi đã vào được trong đây thì userDto luôn hợp lệ
        // BindingResult bindingResult là một tham số quan trọng trong Spring Framework để xử lý lỗi liên quan đến dữ liệu người dùng nhập vào
        //va  xu ly theo cach ban muon
        if (bindingResult.hasErrors()) {
            // Xử lý lỗi ở đây, ví dụ gửi trả lỗi tới người dùng hoặc thực hiện các hành động cần thiết
            Map<String, String> errors= new HashMap<>();

            bindingResult.getFieldErrors().forEach(
                    error -> errors.put(error.getField(), error.getDefaultMessage())
            );

            String errorMsg= "";

            for(String key: errors.keySet()){
                errorMsg+= "Lỗi ở: " + key + ", lí do: " + errors.get(key) + "\n";
            }
            return errorMsg;
        }
        return null ;
    }

}
