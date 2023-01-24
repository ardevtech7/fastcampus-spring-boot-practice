package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

//	@Value("${my.height}")
//	private final Integer height;
//	private final Environment environment;
//	private final ApplicationContext applicationContext;
	private final MyProperties myProperties;

//	public FastcampusSpringBootPracticeApplication(
//			@Value("${my.height}")Integer height,
//			Environment environment,
//			ApplicationContext applicationContext, MyProperties myProperties) {
//		this.height = height;
//		this.environment = environment;
//		this.applicationContext = applicationContext;
//		this.myProperties = myProperties;
//	}


	public static void main(String[] args) {
		SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		System.out.println("[@Value] " + height);
//		System.out.println("[Environment] " + environment.getProperty("my.height"));
//		System.out.println("[ApplicatonContext] " + applicationContext.getEnvironment().getProperty("my.height"));
		System.out.println("[configurationPros]" + myProperties.getHeight());
	}

}
