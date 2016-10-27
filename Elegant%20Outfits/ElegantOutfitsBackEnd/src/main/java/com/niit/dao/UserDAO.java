package com.niit.dao;



import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;

@Repository
@Transactional
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession()
	{
		return sessionFactory.openSession();
	}
	
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
	/* public int insertRow(User u){
		 Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(u);
		  tx.commit();
		  Serializable id = session.getIdentifier(u);
		  session.close();
		  return (Integer) id;
		
	 }*/
	public int addUser(String firstname,String username,String password,String email,long mobile)
	{
        Session session=getSession();
		Transaction tx=session.beginTransaction();
	    User u=new User();
		u.setFirstname(firstname);
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setMobile(mobile);
	    session.saveOrUpdate(u);
		tx.commit();
		Serializable id = session.getIdentifier(u);
		session.close();
		return (Integer) id;
		
	}
	

}
