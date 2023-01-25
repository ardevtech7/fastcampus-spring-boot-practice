package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import com.fastcampus.springbootpractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

//@EnableCaching
//@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

//	@Value("${my.height}")
//	private final Integer height;
//	private final Environment environment;
//	private final ApplicationContext applicationContext;

	private final MyProperties myProperties;
	private final StudentService studentService;
	private final String username;
	private final String password;

	public FastcampusSpringBootPracticeApplication(
			MyProperties myProperties,
			StudentService studentService,
			@Value("${spring.datasource.username:}") String username,
			@Value("${spring.datasource.password:}") String password
	) {
		this.myProperties = myProperties;
		this.studentService = studentService;
		this.username = username;
		this.password = password;
	}

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

//	@PostConstruct
//	public void init() {
////		System.out.println("[@Value] " + height);
////		System.out.println("[Environment] " + environment.getProperty("my.height"));
////		System.out.println("[ApplicatonContext] " + applicationContext.getEnvironment().getProperty("my.height"));
//		System.out.println("[configurationPros]" + myProperties.getHeight());
//	}

	@EventListener(ApplicationReadyEvent.class)
	public void init() {
//		studentService.printStudent("jack");
//		studentService.printStudent("jack");
//		studentService.printStudent("jack");
//		studentService.printStudent("fred");
//		studentService.printStudent("cassie");
//		studentService.printStudent("cassie");
		System.out.println("id: " + username );
		System.out.println("password: " + password);
	}

}
