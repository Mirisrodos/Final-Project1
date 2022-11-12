package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderdetails generated by hbm2java
 */
@Entity
@Table(name = "orderdetails", catalog = "supermarketdb")
public class Orderdetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer detailId;
	private Orders orders;
	private Products products;
	private int detailPrice;
	private int detailQuantity;

	public Orderdetails() {
	}

	public Orderdetails(Products products, int detailPrice, int detailQuantity) {
		this.products = products;
		this.detailPrice = detailPrice;
		this.detailQuantity = detailQuantity;
	}

	public Orderdetails(Orders orders, Products products, int detailPrice, int detailQuantity) {
		this.orders = orders;
		this.products = products;
		this.detailPrice = detailPrice;
		this.detailQuantity = detailQuantity;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "detailID", unique = true, nullable = false)
	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "detailOrderID")
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "detailProductID", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "detailPrice", nullable = false)
	public int getDetailPrice() {
		return this.detailPrice;
	}

	public void setDetailPrice(int detailPrice) {
		this.detailPrice = detailPrice;
	}

	@Column(name = "detailQuantity", nullable = false)
	public int getDetailQuantity() {
		return this.detailQuantity;
	}

	public void setDetailQuantity(int detailQuantity) {
		this.detailQuantity = detailQuantity;
	}

}
