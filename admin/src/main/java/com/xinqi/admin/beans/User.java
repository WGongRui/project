package com.xinqi.admin.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2016/8/25.
 */
@Component
public class User {

    private String userId,username,password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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
}
