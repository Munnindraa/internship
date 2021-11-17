package com.cognizant.react.service;

import java.util.List;

import com.cognizant.react.entity.Stock;

public interface StockServices {

	public List<Stock> getStock();
	public List<Stock> getstockcompare(String company1, String company2, String fromdate,String todate);
}