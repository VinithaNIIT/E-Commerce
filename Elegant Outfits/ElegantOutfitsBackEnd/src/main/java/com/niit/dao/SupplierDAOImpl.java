package com.niit.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.openSession();
	}

	public boolean insertSupplier(Supplier supplier) {
		try {
			/*if(get(supplier.getSupplierid()!=null))
			{
				return false;
			}*/
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(supplier);
			tx.commit();
			// Serializable id = session.getIdentifier(supplier);
			session.close();
			return true;
			// return (Integer) id;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}

	}


	public List<Supplier> getSupplier() {
		Session session = getSession();
		// Transaction tx = session.beginTransaction();
		String s = "from Supplier";
		Query query = session.createQuery(s);
		List<Supplier> l = query.list();
		// tx.commit();
		session.close();
		return l;
	}

	public Supplier getSupplierById(String supplierid) {
		
		Session session = getSession();
		//Transaction tx=session.beginTransaction();
		 Supplier s=session.get(Supplier.class,supplierid);
		
		
		session.close();
		
		return s;
	}

	public boolean updateSupplier(Supplier supplier) {
		try {
			/*if(get(supplier.getSupplierid()==null))
			{
				return false;
			}*/
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(supplier);
			tx.commit();
			session.close();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}

	}

	public boolean deleteSupplier(String supplierid) {
		
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			Supplier s=session.load(Supplier.class, supplierid);
			session.delete(s);
			tx.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public List<Supplier> getSupplierList() {
		Session session=getSession();
		//Transaction tx=session.beginTransaction();
		String sqlquery="select supplierid from Supplier";
		Query query=session.createQuery(sqlquery);
		
		List<Supplier>li=query.list();
		System.out.println("supplierLIST method"+li);
		return li;
		
	}

}
