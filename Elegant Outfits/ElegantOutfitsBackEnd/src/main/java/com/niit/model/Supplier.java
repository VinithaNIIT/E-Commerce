package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int supplierid;
	private String suppliername;
	private String supplierdescription;
	
	
	@Override
	public String toString() {
		return "Supplier [supplierid=" + supplierid + ", suppliername=" + suppliername + ", supplierdescription="
				+ supplierdescription + "]";
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getDescription() {
		return supplierdescription;
	}
	public void setDescription(String supplierdescription) {
		this.supplierdescription = supplierdescription;
	}

}
