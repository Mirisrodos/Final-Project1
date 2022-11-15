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
    
insert into orders(orderUserID, orderAmount, orderAddress, createDate, orderDate)
	values(1, 5, "Bình Dương", "2022-10-15", "2022-10-15");
insert into orders(orderUserID, orderAmount, orderAddress, createDate, orderDate)
	values(3, 2, "Bình Phước", "2022-10-18", "2022-10-18");
insert into orders(orderUserID, orderAmount, orderAddress, createDate, orderDate)
	values(4, 5, "Hà Nội", "2022-10-18", "2022-10-21");
    
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Toor Dal", 50, 4, "2022-10-30", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Moong Dal", 50, 4, "2022-10-30", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Channa", 50, 5, "2022-10-30", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(2, 1, "Arhar Dal", 50, 5, "2022-10-30", 0, 'NULL');
    
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Fry Pan", 50, 4, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Cookware", 50, 4, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Dosa Tawa", 50, 4, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Flask", 50, 4, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Kadai Idly", 50, 5, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Breakfast Pan", 50, 5, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Elite Set", 50, 4, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Coated Pan", 50, 4, "2022-08-25", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 2, "Tadka Pan", 50, 4, "2022-08-25", 0, 'NULL');

insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Baby Lotion", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 1", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 2", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 3", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Baby Lotion 2", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 4", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Baby Lotion 3", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Wipes Gentle", 50, 5, "2022-10-28", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 3, "Rash Cream 5", 50, 5, "2022-10-28", 0, 'NULL');
    
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Sampann-Toor-Dal 1", 50, 4, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Parryss-Sugar 1", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Saffola-Gold 1", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Sampann-Toor-Dal 2", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Parryss-Sugar 2", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Saffola-Gold 2", 50, 4, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Sampann-Toor-Dal 3", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Parryss-Sugar 3", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 4, "Saffola-Gold 3", 50, 5, "2022-07-12", 0, 'NULL');
    
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Frooti", 50, 3, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Tropicana 1", 50, 4, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Tropicana 2", 50, 3, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Coca Cola can", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Coca Cola bottle", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Appy", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Real", 50, 4, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Red Bull", 50, 5, "2022-07-12", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 5, "Minute Maid", 50, 3, "2022-07-12", 0, 'NULL');
    

insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 6, "Milk Caramel", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(1, 6, "Gourmet", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 6, "Strawberry", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(5, 6, "Miniatures", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(2, 6, "Le-Gourmet", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(3, 6, "Chocolate Bar", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 6, "Poultry Rub", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 6, "Sandwich", 50, 5, "2022-07-20", 0, 'NULL');
insert into products(supplierID, categoryID, productName, quantity, rating, updateDate, isSoldout, productImage)
	values(4, 6, "Fruit Nut", 50, 5, "2022-07-20", 0, 'NULL');

insert into orderdetails(detailOrderID, detailProductID, detailPrice, detailQuantity) 
	values(1, 9, 89, 4);
insert into orderdetails(detailOrderID, detailProductID, detailPrice, detailQuantity) 
	values(2, 18, 67, 3);
insert into orderdetails(detailOrderID, detailProductID, detailPrice, detailQuantity) 
	values(3, 5, 123, 10);