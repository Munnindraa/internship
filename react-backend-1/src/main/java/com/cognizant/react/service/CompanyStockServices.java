package com.cognizant.react.service;

import java.util.List;

import com.cognizant.react.entity.CompanyDetails;
import com.cognizant.react.entity.Item;

public interface CompanyStockServices {

	/*
	 * @Autowired private CompanyStockDao companyDao;
	 */
	public List<CompanyDetails> getCompanyStockDetails() ;

	public boolean additem(Item item);

	public List<CompanyDetails> findlist();

	public void deletelist(int companycode);

}