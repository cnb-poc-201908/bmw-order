package com.bmw;

import java.util.Random;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BmwOrderApplicationTests {

    @Autowired
    StringEncryptor encryptor;

	@Test
	public void contextLoads() {
		/*
		String url = encryptor.encrypt("jdbc:postgresql://112.126.99.2:31543/salesdb?useSSL=false");
		String name = encryptor.encrypt("postgresadmin");
        String password = encryptor.encrypt("admin123");

        System.out.println(url);
        System.out.println(name);
        System.out.println(password);*/

		String a = "12345-";
		System.out.println(a.substring(0, a.length() - 1));
		System.out.println(String.format("%03d", 1));
		Random random = new Random();

	}

}
