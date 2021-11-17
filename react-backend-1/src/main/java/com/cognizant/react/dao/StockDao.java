package com.cognizant.react.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.react.entity.Stock;
@Repository
public interface StockDao extends JpaRepository<Stock, Serializable> {
	@Query(value ="select distinct companyname, id,stockdate,stockprice,stockdate  from stockcompare", nativeQuery = true)
	public List<Stock> getStockList();
	@Query(value="select id, companyname,stockdate,stockprice from stockcompare where companyname in (?,?) and stockdate between ? and ?", nativeQuery = true)
	public List<Stock> getstockcompare(String company1,String company2,String fromdate, String todate);

}