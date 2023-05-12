package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DemoApplication {
// 	public static void main(String[] args) {
// 		SpringApplication.run(DemoApplication.class, args);
// 	}
// }

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotatGetuestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@Controller
@RestController
public class DemoApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}
    // @GetMapping("/hello")
    // public String hello(Model model) 
	// {
    //     model.addAttribute("message", "Hello Spring Boot 3.0.");
    //     return "hello";
    // }

	// @RequestMapping("/")//これでもいけるし
	@GetMapping("/")//これでもいけてる
	public String home()
	{
		return "Hello World";
	}


}

