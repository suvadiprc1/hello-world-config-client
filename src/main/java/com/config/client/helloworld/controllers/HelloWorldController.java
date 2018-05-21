package com.config.client.helloworld.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorldController {

	@Value("${hello.message:Hello World!}")
	private String message;

	@GetMapping("/msg")
	public String getMessage() {
		return message;
	}

}
