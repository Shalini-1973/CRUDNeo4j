package com.shalini.paynav.config;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	import springfox.documentation.builders.ApiInfoBuilder;
	import springfox.documentation.service.ApiInfo;
	import springfox.documentation.spi.DocumentationType;
	import springfox.documentation.spring.web.plugins.Docket;
	import springfox.documentation.swagger2.annotations.EnableSwagger2;
	import static springfox.documentation.builders.PathSelectors.regex;

	@Configuration
	@EnableSwagger2
	public class SwaggerConfig {
	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("paynav").apiInfo(apiInfo()).select().paths(regex("/api/company.*")).build();
	}
	   private ApiInfo apiInfo() {
		   return new ApiInfoBuilder().title(" company Detail")
				   .description("Documentation Genreted using swagger2 for our rest API ").build();
	   }
	}



