package com.niit.dao;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Supplier;

@Repository
@Transactional
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession()
	{
		return sessionFactory.openSession();
	}

	public int insertSupplier(Supplier supplier) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(supplier);
		 tx.commit();
		  Serializable id = session.getIdentifier(supplier);
		  session.close();
		  return (Integer) id;
	
	}

}
