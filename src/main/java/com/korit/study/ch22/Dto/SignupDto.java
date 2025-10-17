package com.korit.study.ch22.Dto;

import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.util.PasswordEncoder;

public class SignupDto {
    private String username;
    private String password;
    private String comfirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComfirmPassword() {
        return comfirmPassword;
    }

    public void setComfirmPassword(String comfirmPassword) {
        this.comfirmPassword = comfirmPassword;
    }

    public User touser(){
        return new User(0, username, PasswordEncoder.encode(password));
    }
}
