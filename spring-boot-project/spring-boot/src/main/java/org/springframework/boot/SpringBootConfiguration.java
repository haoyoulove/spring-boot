/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

/**
 * Indicates that a class provides Spring Boot application
 {@link Configuration @Configuration}. Can be used as an alternative to the Spring's
 standard {@code @Configuration} annotation so that configuration can be found
 automatically (for example in tests).
 * <p>
 * Application should only ever include <em>one</em> {@code @SpringBootConfiguration} and
 * most idiomatic Spring Boot applications will inherit it from
 * {@code @SpringBootApplication}.
 *
 * @author Phillip Webb
 * @author Andy Wilkinson
 * @since 1.4.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration(proxyBeanMethods = false)
public @interface SpringBootConfiguration {

	/**
	 * Specify whether {@link Bean @Bean} methods should get proxied in order to enforce
	 bean lifecycle behavior, e.g. to return shared singleton bean instances even in
	 case of direct {@code @Bean} method calls in user code. This feature requires
	 method interception, implemented through a runtime-generated CGLIB subclass which
	 comes with limitations such as the configuration class and its methods not being
	 allowed to declare {@code final}.
	 <p>
	 the default is {@code true}, allowing for 'inter-bean references' within the
	 configuration class as well as for external calls to this configuration's
	 {@code @Bean} methods, e.g. from another configuration class. If this is not needed
	 since each of this particular configuration's {@code @Bean} methods is
	 self-contained and designed as a plain factory method for container use, switch
	 this flag to {@code false} in order to avoid CGLIB subclass processing.
	 <p>
	 Turning off bean method interception effectively processes {@code @Bean} methods
	 individually like when declared on non-{@code @Configuration} classes, a.k.a.
	 "@Bean Lite Mode" (see {@link Bean @Bean's javadoc}). It is therefore behaviorally
	 equivalent to removing the {@code @Configuration} stereotype.
	 @return whether to proxy {@code @Bean} methods
	 @since 2.2
	 */
	@AliasFor(annotation = Configuration.class)
	boolean proxyBeanMethods() default true;

}
