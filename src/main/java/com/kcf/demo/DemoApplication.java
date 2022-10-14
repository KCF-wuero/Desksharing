package com.kcf.demo;

import com.kcf.demo.api.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
public static Demo addDemo(Demo newDemo) {
		newDemo.setCollection("Users");
		newDemo.setDatabase("Desksharing");
		newDemo.setDataSource("Cluster0");
		newDemo.setDocument("{" +
				"'userId'" + ":" + "'HZ'" + "," +
				"'password'" + ":" +  "'HZ'" + "}");

		return newDemo;
};

}
