package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

	private final FooProperties properties;

	@Autowired
	public FooController(FooProperties properties) {
		this.properties = properties;
	}

	@RequestMapping("/")
	public FooProperties properties() {
		return this.properties;
	}

}
