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
@Table(name = "categories")
public class Category implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryID")
	private Integer categoryID;
	
	@Column(name = "categoryName")
    private String categoryName;
	
	@Column(name = "decription")
    private String decription;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
	private List<Product> productCollection;

	public Category() {

	}

	public Category(String categoryName, String decription, List<Product> productCollection) {
		this.categoryName = categoryName;
		this.decription = decription;
		this.productCollection = productCollection;
	}

	public Category(Integer categoryID, String categoryName, String decription, List<Product> productCollection) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.decription = decription;
		this.productCollection = productCollection;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public List<Product> getproductCollection() {
		return productCollection;
	}

	public void setproductCollection(List<Product> productCollection) {
		this.productCollection = productCollection;
	}
}
