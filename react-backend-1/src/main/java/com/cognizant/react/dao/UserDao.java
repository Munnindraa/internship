package com.cognizant.react.dao;

import java.io.Serializable;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.react.entity.UserDetails;

@Repository
public interface UserDao extends JpaRepository<UserDetails, Serializable> {

	// List<User> findAll();
	@Query(value ="select * from user_tbl where email=?", nativeQuery = true)
	UserDetails find(String email);

}
