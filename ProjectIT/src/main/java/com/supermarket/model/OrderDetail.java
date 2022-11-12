package com.supermarket.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detailID")
	private Integer detailID;
	
	@Column(name = "detailPrice")
    private Integer detailPrice;
	
	@Column(name = "detailQuantity")
    private Integer detailQuantity;
	
	@JoinColumn(name="detailOrderID", referencedColumnName="orderID")
	@ManyToOne
	private Order detailOrderID;
	
	@JoinColumn(name="detailProductID", referencedColumnName="productID")
	@ManyToOne
	private Product detailProductID;

	public OrderDetail() {
		
	}

	public OrderDetail(Integer detailPrice, Integer detailQuantity, Order detailOrderID, Product detailProductID) {
		this.detailPrice = detailPrice;
		this.detailQuantity = detailQuantity;
		this.detailOrderID = detailOrderID;
		this.detailProductID = detailProductID;
	}

	public OrderDetail(Integer detailID, Integer detailPrice, Integer detailQuantity, Order detailOrderID,
			Product detailProductID) {
		super();
		this.detailID = detailID;
		this.detailPrice = detailPrice;
		this.detailQuantity = detailQuantity;
		this.detailOrderID = detailOrderID;
		this.detailProductID = detailProductID;
	}

	public Integer getDetailID() {
		return detailID;
	}

	public void setDetailID(Integer detailID) {
		this.detailID = detailID;
	}

	public Integer getDetailPrice() {
		return detailPrice;
	}

	public void setDetailPrice(Integer detailPrice) {
		this.detailPrice = detailPrice;
	}

	public Integer getDetailQuantity() {
		return detailQuantity;
	}

	public void setDetailQuantity(Integer detailQuantity) {
		this.detailQuantity = detailQuantity;
	}

	public Order getDetailOrderID() {
		return detailOrderID;
	}

	public void setDetailOrderID(Order detailOrderID) {
		this.detailOrderID = detailOrderID;
	}

	public Product getDetailProductID() {
		return detailProductID;
	}

	public void setDetailProductID(Product detailProductID) {
		this.detailProductID = detailProductID;
	}
}
