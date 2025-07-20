package com.cognizant.account;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/accounts/{number}")
	public Map<String, Object> getAccount(@PathVariable String number){
		
		return Map.of("number",number,"type","savings","balance","6747890");
	}
}
