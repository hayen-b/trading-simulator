package com.hayenb.tradingsimulator.dto;

import lombok.Getter;

@SuppressWarnings(value = "unused")
@Getter
public class LoginRequest {
    private String email;
    private String password;
}