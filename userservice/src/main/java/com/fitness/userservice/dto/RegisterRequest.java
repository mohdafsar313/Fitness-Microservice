package com.fitness.userservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class RegisterRequest {
    @NotBlank(message = "email is required")
    @Email(message = "invalid email format")
    private String email;
    
    @NotBlank(message = "password is required")
    @Size(min=8,message = "password must have atleast 8 charecters")
    private String password;

    private String firstName;
    private String lastName;


}
