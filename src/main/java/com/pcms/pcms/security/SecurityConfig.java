package com.pcms.pcms.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(
                        auth -> auth.anyRequest().permitAll() // 全てのリクエストを許可
                )
                .csrf(AbstractHttpConfigurer::disable) // CSRF 無効（
                .formLogin(AbstractHttpConfigurer::disable) // ログインフォーム無効
                .httpBasic(AbstractHttpConfigurer::disable); // Basic認証無効

        return http.build();
    }
}
