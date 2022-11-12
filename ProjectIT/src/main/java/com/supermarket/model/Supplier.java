package com.supermarket.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="suppliers")
public class Supplier implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplierID;
	
	@Column(name = "supplierName")
    private String supplierName;
	
	@Column(name = "supplierPhone")
    private Integer supplierPhone;
	
	@Column(name = "supplierAddress")
    private String supplierAddress;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "supplierID")
	private List<Product> productCollection;
    
    public Supplier() {};

    public Supplier(String supplierName, Integer supplierPhone, String supplierAddress) {
        this.supplierName = supplierName;
        this.supplierPhone = supplierPhone;
        this.supplierAddress = supplierAddress;
    }
    
    public Supplier(Integer supplierID, String supplierName, Integer supplierPhone, String supplierAddress) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.supplierPhone = supplierPhone;
        this.supplierAddress = supplierAddress;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(Integer supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }
}
