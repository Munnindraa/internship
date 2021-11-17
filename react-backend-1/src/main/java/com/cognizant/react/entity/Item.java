package com.cognizant.react.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Column(name="userId")
	private String userId;
	@Id
	@Column(name="companycode")
	private Integer companycode;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getCompanycode() {
		return companycode;
	}
	public void setCompanycode(int companycode) {
		this.companycode = companycode;
	}
	@Override
	public String toString() {
		return "Item [userId=" + userId + ", companycode=" + companycode + "]";
	}
	
	
	
	

}