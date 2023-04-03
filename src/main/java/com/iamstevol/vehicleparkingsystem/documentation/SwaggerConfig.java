package com.iamstevol.vehicleparkingsystem.documentation;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    // Get the Dependencies, setup docs

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Vehicle Parking System API")
                        .description("Vehicle-Parking-System is a vehicle parking management system api that provides" +
                                " endpoints for various vehicle parking operations with payment made easy.")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org"))
                        .contact(new Contact()
                                .email("afolabikunle2@gmail.com")
                                .name("Vehicle Parking Management System")
                                .url("https://github.com/Thinkit-lab/vehicle_parking_system")
                        )
                )
                .components(new Components()
                        .addSecuritySchemes("bearer",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT"))
                );



    }



}