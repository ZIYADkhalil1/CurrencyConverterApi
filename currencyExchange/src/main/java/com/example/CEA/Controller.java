package com.example.CEA;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import lombok.RequiredArgsConstructor;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RequiredArgsConstructor
@RestController
public class Controller {
	
	private final CurrencyExchangeService currencyExchangeService;
	
	@GetMapping("/convert")
	public Double getMethodName(@RequestParam Double amount,@RequestParam String curCode) throws StreamReadException, DatabindException, IOException {
		return currencyExchangeService.convertCurrency(amount, curCode);
	}
	

}
