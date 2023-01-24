package com.fastcampus.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("my")
//@Configuration
public class MyProperties {
    private final Integer Height;

    public MyProperties(Integer height) {
        Height = height;
    }

    public Integer getHeight() {
        return Height;
    }
}
