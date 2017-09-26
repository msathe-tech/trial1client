package com.trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Trial1clientApplication {
	
	@Autowired
	private Message message;
	
	@GetMapping("/message")
    public String message() {
      return String.format("Today's message is: %s", message.getMessage());
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(Trial1clientApplication.class, args);
	}
}
