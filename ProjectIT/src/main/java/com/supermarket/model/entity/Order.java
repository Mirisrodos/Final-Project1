package com.supermarket.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "orderID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderID;
	
	@Column(name = "orderAmount")
	private Integer orderAmount;
	
	@Column(name = "orderAddress")
	private String orderAddress;
	
	@Column(name = "createDate")
	private Date createDate;
	
	@Column(name = "orderDate")
	private Date orderDate;
    
	@JoinColumn(name="orderUserID", referencedColumnName="userID")
	@ManyToOne
	private User orderUserID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "detailOrderID")
	private List<OrderDetail> orderDetailCollection;

	public Order() {
		
	}

	public Order(Integer orderAmount, String orderAddress, Date createDate, Date orderDate, User orderUserID,
			List<OrderDetail> orderDetailCollection) {
		super();
		this.orderAmount = orderAmount;
		this.orderAddress = orderAddress;
		this.createDate = createDate;
		this.orderDate = orderDate;
		this.orderUserID = orderUserID;
		this.orderDetailCollection = orderDetailCollection;
	}

	public Order(Integer orderID, Integer orderAmount, String orderAddress, Date createDate, Date orderDate, User orderUserID,
			List<OrderDetail> orderDetailCollection) {
		super();
		this.orderID = orderID;
		this.orderAmount = orderAmount;
		this.orderAddress = orderAddress;
		this.createDate = createDate;
		this.orderDate = orderDate;
		this.orderUserID = orderUserID;
		this.orderDetailCollection = orderDetailCollection;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public User getOrderUserID() {
		return orderUserID;
	}

	public void setOrderUserID(User orderUserID) {
		this.orderUserID = orderUserID;
	}

	public List<OrderDetail> getOrderDetailCollection() {
		return orderDetailCollection;
	}

	public void setOrderDetailCollection(List<OrderDetail> orderDetailCollection) {
		this.orderDetailCollection = orderDetailCollection;
	}

	
}