package com.xiaobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class XbsTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbsTableApplication.class, args);
	}

	@GetMapping(value = "/")
	public String sayhello(){
		return "hello world";
	}
}
