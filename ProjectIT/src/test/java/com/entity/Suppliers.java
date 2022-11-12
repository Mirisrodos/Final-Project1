package com.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
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
	private int phone;
	private String address;
	private String supplierAddress;
	private String supplierName;
	private Integer supplierPhone;
	private Set<Products> productses = new HashSet<Products>(0);

	public Suppliers() {
	}

	public Suppliers(String upplierName, int phone, String address) {
		this.upplierName = upplierName;
		this.phone = phone;
		this.address = address;
	}

	public Suppliers(String upplierName, int phone, String address, String supplierAddress, String supplierName,
			Integer supplierPhone, Set<Products> productses) {
		this.upplierName = upplierName;
		this.phone = phone;
		this.address = address;
		this.supplierAddress = supplierAddress;
		this.supplierName = supplierName;
		this.supplierPhone = supplierPhone;
		this.productses = productses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

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
	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Column(name = "address", nullable = false, length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "supplierAddress")
	public String getSupplierAddress() {
		return this.supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Column(name = "supplierName")
	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Column(name = "supplierPhone")
	public Integer getSupplierPhone() {
		return this.supplierPhone;
	}

	public void setSupplierPhone(Integer supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suppliers")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}
