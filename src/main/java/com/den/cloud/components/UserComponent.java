package com.den.cloud.components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserComponent {

    private String dailyMessage;

    @PostConstruct
    public void init() {
        dailyMessage = "Hello from component";
    }

    public String getDailyMessage() {
        return dailyMessage;
    }
}
