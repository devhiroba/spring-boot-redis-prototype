package com.devhiroba.prototype.springbootredis.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RegisterUserRequest {
    private String username;
}
