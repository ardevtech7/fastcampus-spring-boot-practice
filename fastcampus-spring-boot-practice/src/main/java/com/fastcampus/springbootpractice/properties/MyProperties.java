package com.fastcampus.springbootpractice.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Getter
@ConstructorBinding
@ConfigurationProperties("my")
@RequiredArgsConstructor
public class MyProperties {

    /**
     * 제 키에요.
     */
    private final Integer height;

}