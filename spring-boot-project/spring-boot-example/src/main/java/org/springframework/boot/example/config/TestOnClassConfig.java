package org.springframework.boot.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.example.Service.ClassService;
import org.springframework.boot.example.Service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangjing
 */
@Configuration
@ConditionalOnClass({ClassService.class})
public class TestOnClassConfig {


	@Bean
	public HelloService helloService(){
		HelloService helloService = new HelloService();
		System.out.println("ConditionalOnClass测试HelloServiceHelloServiceHelloService");
		return helloService;
	}
}
