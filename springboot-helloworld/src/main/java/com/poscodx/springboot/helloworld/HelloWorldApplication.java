package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 1. 스프링 어플리케이션의 부트스트래핑 역할 -> 모든 준비를 끝마쳐주는 역할. : BootStrapping Class
 * 2. 설정 클래스: Configuration Class
 */
@SpringBootApplication
public class HelloWorldApplication {
//	
//	@Bean
//	public MyObject myObject() {
//		return new MyObject();
//	}
//	
	
	
	public static void main(String[] args) {
		
		/**
		 * 	SpringApplication.run(...) 안에서 일어나는 일
		 * 
		 */
		
//		ApplicationContext ac = null;
	
//		try {
//			ApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			
//		} finally {
//			((ConfigurableApplicationContext)ac).close();
//		}
		
		try(
				ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)) {
					
				}
	}
}
