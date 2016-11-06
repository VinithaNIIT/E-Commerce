package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession()
	{
		return sessionFactory.openSession();
	}

	

	public void insertCategory(Category category) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(category);
		tx.commit();
		session.close();
		
	}

	public List<Category> getCategory() {
		Session session=getSession();
		String sql_query="from Category";
		Query query=session.createQuery(sql_query);
		List<Category>list=query.list();
		session.close();
		return list;
	}

	public Category getCategoryById(String categoryid) {
		Category c=null;
		Session session=getSession();
		
		String sql_query1="from Category where categoryid=:categoryid";
		Query query=session.createQuery(sql_query1);
		query.setParameter("categoryid", categoryid);
		List<Category>l=query.list();
		if(l.size()> 0)
		{
			 c=(Category)l.get(0);
		}
		
		//session.close();
		return c;
	}

	public void updateCategory(Category category) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.update(category);
		tx.commit();
		session.close();
		
		
	}

	public void deleteCategory(String categoryid) {
		Category ca=null;
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		String sqlquery="from Category where categoryid=:categoryid";
		Query query=session.createQuery(sqlquery);
		query.setParameter("categoryid", categoryid);
		List<Category>li=query.list();
		if(li.size()>0)
		{
			 ca=(Category)li.get(0);
		}
		session.delete(ca);
		tx.commit();
		session.close();
		
		
	}



	public List<Category> getCategoryList() {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		String sqlquery="select categoryid from Category";
		Query query=session.createQuery(sqlquery);
		
		List<Category>li=query.list();
		System.out.println("categoryLIST method"+li);
		return li;
	}

}
