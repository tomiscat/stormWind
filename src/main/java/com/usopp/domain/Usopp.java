package com.usopp.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * usopp bean form application
 *
 * Created by fov on 2017/3/6.
 */
@Component
public class Usopp {

    @Value("${com.usopp.username}")
    private String username;

    @Value("${com.usopp.password}")
    private String password;

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
