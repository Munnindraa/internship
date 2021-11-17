package com.cognizant.react.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.react.entity.CompanyDetails;
import com.cognizant.react.entity.Item;



@Repository
public interface CompanyStockDao extends JpaRepository<CompanyDetails, Serializable>{
	
	@Query(value = "SELECT * FROM companydetails ", nativeQuery = true)
	List<CompanyDetails> findcompany();
	@Query(value = "SELECT * FROM companydetails where companycode=? ", nativeQuery = true)
	CompanyDetails findByUserId(int companycode);
	
	
}