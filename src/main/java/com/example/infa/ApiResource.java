package com.example.infa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {
	@GetMapping("/name/{FirstName}")
	public String getfullName(@PathVariable("FirstName") String firstname) {
		//System.out.println(firstname);
		return firstname;
	}
}
