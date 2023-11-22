package com.est.dockerizing;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/get")
	public String getMessage() {
		return UUID.randomUUID().toString();
	}
}
