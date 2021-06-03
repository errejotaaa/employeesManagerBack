package com.example.employeeManager;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}
	
	@Bean
    public CorsFilter corsFilter() 
    {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        configuration.setAllowedHeaders(Arrays.asList(
        		"Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept",
        		"Authorization","Origin, Accept","X-Requested-With",
        		"Access-Control-Request-Method","Access-Control-Request-Headers"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
        		"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return new CorsFilter(source);
    }

}
