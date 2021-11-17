package com.cognizant.react.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.react.dao.UserDao;
import com.cognizant.react.entity.UserDetails;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

	@Autowired
	private UserDao userDao;

	public boolean validateUserLogin(String email, String password) {
		UserDetails existingUser = userDao.find(email);
		System.out.println(existingUser);
		if (existingUser != null) {
			if (existingUser.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}