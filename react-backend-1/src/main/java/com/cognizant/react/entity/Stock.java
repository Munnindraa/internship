package com.cognizant.react.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockcompare")
public class Stock {
	@Id
	@Column(name="id")
	int id;
	@Column
	String companyname;
	
	@Column
	Date stockdate;
	@Column
	double stockprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	
	public Date getStockdate() {
		return stockdate;
	}
	public void setStockdate(Date stockdate) {
		this.stockdate = stockdate;
	}
	public double getStockprice() {
		return stockprice;
	}
	public void setStockprice(double stockprice) {
		this.stockprice = stockprice;
	}
	public Stock(int id, String companyname, Date date, double stockprice) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.stockdate = date;
		this.stockprice = stockprice;
	}
	public Stock() {
		super();
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", companyname=" + companyname + ", date=" + stockdate + ", stockprice=" + stockprice
				+ "]";
	}

	
	
}