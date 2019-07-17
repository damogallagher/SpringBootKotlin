package com.kotlin.springboot.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication;

@SpringBootApplication
class SpringBootKotlinDemoApplication

fun main(args: Array<String>) {
	//runApplication<SpringBootKotlinDemoApplication>(*args)
	 SpringApplication.run(SpringBootKotlinDemoApplication::class.java, *args)
}
