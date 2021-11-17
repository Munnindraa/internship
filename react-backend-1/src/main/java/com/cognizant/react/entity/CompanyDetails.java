package com.cognizant.react.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="companydetails")
public class CompanyDetails {
	@Id
	@Column
	private int companycode;
	@Column
	private String companyname;
	@Column
	private String briefdesc;
	@Column
	private double stockprice;
	@Column
	private String userId;

	public int getCompanycode() {
		return companycode;
	}

	public void setCompanycode(int companycode) {
		this.companycode = companycode;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getBriefdesc() {
		return briefdesc;
	}

	public void setBriefdesc(String briefdesc) {
		this.briefdesc = briefdesc;
	}

	public double getStockprice() {
		return stockprice;
	}

	public void setStockprice(double stockprice) {
		this.stockprice = stockprice;
	}

	public CompanyDetails(int companycode, String companyname, String briefdesc, double stockprice) {
		super();
		this.companycode = companycode;
		this.companyname = companyname;
		this.briefdesc = briefdesc;
		this.stockprice = stockprice;
	}

	public CompanyDetails() {
		super();
	}

	@Override
	public String toString() {
		return "CompanyDetails [companycode=" + companycode + ", companyname=" + companyname + ", briefdesc="
				+ briefdesc + ", stockprice=" + stockprice + "]";
	}

}