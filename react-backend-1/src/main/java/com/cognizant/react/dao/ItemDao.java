package com.cognizant.react.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.react.entity.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Serializable> {
	@Query(value ="select * from item where user_Id=?", nativeQuery = true)
	Item findByCompanyCode(int companycode);

	@Query(value ="select companycode from item", nativeQuery = true)
	List<Integer> findcountry();
	
	@Transactional
	@Modifying
	@Query(value = "Delete from item where companycode=?", nativeQuery = true)

	void findBycompanycode(int companycode);

}