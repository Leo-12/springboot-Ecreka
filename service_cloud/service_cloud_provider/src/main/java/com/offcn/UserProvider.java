package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.offcn.mapper")
@SpringBootApplication
@EnableEurekaClient
public class UserProvider {
	public static void main(String[] args) {
		SpringApplication.run(UserProvider.class,args);
	}
}
