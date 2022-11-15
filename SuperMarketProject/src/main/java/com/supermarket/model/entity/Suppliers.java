package com.supermarket.model.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Suppliers generated by hbm2java
 */
@Entity
@Table(name = "suppliers", catalog = "supermarketdb")
public class Suppliers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer supplierId;
	private String upplierName;
	private String phone;
	private String address;
	private Set<Products> productses = new HashSet<Products>(0);

	public Suppliers() {
	}

	public Suppliers(String upplierName, String phone, String address) {
		this.upplierName = upplierName;
		this.phone = phone;
		this.address = address;
	}

	public Suppliers(String upplierName, String phone, String address, Set<Products> productses) {
		this.upplierName = upplierName;
		this.phone = phone;
		this.address = address;
		this.productses = productses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplierID", unique = true, nullable = false)
	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	@Column(name = "upplierName", nullable = false, length = 20)
	public String getUpplierName() {
		return this.upplierName;
	}

	public void setUpplierName(String upplierName) {
		this.upplierName = upplierName;
	}

	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address", nullable = false, length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suppliers")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}