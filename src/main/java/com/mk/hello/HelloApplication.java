package com.mk.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloApplication {
	//use" not '
	//map to home page
@RequestMapping("/")
//content or body of that web page
@ResponseBody
String home(){
	return "It is snowing outside";
}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
