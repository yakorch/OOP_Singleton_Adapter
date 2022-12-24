package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private String lastActiveTime;
}
