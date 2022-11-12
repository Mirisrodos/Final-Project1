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
 * Products generated by hbm2java
 */
@Entity
@Table(name = "products", catalog = "supermarketdb")
public class Products implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productId;
	private Categories categories;
	private Suppliers suppliers;
	private int productName;
	private int quantity;
	private int rating;
	private Date updateDate;
	private boolean isSoldout;
	private String productImage;
	private Set<Orderdetails> orderdetailses = new HashSet<Orderdetails>(0);

	public Products() {
	}

	public Products(int productId, int productName, int quantity, int rating, Date updateDate, boolean isSoldout) {
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.rating = rating;
		this.updateDate = updateDate;
		this.isSoldout = isSoldout;
	}

	public Products(int productId, Categories categories, Suppliers suppliers, int productName, int quantity,
			int rating, Date updateDate, boolean isSoldout, String productImage, Set<Orderdetails> orderdetailses) {
		this.productId = productId;
		this.categories = categories;
		this.suppliers = suppliers;
		this.productName = productName;
		this.quantity = quantity;
		this.rating = rating;
		this.updateDate = updateDate;
		this.isSoldout = isSoldout;
		this.productImage = productImage;
		this.orderdetailses = orderdetailses;
	}

	@Id

	@Column(name = "productID", unique = true, nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryID")
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplierID")
	public Suppliers getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	@Column(name = "productName", nullable = false)
	public int getProductName() {
		return this.productName;
	}

	public void setProductName(int productName) {
		this.productName = productName;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "rating", nullable = false)
	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updateDate", nullable = false, length = 10)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "isSoldout", nullable = false)
	public boolean isIsSoldout() {
		return this.isSoldout;
	}

	public void setIsSoldout(boolean isSoldout) {
		this.isSoldout = isSoldout;
	}

	@Column(name = "productImage", length = 100)
	public String getProductImage() {
		return this.productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<Orderdetails> getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set<Orderdetails> orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}
