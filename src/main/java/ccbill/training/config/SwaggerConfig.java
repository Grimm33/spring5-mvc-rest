package ccbill.training.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        Contact contact = new Contact();
        contact.setName("Yandrick");
        contact.setEmail("yandrick@email.com");
        contact.setUrl("github.com/Grimm33");

        return new OpenAPI()
                .info(new Info().title("RestAPI Demo")
                    .description("Demo of RESTful API with Spring and Swagger")
                    .version("v0.1")
                    .termsOfService("Something")
                    .contact(contact)
                    .license(new License().name("some licence").url("some url"))
                ).externalDocs(new ExternalDocumentation()
                    .description("More info here")
                    .url("Some url"));
    }

}
