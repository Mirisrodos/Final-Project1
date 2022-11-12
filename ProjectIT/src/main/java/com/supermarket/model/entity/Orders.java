package com.supermarket.model.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "supermarketdb")
public class Orders implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderId;
	private Users users;
	private int orderAmount;
	private String orderAddress;
	private Date createDate;
	private Date orderDate;
	private Set<Orderdetails> orderdetailses = new HashSet<Orderdetails>(0);

	public Orders() {
	}

	public Orders(int orderId, int orderAmount, String orderAddress, Date createDate, Date orderDate) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderAddress = orderAddress;
		this.createDate = createDate;
		this.orderDate = orderDate;
	}

	public Orders(int orderId, Users users, int orderAmount, String orderAddress, Date createDate, Date orderDate,
			Set<Orderdetails> orderdetailses) {
		this.orderId = orderId;
		this.users = users;
		this.orderAmount = orderAmount;
		this.orderAddress = orderAddress;
		this.createDate = createDate;
		this.orderDate = orderDate;
		this.orderdetailses = orderdetailses;
	}

	@Id

	@Column(name = "orderID", unique = true, nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderUserID")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "orderAmount", nullable = false)
	public int getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Column(name = "orderAddress", nullable = false, length = 50)
	public String getOrderAddress() {
		return this.orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "createDate", nullable = false, length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "orderDate", nullable = false, length = 10)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<Orderdetails> getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set<Orderdetails> orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}