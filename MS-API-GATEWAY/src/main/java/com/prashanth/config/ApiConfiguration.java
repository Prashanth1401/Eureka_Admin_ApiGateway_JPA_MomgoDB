package com.prashanth.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {
	  @Bean
	    public RouteLocator myRoutes(RouteLocatorBuilder builder){
	        return builder.routes()
	                .route(p->p
	                        .path("/JPA/**")
	                        .uri("http://localhost:9001/"))
	                .route(p->p
	                        .path("/MongoDB/**")
	                        .uri("http://localhost:9002/"))
	          	                .build();
}
}
