package com.niit.dao;
import java.util.List;

import com.niit.model.Supplier;


public interface SupplierDAO {
	
	public void insertSupplier(Supplier supplier);
	public List<Supplier> getSupplier();
	public Supplier getSupplierById(String supplierid);
	public void updateSupplier(Supplier supplier);
	public void deleteSupplier(String supplierid);

}
