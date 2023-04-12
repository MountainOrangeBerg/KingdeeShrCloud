package com.mountain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class MountainLoginServiceApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(MountainLoginServiceApplication.class, args);

		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
