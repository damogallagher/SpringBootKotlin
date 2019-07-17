package com.kotlin.springboot.kotlindemo.controller

import com.kotlin.springboot.kotlindemo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.kotlin.springboot.kotlindemo.dto.HelloDto

@RestController
class HelloController(val helloService: HelloService) {

	@GetMapping("/hello")
	fun helloKotlin(): String {
		return "hello world"
	}

	@GetMapping("/hello-service")
	fun helloKotlinService(): String {
		return helloService.getHello()
	}

	// ...
	@GetMapping("/hello-dto")
	fun helloDto(): HelloDto {
		return HelloDto("Hello from the dto")
	}
}

