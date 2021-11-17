package com.cognizant.react.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.react.dao.CompanyStockDao;
import com.cognizant.react.dao.ItemDao;
import com.cognizant.react.entity.CompanyDetails;
import com.cognizant.react.entity.Item;

@Service
public class CompanyStockServicesImpl implements CompanyStockServices {
	@Autowired
	private CompanyStockDao companyDao;
	@Autowired
	private ItemDao itemDao;

	@Override
	// TODO Auto-generated method stub
	public List<CompanyDetails> getCompanyStockDetails() {

		return companyDao.findAll();
	}

	@Override
	public boolean additem(Item item) {

		Item c2 = itemDao.findByCompanyCode(item.getCompanycode());
		if (c2 != null) {
			return false;
		} else {
			Item p = itemDao.save(item);
			if (p != null) {
				return true;
			}
			return false;
		}

	}

	@Override
	public List<CompanyDetails> findlist() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		List<Integer> item=itemDao.findcountry();
		System.out.println(item);
		List<CompanyDetails> company_watched =new LinkedList<CompanyDetails> ();
		
		for(int i:item) {
			System.out.println(i);
			company_watched.add( companyDao.findByUserId(i));
			System.out.println(company_watched);
		}
		
	
		return company_watched;
	}
	
	public void deletelist(int companycode) {
		System.out.println("deleting");
		itemDao.findBycompanycode(companycode);
	}
}