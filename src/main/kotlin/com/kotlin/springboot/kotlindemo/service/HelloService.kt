package com.kotlin.springboot.kotlindemo.service
import org.springframework.stereotype.Service;

@Service
class HelloService {
  
    fun getHello(): String {
        return "hello service"
    }
}