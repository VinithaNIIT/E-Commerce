package com.niit.dao;

import org.springframework.stereotype.Repository;

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

}
