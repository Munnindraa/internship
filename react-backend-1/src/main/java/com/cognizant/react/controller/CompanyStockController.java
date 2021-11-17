package com.cognizant.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.react.entity.CompanyDetails;
import com.cognizant.react.entity.UserLogin;
import com.cognizant.react.service.CompanyStockServices;




@RestController
@RequestMapping("api/stock")
@CrossOrigin(origins = "http://localhost:3000")
public class CompanyStockController{
	@Autowired
	private CompanyStockServices companyStockServices;
	
	@GetMapping("/companystocks")
	@ResponseStatus(HttpStatus.OK)
	public List<CompanyDetails> companyStockDetails()
	{
	   List<CompanyDetails>company= companyStockServices.getCompanyStockDetails();
	   System.out.println(company);
	   return company;
	   
	}
	
	@PostMapping("watchList/{user}")
	public List<CompanyDetails> companyStockServices(@RequestParam("user") @RequestBody UserLogin login){
		 List<CompanyDetails>company= companyStockServices.getCompanyStockDetails();
		return company;
		
	}
}