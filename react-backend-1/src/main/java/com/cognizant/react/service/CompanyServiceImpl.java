package com.cognizant.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.react.dao.CompanyStockDao;
import com.cognizant.react.entity.CompanyDetails;

@Service

public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyStockDao companydao;

	@Override
	public List<CompanyDetails> findcompany() {
		// TODO Auto-generated method stub
		return companydao.findcompany();
	}

}