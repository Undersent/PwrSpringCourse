package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@RequestMapping("/{number}")
	public Long multiplyByTwo(@PathVariable Long number){
		return number*2;
	}
	
	@RequestMapping("/currency/{value}/")
	public String addCurrencySignature(@PathVariable Long value,
			@RequestParam("currency") String currency ){
		return value.toString()+currency;
	}
	
	
	//localhost:8080/multiplier/50/120?from=pl&to=eur
	@RequestMapping("/multiplier/{value}/{multiplier}")
	public String currencyMultiplier(@PathVariable Long value, @PathVariable Long multiplier, 
			@RequestParam("from") String from, @RequestParam("to") String to){
		return value+ " " + from + " equals " + value*multiplier +" "+ to;
	}
}
