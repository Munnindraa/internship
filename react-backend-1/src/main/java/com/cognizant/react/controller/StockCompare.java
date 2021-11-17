package com.cognizant.react.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.react.entity.Stock;
import com.cognizant.react.service.StockServices;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = "http://localhost:3000")
public class StockCompare {

	@Autowired
	StockServices stockServices;
	
	@GetMapping("/company")
	public List<Stock> getstockcompany() {
		List<Stock> stock=stockServices.getStock();
		return stock;
		
	}
	
	@RequestMapping(value = "/com1/{com1}/com2/{com2}/fromdate/{from}/todate/{to}", method = RequestMethod.GET)
	
	public List<Stock> getstockcompare(@PathVariable(value = "com1") String com1, @PathVariable(value = "com2") String com2,@PathVariable(value = "from")@DateTimeFormat(pattern = "yyyy-MM-dd") String fromdate,@PathVariable(value = "to") @DateTimeFormat(pattern = "yyyy-MM-dd") String todate)
	{
		
		return stockServices.getstockcompare(com1,com2,fromdate,todate);
	}
	
	
	
}