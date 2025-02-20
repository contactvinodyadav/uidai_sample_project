/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.net.uidai.quoters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {

	@Bean
	CommandLineRunner init(QuoteRepository repository) {

		return args -> {
			repository.save(new Quote(1L, "Working with Spring Boot is like pair-programming with the Spring developers."));
			for (int i = 10; i < 20; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> Working with Spring Boot is like pair-programming with the Spring developers."));
			}
			
			
			repository.save(new Quote(2L, "With Boot you deploy everywhere you can find a JVM basically."));
			for (int i = 20; i < 30; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> With Boot you deploy everywhere you can find a JVM basically."));
			}
			
			
			repository.save(new Quote(3L, "Spring has come quite a ways in addressing developer enjoyment and ease of use since the last time I built an application using it."));
			for (int i = 30; i < 40; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> Spring has come quite a ways in addressing developer enjoyment and ease of use since the last time I built an application using it."));
			}
			
			repository.save(new Quote(4L, 
					"Previous to Spring Boot, I remember XML hell, confusing set up, and " + "many hours of frustration."));
			for (int i = 40; i < 50  ; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> "));
			}
			
			
			repository.save(new Quote(5L, "Spring Boot solves this problem. It gets rid of XML and wires up "
					+ "common components for me, so I don't have to spend hours scratching my "
					+ "head just to figure out how it's all pieced together."));
						
			for (int i = 50; i < 60  ; i++) {
				repository.save(new Quote(Long.valueOf(i), i + " >> Spring Boot solves this problem. It gets rid of XML and wires up "
						+ "common components for me, so I don't have to spend hours scratching my "
						+ "head just to figure out how it's all pieced together."));
			}

			repository.save(new Quote(6L, "It embraces " + "convention over configuration, providing an experience on par with "
					+ "frameworks that excel at early stage development, such as Ruby on " + "Rails."));
			for (int i = 60; i < 70  ; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> It embraces " + "convention over configuration, providing an experience on par with "
						+ "frameworks that excel at early stage development, such as Ruby on " + "Rails."));
			}
			
			
			repository.save(new Quote(7L, "The real benefit of Boot, however, is that it's just Spring. That "
					+ "means any direction the code takes, regardless of complexity, I know " + "it's a safe bet."));
			for (int i = 70; i < 80  ; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> The real benefit of Boot, however, is that it's just Spring. That "
						+ "means any direction the code takes, regardless of complexity, I know " + "it's a safe bet."));
			}
			
			
			repository.save(new Quote(8L, "I don't worry about my code scaling. Boot allows the "
					+ "developer to peel back the layers and customize when it's appropriate "
					+ "while keeping the conventions that just work."));
			for (int i = 80; i < 90  ; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> I don't worry about my code scaling. Boot allows the "
						+ "developer to peel back the layers and customize when it's appropriate "
						+ "while keeping the conventions that just work."));
			}
			
			
			repository.save(new Quote(9L, "So easy it is to switch container in #springboot."));
			for (int i = 90; i < 100  ; i++) {
				repository.save(new Quote(Long.valueOf(i), i +  " >> So easy it is to switch container in #springboot."));
			}

		};
	}
}
