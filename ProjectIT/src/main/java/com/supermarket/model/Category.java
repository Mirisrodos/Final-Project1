package com.supermarket.model;

public class Category {
    protected int categoryID;
    protected String categoryName;
    protected String decription;

    public Category() {
    }

    public Category(String categoryName, String decription) {
        this.categoryName = categoryName;
        this.decription = decription;
    }

    public Category(int categoryID, String categoryName, String decription) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.decription = decription;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
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
}
