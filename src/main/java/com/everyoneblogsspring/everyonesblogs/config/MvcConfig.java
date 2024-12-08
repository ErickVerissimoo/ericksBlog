package com.everyoneblogsspring.everyonesblogs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.everyoneblogsspring.everyonesblogs.filter.AuthenticatedHandler;
@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer{
    @Autowired private AuthenticatedHandler handler;
    @Override
public void addInterceptors(InterceptorRegistry registry) {
registry.addInterceptor(handler);
}
}
