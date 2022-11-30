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
	private String supplierName;
	private String phone;
	private String address;
	private Set<Products> productses = new HashSet<>(0);

	public Suppliers() {
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

	@Column(name = "supplierName", nullable = false, length = 20, columnDefinition = "nvarchar")
	public String getsupplierName() {
		return this.supplierName;
	}

	public void setsupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address", nullable = false, length = 50, columnDefinition = "nvarchar")
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
