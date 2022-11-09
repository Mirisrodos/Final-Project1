/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "userID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
	
	@Column(name = "userEmail")
    private String userEmail;
	
	@Column(name = "userPassword")
    private String userPassword;
	
	@Column(name = "userName")
    private String userName;
    
    @Column(name = "userAddress")
    private String userAddress;
    
    @Column(name = "userPhone")
    private int userPhone;
    
    @Column(name = "registrationDate")
    private Date registrationDate;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderUserID")
    private List<Order> orderCollection;

	public User() {};
    
    public User(String userEmail, String userPassword, String userName, String userAddress, int userPhone, Date registrationDate) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.registrationDate = registrationDate;
    }


    public User(int userID, String userEmail, String userPassword, String userName, String userAddress, int userPhone, Date registrationDate) {
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.registrationDate = registrationDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public Collection<Order> getOrderCollection() {
		return orderCollection;
	}

	public void setOrderCollection(List<Order> orderCollection) {
		this.orderCollection = orderCollection;
	}
}
