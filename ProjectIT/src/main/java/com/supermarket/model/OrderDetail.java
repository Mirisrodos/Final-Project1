package com.supermarket.model;

public class OrderDetail {
    protected int detailID;
    protected int detailOrderID;
    protected int detailProductID;
    protected int detailPrice;
    protected int detailQuantity;

    public OrderDetail() {
    }

    public OrderDetail(int detailOrderID, int detailProductID, int detailPrice, int detailQuantity) {
        this.detailOrderID = detailOrderID;
        this.detailProductID = detailProductID;
        this.detailPrice = detailPrice;
        this.detailQuantity = detailQuantity;
    }

    public OrderDetail(int detailID, int detailOrderID, int detailProductID, int detailPrice, int detailQuantity) {
        this.detailID = detailID;
        this.detailOrderID = detailOrderID;
        this.detailProductID = detailProductID;
        this.detailPrice = detailPrice;
        this.detailQuantity = detailQuantity;
    }

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public int getDetailOrderID() {
        return detailOrderID;
    }

    public void setDetailOrderID(int detailOrderID) {
        this.detailOrderID = detailOrderID;
    }

    public int getDetailProductID() {
        return detailProductID;
    }

    public void setDetailProductID(int detailProductID) {
        this.detailProductID = detailProductID;
    }

    public int getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(int detailPrice) {
        this.detailPrice = detailPrice;
    }

    public int getDetailQuantity() {
        return detailQuantity;
    }

    public void setDetailQuantity(int detailQuantity) {
        this.detailQuantity = detailQuantity;
    }
    
}
