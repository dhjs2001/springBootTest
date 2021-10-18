package kr.or.connect.roleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScan(basePackages = {"kr.or.connect"})
public class RoleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleappApplication.class, args);
	}

}
