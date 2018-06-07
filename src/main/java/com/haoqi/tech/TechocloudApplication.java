package com.haoqi.tech;

import com.haoqi.tech.dto.TestDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class TechocloudApplication {
	@RequestMapping("/")
	public TestDTO getTestDTO () {
		TestDTO testDTO = new TestDTO();
		return testDTO;
	}

	public static void main(String[] args) {
		SpringApplication.run(TechocloudApplication.class, args);
	}
}
