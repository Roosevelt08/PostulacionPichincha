package com.retopichincha.tucomercio.tucomercioreto.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(SeverHttpSecurity http){
        http
           
            .authorizeExchange()
                .pathMatchers("/api/tipo-cambio/registrar").authenticated()
                .
    }
    
} 
