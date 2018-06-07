package com.haoqi.tech;

import com.haoqi.tech.dto.TestDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableConfigurationProperties
public class TechocloudApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(TechocloudApplicationTests.class);

	@Value("${spring.test.key}")
	private String key;

	@Value("${spring.test.value}")
	private String value;

	@Test
	public void contextLoads() {
//		System.err.println(String.format("key: %s, value: %s", key, value));
//        logger.debug(String.format("key: %s, value: %s", key, value));

		TestDTO dto = new TestDTO();
		System.err.println("key: " + dto.getKey() +" , value: " + dto.getValue());
	}

}
