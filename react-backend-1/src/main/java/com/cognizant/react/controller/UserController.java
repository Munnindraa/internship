package com.cognizant.react.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.react.entity.CompanyDetails;
import com.cognizant.react.entity.Item;
import com.cognizant.react.entity.UserLogin;
import com.cognizant.react.service.CompanyStockServices;
import com.cognizant.react.service.UserAuthenticationService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	@Autowired
	private CompanyStockServices companyStockServices;
	@Autowired
	private UserAuthenticationService userService;
	

	private static Integer companycode;

	@PostMapping("/login")
	@ResponseStatus(HttpStatus.OK)
	public boolean validate(@RequestBody UserLogin login) {
		System.out.println(login);
		boolean status = userService.validateUserLogin(login.getEmail(), login.getPassword());
		if (status)
			return status;
		else
			return (Boolean) null;
	}

	@GetMapping("/logout")
	public boolean logout(HttpSession session) {
		session.invalidate();

		return false;
	}

	@PostMapping("/watchlist")
	@ResponseStatus(HttpStatus.OK)
	public boolean watchListById(@RequestBody Item item) {
		// List<Company> company=compservice.findcompany();
		System.out.println(item);
	
		boolean status=companyStockServices.additem(item);
		// companyStockServices.getCompanyStockDetails();
		System.out.println(status);
		if(status)
		return true;
		else
		return (Boolean) null;

	}
	@GetMapping("/watchlist/email")
	@ResponseStatus(HttpStatus.OK)
	public List<CompanyDetails> watchListByUser() {
		// List<Company> company=compservice.findcompany();
		System.out.println("hello");

		List<CompanyDetails> company_watch= companyStockServices.findlist();
		// companyStockServices.getCompanyStockDetails();
		System.out.println(company_watch);
		
		return company_watch;
	

	}
	
	

	@DeleteMapping("/watchlist/email/{companycode}")
	@ResponseStatus(HttpStatus.OK)
	public void watchListById1(@PathVariable int companycode) {
		// List<Company> company=compservice.findcompany();
		System.out.println(companycode);
		
		companyStockServices.deletelist(companycode);
		/*
		 * boolean status=companyStockServices.additem(item); //
		 * companyStockServices.getCompanyStockDetails(); System.out.println(status);
		 * if(status) return true; else return (Boolean) null;
		 */

	}
}