CREATE DATABASE supermarketdb;

USE supermarketdb;

CREATE TABLE suppliers (
	supplierID INT NOT NULL AUTO_INCREMENT,
	supplierName NVARCHAR(20) NOT NULL,
	phone VARCHAR(10) NOT NULL,
	address CHAR(50) NOT NULL,
	
	PRIMARY KEY (supplierID)
);

CREATE TABLE categories (
	categoryID INT NOT NULL AUTO_INCREMENT,
	categoryName NVARCHAR(20) NOT NULL,
	descriptions NVARCHAR(100),
	
	PRIMARY KEY (categoryID)
);

CREATE TABLE products (
	productID INT NOT NULL AUTO_INCREMENT,
	supplierID INT NOT NULL,
	categoryID INT NOT NULL,
	productName NVARCHAR(50) NOT NULL,
	price INT NOT NULL,
	rating INT NOT NULL,
	updateDate DATE NOT NULL,
	isSoldout BIT NOT NULL,
	productImage VARCHAR(100),
	
	PRIMARY KEY (productID),
	FOREIGN KEY (supplierID) REFERENCES suppliers(supplierID),
	FOREIGN KEY (categoryID) REFERENCES categories(categoryID)
	
);

CREATE TABLE users (
	userID INT NOT NULL AUTO_INCREMENT,
	userEmail VARCHAR(30) NOT NULL,
	userPassword VARCHAR(30) NOT NULL,
	userName NVARCHAR(30) NOT NULL,
	userAddress NVARCHAR(50) NOT NULL,
	userPhone VARCHAR(10) NOT NULL,
	registrationDate DATE NOT NULL,
	
	PRIMARY KEY (userID)
);

CREATE TABLE orders (
	orderID INT NOT NULL AUTO_INCREMENT,
	orderUserID INT NOT NULL,
	orderAddress NVARCHAR(50),
	createDate DATE,
	orderDate DATE,
	
	PRIMARY KEY (orderID),
	FOREIGN KEY (orderUserID) REFERENCES users(userID)
);

CREATE TABLE orderdetails (
	detailID INT NOT NULL AUTO_INCREMENT,
	detailOrderID INT,
	detailProductID INT NOT NULL,
	detailQuantity INT NOT NULL,

	PRIMARY KEY (detailID),
	FOREIGN KEY (detailOrderID) REFERENCES orders(orderID),
	FOREIGN KEY (detailProductID) REFERENCES products(productID)
);