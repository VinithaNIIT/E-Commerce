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

@Repository
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.openSession();
	}

	public void insertSupplier(Supplier supplier) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(supplier);
		System.out.println("Inside insertsupplier metho" + supplier);
		tx.commit();
		// Serializable id = session.getIdentifier(supplier);
		session.close();
		// return (Integer) id;

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
		Supplier s = null;
		Session session = getSession();
		// Transaction tx=session.beginTransaction();
		// Supplier s=session.get(Supplier.class,supplierid);
		String sql_query = "from Supplier where supplierid=:supplierid";
		Query query = session.createQuery(sql_query);
		query.setParameter("supplierid", supplierid);
		List<Supplier> list = query.list();
		if (list.size() > 0) {
			s = (Supplier) list.get(0);
		}

		System.out.println("getsupplierid data" + s);
		
		session.close();
		
		return s;
	}

	public void updateSupplier(Supplier supplier) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.update(supplier);
		tx.commit();
		session.close();

	}

	public void deleteSupplier(String supplierid) {
		Supplier s = null;
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		String sql_query = "from Supplier where supplierid=:supplierid";
		Query query = session.createQuery(sql_query);
		query.setParameter("supplierid", supplierid);
		List<Supplier> list = query.list();
		if (list.size() > 0) {
			s = (Supplier) list.get(0);
		}

		System.out.println("getsupplierid data" + s);
		session.delete(s);
		/*
		 * Supplier s=session.load(Supplier.class, supplierid);
		 * System.out.println("deletesupplier method"+s);
		 */
		tx.commit();
		session.close();

	}

	public List<Supplier> getSupplierList() {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		String sqlquery="select supplierid from Supplier";
		Query query=session.createQuery(sqlquery);
		
		List<Supplier>li=query.list();
		System.out.println("supplierLIST method"+li);
		return li;
		
	}

}
