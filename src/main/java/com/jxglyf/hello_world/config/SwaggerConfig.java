package com.jxglyf.hello_world.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // Enable the function of swagger
public class SwaggerConfig {
    /**
     * Config Swagger2 bean
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // All the api under the com package would be passed to Swagger2 for management.
                .apis(RequestHandlerSelectors.basePackage("com"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * The API document page present information
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Presentation API")
                .description("Presentation")
                .version("1.0")
                .build();
    }
}
