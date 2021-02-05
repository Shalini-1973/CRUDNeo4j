package com.shalini.paynav;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	import com.google.common.base.Predicates;

	import springfox.documentation.builders.RequestHandlerSelectors;
	import springfox.documentation.spi.DocumentationType;
	import springfox.documentation.spring.web.plugins.Docket;
	import springfox.documentation.swagger2.annotations.EnableSwagger2;

	@Configuration
	@EnableSwagger2
	public class SwaggerConfig2 {
	@Bean
		public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build();
			
		}
	}


