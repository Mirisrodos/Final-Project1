
insert into categories(categoryName , descriptions)
	values("Groceries", "Daily used items, grocery items");
insert into categories(categoryName , descriptions)
	values("Household", "Household cleaning aids, household appliances");
insert into categories(categoryName , descriptions)
	values("Personal Care", "Support items in the field of personal health and the health of family members");
insert into categories(categoryName , descriptions)
	values("Packaged Foods", "popular canned foods canned beef, canned fish, canned pork");
insert into categories(categoryName , descriptions)
	values("Beverages", "Fresh fruits and vegetables sold only during the day");
insert into categories(categoryName , descriptions)
	values("Gourmet", "Delicious food for gourmets");
insert into categories(categoryName , descriptions)
	values("Special", "All products special of us");
insert into categories(categoryName , descriptions)
	values("Daily Special", "Daily products of us");

    
insert into users(userEmail, userPassword, userName, userAddress, userPhone, registrationDate)
	values("nguyenvanbanh@gmail.com", "vanbanh", "Nguyễn Văn Bánh", "Bình Dương", "4487 5567", "2020-08-10");
insert into users(userEmail, userPassword, userName, userAddress, userPhone, registrationDate)
	values("lethithanh@gmail.com", "thithanh", "Lê Thị Thanh", "Hậu Giang", "7784 4432", "2021-10-22");
insert into users(userEmail, userPassword, userName, userAddress, userPhone, registrationDate)
	values("nguyenvanba@gmail.com", "vanba", "Nguyễn Văn Bá", "Bình Phước", "3312 4412", "2020-08-19");
insert into users(userEmail, userPassword, userName, userAddress, userPhone, registrationDate)
	values("lethihoaithu@gmail.com", "hoaithu", "Lê Thị Hoài Thu", "Hà Nội", "6648 9987", "2021-04-15");
    
insert into suppliers(supplierName, phone, address) 
	values("Kinh Đô", "9987 4431", "Thành phố Hồ Chí Minh");
insert into suppliers(supplierName, phone, address) 
	values("Vinamilk", "8857 4478", "Thành phố Hồ Chí Minh");
insert into suppliers(supplierName, phone, address) 
	values("Vinfast", "1223 5543", "Hà Nội");
insert into suppliers(supplierName, phone, address) 
	values("Chocopie", "4411 5577", "Kiên Giang");
insert into suppliers(supplierName, phone, address) 
	values("King Dom", "5567 3344", "Hà Tĩnh");
    
insert into orders(orderUserID, orderAddress, createDate, orderDate)
	values(1, "Bình Dương", "2022-10-15", "2022-10-15");
insert into orders(orderUserID, orderAddress, createDate, orderDate)
	values(3, "Bình Phước", "2022-10-18", "2022-10-18");
insert into orders(orderUserID, orderAddress, createDate, orderDate)
	values(4, "Hà Nội", "2022-10-18", "2022-10-21");
    
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Toor Dal", 50, 4, "2022-10-30", 0, "14.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Moong Dal", 76, 4, "2022-10-30", 0, "15.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Channa", 58, 5, "2022-10-30", 0, "16.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Arhar Dal", 34, 5, "2022-10-30", 0, "17.png");
    
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Fry Pan", 72, 4, "2022-08-25", 0, "hh1.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Cookware", 88, 4, "2022-08-25", 0, "hh2.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Dosa Tawa", 27, 4, "2022-08-25", 0, "hh3.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Flask", 36, 4, "2022-08-25", 0, "hh4.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Kadai Idly", 45, 5, "2022-08-25", 0, "hh5.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Breakfast Pan", 77, 5, "2022-08-25", 0, "hh6.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Elite Set", 38, 4, "2022-08-25", 0, "hh7.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Coated Pan", 51, 4, "2022-08-25", 0, "hh8.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Tadka Pan", 41, 4, "2022-08-25", 0, "hh9.png");

insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Baby Lotion", 90, 5, "2022-10-28", 0, "pc1.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 1", 102, 5, "2022-10-28", 0, "pc2.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 2", 35, 5, "2022-10-28", 0, "pc3.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 3", 69, 5, "2022-10-28", 0, "pc4.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Baby Lotion 2", 52, 5, "2022-10-28", 0, "pc5.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 4", 42, 5, "2022-10-28", 0, "pc6.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Baby Lotion 3", 41, 5, "2022-10-28", 0, "pc7.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Wipes Gentle", 98, 5, "2022-10-28", 0, "pc8.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 5", 63, 5, "2022-10-28", 0, "pc9.jpg");
    
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Sampann-Toor-Dal 1", 34, 4, "2022-07-12", 0, "pf1.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Parryss-Sugar 1", 29, 5, "2022-07-12", 0, "pf2.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Saffola-Gold 1", 49, 5, "2022-07-12", 0, "pf3.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Sampann-Toor-Dal 2", 62, 5, "2022-07-12", 0, "pf4.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Parryss-Sugar 2", 93, 5, "2022-07-12", 0, "pf5.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Saffola-Gold 2", 78, 4, "2022-07-12", 0, "pf6.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Sampann-Toor-Dal 3", 53, 5, "2022-07-12", 0, "pf7.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Parryss-Sugar 3", 63, 5, "2022-07-12", 0, "pf8.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Saffola-Gold 3", 93, 5, "2022-07-12", 0, "pf9.png");
    
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Frooti", 15, 3, "2022-07-12", 0, "bv2.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Tropicana 1", 28, 4, "2022-07-12", 0, "bv3.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Tropicana 2", 29, 3, "2022-07-12", 0, "bv4.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Coca Cola can", 33, 5, "2022-07-12", 0, "bv5.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Coca Cola bottle", 46, 5, "2022-07-12", 0, "bv6.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Appy", 87, 5, "2022-07-12", 0, "bv7.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Real", 57, 4, "2022-07-12", 0, "bv8.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Red Bull", 82, 5, "2022-07-12", 0, "bv9.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Minute Maid", 44, 3, "2022-07-12", 0, "bv1.png");
    

insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 6, "Milk Caramel", 50, 5, "2022-07-20", 0, "gu1.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(1, 6, "Gourmet", 58, 5, "2022-07-20", 0, "gu2.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 6, "Strawberry", 40, 5, "2022-07-20", 0, "gu3.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(5, 6, "Miniatures", 32, 5, "2022-07-20", 0, "gu4.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(2, 6, "Le-Gourmet", 61, 5, "2022-07-20", 0, "gu5.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 6, "Chocolate Bar", 130, 5, "2022-07-20", 0, "gu6.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 6, "Poultry Rub", 71, 5, "2022-07-20", 0, "gu7.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 6, "Sandwich", 46, 5, "2022-07-20", 0, "gu8.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 6, "Fruit Nut", 87, 5, "2022-07-20", 0, "gu9.png");
    
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 7, "Tata-Salt", 95, 5, "2022-07-25", 0, "1.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 7, "Fortune-Sunflower", 50, 5, "2022-07-25", 0, "2.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 7, "Aashirvaad-Atta", 35, 5, "2022-07-25", 0, "3.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 7, "Sampann-Toor-Dal", 29, 5, "2022-07-25", 0, "4.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 7, "Parryss-Sugar", 41, 5, "2022-07-25", 0, "5.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(4, 7, "Saffola-Gold", 59, 5, "2022-07-25", 0, "6.png");
    
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 7, "Sona-masoori-rice", 41, 5, "2022-07-25", 0, "7.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 7, "Milky-mist-paneer", 84, 5, "2022-07-25", 0, "8.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 7, "Basmati-Rice", 32, 5, "2022-07-25", 0, "9.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 7, "Fortune-Sunflower", 67, 5, "2022-07-25", 0, "10.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 7, "Nestle-A-Slim", 53, 5, "2022-07-25", 0, "12.png");
insert into products(supplierID, categoryID, productName, price, rating, updateDate, isSoldout, productImage)
	values(3, 7, "Bread-Sandwich", 84, 5, "2022-07-25", 0, "13.png");

insert into orderdetails(detailOrderID, detailProductID, detailQuantity)
	values(1, 9, 4);
insert into orderdetails(detailOrderID, detailProductID, detailQuantity)
	values(2, 18, 3);
insert into orderdetails(detailOrderID, detailProductID, detailQuantity)
	values(3, 5, 10);