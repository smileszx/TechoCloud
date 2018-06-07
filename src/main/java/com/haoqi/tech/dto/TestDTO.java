package com.haoqi.tech.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by suzhengxiao on 2018/6/7.
 */
@Configuration
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "spring.test")
@NoArgsConstructor
@Data
@Component
public class TestDTO {
    @NonNull
    private String key;
    @NonNull
    private String value;
}
