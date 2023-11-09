package de.telran.g_10_170123_e_be_dto.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Приложение Swagger",
                description = "Приложение для тестирования технологии Swagger",
                version = "1.0.0",
                contact = @Contact(
                        name = "Андрей Помелов",
                        email = "test@example.com",
                        url = "http://tel-ran.de"
                )
        )
)
public class SwaggerConfig {
}