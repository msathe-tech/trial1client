package com.trial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Message {
	  @Value("${message: default message}")
	  String message;


	  public String getMessage() {
	    return message;
	  }

}
