package com.niit.dao;

import org.springframework.stereotype.Repository;

import com.niit.model.User;

@Repository
public class UserDAO {
	
	public boolean validate(String username,String password)
	{
		
		if(username.equals("niit") && password.equals("1234"))
		{
		return true;
		}
		else{
			return false;
		}
	}
	
	public User addUser(String firstname,String username,String password,String email,long mobile)
	{
		User u=new User();
		u.setFirstname(firstname);
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setMobile(mobile);
		return u;
		
	}

}
