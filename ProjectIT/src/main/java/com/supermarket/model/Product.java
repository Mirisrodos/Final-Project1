package com.supermarket.model;

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
@Table(name = "products")
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productID")
    private int productID;
	
	@Column(name = "productName")
    private String productName;
	
	@Column(name = "quantity")
    private int quantity;
	
	@Column(name = "rating")
    private int rating;
	
	@Column(name = "updateDate")
    private Date updateDate;
	
	@Column(name = "isSoldout")
    private boolean isSoldout;
	
	@Column(name = "productImage")
    private String productImage;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "detailProductID")
	private List<OrderDetail> orderDetailCollection;
	
	@JoinColumn(name="supplierID", referencedColumnName="supplierID")
	@ManyToOne()
	private Supplier supplierID;
	
	@JoinColumn(name="categoryID", referencedColumnName = "categoryID")
	@ManyToOne()
	private Category categoryID;

    public Product() {
    	
    }

	public Product(String productName, int quantity, int rating, Date updateDate, boolean isSoldout,
			String productImage, List<OrderDetail> orderDetailCollection, Supplier supplierID, Category categoryID) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.rating = rating;
		this.updateDate = updateDate;
		this.isSoldout = isSoldout;
		this.productImage = productImage;
		this.orderDetailCollection = orderDetailCollection;
		this.supplierID = supplierID;
		this.categoryID = categoryID;
	}

	public Product(int productID, String productName, int quantity, int rating, Date updateDate, boolean isSoldout,
			String productImage, List<OrderDetail> orderDetailCollection, Supplier supplierID, Category categoryID) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.quantity = quantity;
		this.rating = rating;
		this.updateDate = updateDate;
		this.isSoldout = isSoldout;
		this.productImage = productImage;
		this.orderDetailCollection = orderDetailCollection;
		this.supplierID = supplierID;
		this.categoryID = categoryID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public boolean isSoldout() {
		return isSoldout;
	}

	public void setSoldout(boolean isSoldout) {
		this.isSoldout = isSoldout;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public List<OrderDetail> getOrderDetailCollection() {
		return orderDetailCollection;
	}

	public void setOrderDetailCollection(List<OrderDetail> orderDetailCollection) {
		this.orderDetailCollection = orderDetailCollection;
	}

	public Supplier getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(Supplier supplierID) {
		this.supplierID = supplierID;
	}

	public Category getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Category categoryID) {
		this.categoryID = categoryID;
	}
    
}
