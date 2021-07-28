package com.xxxx.oauth2client01demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso //开启单点登录
public class Oauth2Client01DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Client01DemoApplication.class, args);
    }

}
