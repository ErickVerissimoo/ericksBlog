package com.everyoneblogsspring.everyonesblogs.filter;

import java.io.IOException;
import java.net.http.HttpRequest;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Override
    
    protected void doFilterInternal(@NonNull HttpServletRequest request,@NonNull HttpServletResponse response,@NonNull FilterChain filterChain)
            throws ServletException, IOException {
                

                 throw new UnsupportedOperationException("Unimplemented method 'doFilterInternal'");
    }
     
}