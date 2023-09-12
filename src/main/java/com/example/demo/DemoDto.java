package com.example.demo;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class DemoDto {
    @NotEmpty(message = "Thiếu username")
    private String username;

    @Email(message = "Email không hợp lệ")
    private String email;

    @NotEmpty(message = "Thiếu password")
    @Size(min = 8)
    private String password;

}
