package com.supermarket.model;

import java.util.Date;

public class Product {
    protected int productID;
    protected int supplierID;
    protected int categoryID;
    protected String productName;
    protected int quantity;
    protected int rating;
    protected Date updateDate;
    protected boolean isSoldout;
    protected String productImage;

    public Product() {
    }

    public Product(int supplierID, int categoryID, String productName, int quantity, int rating, Date updateDate, boolean isSoldout, String productImage) {
        this.supplierID = supplierID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.quantity = quantity;
        this.rating = rating;
        this.updateDate = updateDate;
        this.isSoldout = isSoldout;
        this.productImage = productImage;
    }

    public Product(int productID, int supplierID, int categoryID, String productName, int quantity, int rating, Date updateDate, boolean isSoldout, String productImage) {
        this.productID = productID;
        this.supplierID = supplierID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.quantity = quantity;
        this.rating = rating;
        this.updateDate = updateDate;
        this.isSoldout = isSoldout;
        this.productImage = productImage;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
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

    public boolean isIsSoldout() {
        return isSoldout;
    }

    public void setIsSoldout(boolean isSoldout) {
        this.isSoldout = isSoldout;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    
    
}
