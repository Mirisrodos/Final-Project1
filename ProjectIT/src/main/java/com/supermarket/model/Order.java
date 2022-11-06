package com.supermarket.model;

import java.util.Date;

public class Order {
    protected int orderID;
    protected int orderUserID;
    protected int orderAmount;
    protected String orderAddress;
    protected Date createDate;
    protected Date orderDate;

    public Order() {
    }

    public Order(int orderUserID, int orderAmount, String orderAddress, Date createDate, Date orderDate) {
        this.orderUserID = orderUserID;
        this.orderAmount = orderAmount;
        this.orderAddress = orderAddress;
        this.createDate = createDate;
        this.orderDate = orderDate;
    }

    public Order(int orderID, int orderUserID, int orderAmount, String orderAddress, Date createDate, Date orderDate) {
        this.orderID = orderID;
        this.orderUserID = orderUserID;
        this.orderAmount = orderAmount;
        this.orderAddress = orderAddress;
        this.createDate = createDate;
        this.orderDate = orderDate;
    }
}
