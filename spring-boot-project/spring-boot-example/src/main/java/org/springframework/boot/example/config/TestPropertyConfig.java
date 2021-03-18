package org.springframework.boot.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.example.Service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author yangjing
 */
@Configuration
// @ConditionalOnProperty(prefix="mf",name = "assert", havingValue = "true")
public class TestPropertyConfig {

	// @Bean
	// public HelloService helloService(){
	// HelloService helloService = new HelloService();
	// System.out.println("测试");
	// return helloService;
	// }

}
