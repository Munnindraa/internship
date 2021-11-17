package com.cognizant.react.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name="company")
public class Company {
	@Id
	@Column(name="companyId")
	private Integer companyId;
	@Column(name="companyName")
	private String companyName;
	@Column(name="description")
	private String description;
	@Column(name="currentStockPrice")
	private float currentStockPrice;

}