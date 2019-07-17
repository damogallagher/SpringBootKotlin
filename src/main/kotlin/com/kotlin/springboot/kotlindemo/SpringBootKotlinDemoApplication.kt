package com.kotlin.springboot.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

// Works in Eclipse - See http://engineering.pivotal.io/post/spring-boot-application-with-kotlin/ as to why we need to change this class	
@EnableAutoConfiguration
@ComponentScan
class SpringBootKotlinDemoApplication 
		fun main(args: Array<String>) {
			//runApplication<SpringBootKotlinDemoApplication>(*args)
			SpringApplication.run(SpringBootKotlinDemoApplication::class.java, *args)
		}



//Works in intellij
//@SpringBootApplication
//class SpringBootKotlinDemoApplication

//fun main(args: Array<String>) {
	//runApplication<SpringBootKotlinDemoApplication>(*args)
//	SpringApplication.run(SpringBootKotlinDemoApplication::class.java, *args)
//}
	

