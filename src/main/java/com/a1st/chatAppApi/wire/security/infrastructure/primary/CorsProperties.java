package com.a1st.chatAppApi.wire.security.infrastructure.primary;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
@Configuration
public class CorsProperties {

    @Bean
    @ConfigurationProperties(prefix = "application.cors", ignoreUnknownFields = false)
    public CorsConfiguration getCorsConfiguration() {
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*"); //todo: to be checked later I might have an issue.
        return corsConfiguration;
    }
}
