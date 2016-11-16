package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession()
	{
		return sessionFactory.openSession();
	}

	public boolean addProduct(Product product) {
		
		
			try {
				Session session=getSession();
				Transaction tx=session.beginTransaction();
				session.saveOrUpdate(product);
				tx.commit();
				session.close();
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		
	}

	public List<Product> getProduct() {
		Session session=getSession();
		String sql_query="from Product";
		Query query=session.createQuery(sql_query);
		List<Product>list=query.list();
		session.close();
		return list;
		
		
		
	}
	
	public Product getProductById(String productid) {
		
		Session session=getSession();
		Product p=session.get(Product.class, productid);
		session.close();
		return p;
		
	}

	public boolean updateProduct(Product product) {
		try {
			Session session=getSession();
			Transaction tx=session.beginTransaction();
			session.update(product);
			tx.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean deleteProduct(String productid) {
		/*Product pro = null;
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		String sql_query = "from Product where productid=:productid";
		Query query = session.createQuery(sql_query);
		query.setParameter("productid", productid);
		List<Product> list = query.list();
		if (list.size() > 0) {
			pro = (Product) list.get(0);
		}*/

		try {
			Session session=getSession();
			Transaction tx = session.beginTransaction();

			Product p=session.get(Product.class, productid);
			
			session.delete(p);
			tx.commit();
			session.close();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
		
		
	}

}
