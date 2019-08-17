package com.bmw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
@MapperScan("com.bmw.mapper")
public class BmwOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmwOrderApplication.class, args);
	}

}
