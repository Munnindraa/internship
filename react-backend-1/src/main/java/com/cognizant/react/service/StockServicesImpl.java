package com.cognizant.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.react.dao.StockDao;
import com.cognizant.react.entity.Stock;

@Service
public class StockServicesImpl implements StockServices {

	@Autowired
	StockDao dao;

	public List<Stock> getStock() {
		return dao.getStockList();

	}

	public List<Stock> getstockcompare(String company1, String company2, String fromdate, String todate) {

		return dao.getstockcompare(company1, company2, fromdate, todate);
	}

	

}