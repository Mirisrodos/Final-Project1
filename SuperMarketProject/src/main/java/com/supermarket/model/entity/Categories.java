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
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", catalog = "supermarketdb")
public class Categories implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int categoryId;
	private String categoryName;
	private String description;
	private Set<Products> productses = new HashSet<>(0);

	public Categories() {
	}

	public Categories(int categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Categories(int categoryId, String categoryName, String description, Set<Products> productses) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
		this.productses = productses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryID", unique = true, nullable = false)
	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "categoryName", nullable = false, length = 20, columnDefinition = "nvarchar")
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "descriptions", length = 100, columnDefinition = "nvarchar")
	public String getdescription() {
		return this.description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}
