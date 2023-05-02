package com.producto.Tareasprin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class TareasprinApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareasprinApplication.class, args);
	}
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//coloco el nombre de la carpeta tal y como esta
				.apis(RequestHandlerSelectors.basePackage("com.producto.Tareasprin"))
				.build()
				.apiInfo(apiDetails());
	}
	private ApiInfo apiDetails(){
		return new ApiInfoBuilder()
				.title("Despensa Familiar")
				.contact(new Contact("Guillermo","no-url", "myemail"))
				.description("Precios bajos")
				.build();
	}
}
