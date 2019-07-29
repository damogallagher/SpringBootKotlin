package com.kotlin.springboot.kotlindemo.config

import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2
import org.springframework.context.annotation.Bean
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.spi.DocumentationType
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.builders.PathSelectors
import com.google.common.base.Predicates;
@Configuration
@EnableSwagger2
class SwaggerConfig {
	
//	@Bean
//    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
//	.select()
//	.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
//	.build()
	
	@Bean
    fun api(): Docket {
		return Docket(DocumentationType.SWAGGER_2)
	.select()
	.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
	.build()
	}
	
}
