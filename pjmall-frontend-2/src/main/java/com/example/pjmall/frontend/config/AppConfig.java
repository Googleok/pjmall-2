package com.example.pjmall.frontend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.example.pjmall.frontend.config.app.AppSecurityConfig;
import com.example.pjmall.frontend.config.app.OAuth2ClientConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.example.pjmall.frontend.security", "com.example.pjmall.frontend.service",  "com.example.pjmall.frontend.repository", "com.example.pjmall.frontend.aspect"})
@Import({ AppSecurityConfig.class, OAuth2ClientConfig.class })
public class AppConfig {
}