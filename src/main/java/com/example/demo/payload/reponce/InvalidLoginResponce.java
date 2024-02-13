package com.example.demo.payload.reponce;

import lombok.Getter;

@Getter
public class InvalidLoginResponce {
    private String username;
    private String password;

    public InvalidLoginResponce(){
        this.username = "Invalid Username";
        this.password = "Invalid Password";
    }
}
