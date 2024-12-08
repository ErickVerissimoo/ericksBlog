package com.everyoneblogsspring.everyonesblogs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain filtro(HttpSecurity http) throws Exception{
                                  http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(htt -> htt.requestMatchers("/api/auth/*", "/api/home/*").permitAll());
return http.build();
}
}
