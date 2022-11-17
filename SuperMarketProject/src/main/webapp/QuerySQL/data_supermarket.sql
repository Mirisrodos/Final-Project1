/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : supermarketdb

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 15/11/2022 22:15:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `categoryID` int(0) NOT NULL AUTO_INCREMENT,
  `categoryName` nvarchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` nvarchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`categoryID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES (1, 'Groceries', 'Daily used items, grocery items');
INSERT INTO `categories` VALUES (2, 'Household', 'Household cleaning aids, household appliances');
INSERT INTO `categories` VALUES (3, 'Personal Care', 'Support items in the field of personal health and the health of family members');
INSERT INTO `categories` VALUES (4, 'Packaged Foods', 'popular canned foods canned beef, canned fish, canned pork');
INSERT INTO `categories` VALUES (5, 'Beverages', 'Fresh fruits and vegetables sold only during the day');
INSERT INTO `categories` VALUES (6, 'Gourmet', 'Delicious food for gourmets');

-- ----------------------------
-- Table structure for orderdetails
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails`  (
  `detailID` int(0) NOT NULL AUTO_INCREMENT,
  `detailOrderID` int(0) NOT NULL,
  `detailProductID` int(0) NOT NULL,
  `detailPrice` int(0) NOT NULL,
  `detailQuantity` int(0) NOT NULL,
  PRIMARY KEY (`detailID`) USING BTREE,
  INDEX `detailOrderID`(`detailOrderID`) USING BTREE,
  INDEX `detailProductID`(`detailProductID`) USING BTREE,
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`detailOrderID`) REFERENCES `orders` (`orderID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`detailProductID`) REFERENCES `products` (`productID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------
INSERT INTO `orderdetails` VALUES (1, 1, 9, 89, 4);
INSERT INTO `orderdetails` VALUES (2, 2, 18, 67, 3);
INSERT INTO `orderdetails` VALUES (3, 3, 5, 123, 10);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `orderID` int(0) NOT NULL AUTO_INCREMENT,
  `orderUserID` int(0) NOT NULL,
  `orderAmount` int(0) NOT NULL,
  `orderAddress` nvarchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `createDate` date NOT NULL,
  `orderDate` date NOT NULL,
  PRIMARY KEY (`orderID`) USING BTREE,
  INDEX `orderUserID`(`orderUserID`) USING BTREE,
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`orderUserID`) REFERENCES `users` (`userID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 1, 5, 'BÃ¬nh DÆ°Æ¡ng', '2022-10-15', '2022-10-15');
INSERT INTO `orders` VALUES (2, 3, 2, 'BÃ¬nh PhÆ°á»›c', '2022-10-18', '2022-10-18');
INSERT INTO `orders` VALUES (3, 4, 5, 'HÃ  Ná»™i', '2022-10-18', '2022-10-21');

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `productID` int(0) NOT NULL AUTO_INCREMENT,
  `supplierID` int(0) NOT NULL,
  `categoryID` int(0) NOT NULL,
  `productName` nvarchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `quantity` int(0) NOT NULL,
  `rating` int(0) NOT NULL,
  `updateDate` date NOT NULL,
  `isSoldout` bit(1) NOT NULL,
  `productImage` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`productID`) USING BTREE,
  INDEX `supplierID`(`supplierID`) USING BTREE,
  INDEX `categoryID`(`categoryID`) USING BTREE,
  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`supplierID`) REFERENCES `suppliers` (`supplierID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `products_ibfk_2` FOREIGN KEY (`categoryID`) REFERENCES `categories` (`categoryID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (1, 2, 1, 'Toor Dal', 50, 4, '2022-10-30', b'0', 'NULL');
INSERT INTO `products` VALUES (2, 2, 1, 'Moong Dal', 50, 4, '2022-10-30', b'0', 'NULL');
INSERT INTO `products` VALUES (3, 2, 1, 'Channa', 50, 5, '2022-10-30', b'0', 'NULL');
INSERT INTO `products` VALUES (4, 2, 1, 'Arhar Dal', 50, 5, '2022-10-30', b'0', 'NULL');
INSERT INTO `products` VALUES (5, 1, 2, 'Fry Pan', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (6, 1, 2, 'Cookware', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (7, 1, 2, 'Dosa Tawa', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (8, 1, 2, 'Flask', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (9, 1, 2, 'Kadai Idly', 50, 5, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (10, 1, 2, 'Breakfast Pan', 50, 5, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (11, 1, 2, 'Elite Set', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (12, 1, 2, 'Coated Pan', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (13, 1, 2, 'Tadka Pan', 50, 4, '2022-08-25', b'0', 'NULL');
INSERT INTO `products` VALUES (14, 3, 3, 'Baby Lotion', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (15, 3, 3, 'Rash Cream 1', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (16, 3, 3, 'Rash Cream 2', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (17, 3, 3, 'Rash Cream 3', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (18, 3, 3, 'Baby Lotion 2', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (19, 3, 3, 'Rash Cream 4', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (20, 3, 3, 'Baby Lotion 3', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (21, 3, 3, 'Wipes Gentle', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (22, 3, 3, 'Rash Cream 5', 50, 5, '2022-10-28', b'0', 'NULL');
INSERT INTO `products` VALUES (23, 4, 4, 'Sampann-Toor-Dal 1', 50, 4, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (24, 4, 4, 'Parryss-Sugar 1', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (25, 4, 4, 'Saffola-Gold 1', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (26, 4, 4, 'Sampann-Toor-Dal 2', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (27, 4, 4, 'Parryss-Sugar 2', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (28, 4, 4, 'Saffola-Gold 2', 50, 4, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (29, 4, 4, 'Sampann-Toor-Dal 3', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (30, 4, 4, 'Parryss-Sugar 3', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (31, 4, 4, 'Saffola-Gold 3', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (32, 5, 5, 'Frooti', 50, 3, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (33, 5, 5, 'Tropicana 1', 50, 4, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (34, 5, 5, 'Tropicana 2', 50, 3, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (35, 5, 5, 'Coca Cola can', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (36, 5, 5, 'Coca Cola bottle', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (37, 5, 5, 'Appy', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (38, 5, 5, 'Real', 50, 4, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (39, 5, 5, 'Red Bull', 50, 5, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (40, 5, 5, 'Minute Maid', 50, 3, '2022-07-12', b'0', 'NULL');
INSERT INTO `products` VALUES (41, 1, 6, 'Milk Caramel', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (42, 1, 6, 'Gourmet', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (43, 3, 6, 'Strawberry', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (44, 5, 6, 'Miniatures', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (45, 2, 6, 'Le-Gourmet', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (46, 3, 6, 'Chocolate Bar', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (47, 4, 6, 'Poultry Rub', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (48, 4, 6, 'Sandwich', 50, 5, '2022-07-20', b'0', 'NULL');
INSERT INTO `products` VALUES (49, 4, 6, 'Fruit Nut', 50, 5, '2022-07-20', b'0', 'NULL');

-- ----------------------------
-- Table structure for suppliers
-- ----------------------------
DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE `suppliers`  (
  `supplierID` int(0) NOT NULL AUTO_INCREMENT,
  `supplierName` nvarchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` char(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`supplierID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of suppliers
-- ----------------------------
INSERT INTO `suppliers` VALUES (1, 'Kinh Ä�Ã´', '9987 4431', 'ThÃ nh phá»‘ Há»“ ChÃ­ Minh');
INSERT INTO `suppliers` VALUES (2, 'Vinamilk', '8857 4478', 'ThÃ nh phá»‘ Há»“ ChÃ­ Minh');
INSERT INTO `suppliers` VALUES (3, 'Vinfast', '1223 5543', 'HÃ  Ná»™i');
INSERT INTO `suppliers` VALUES (4, 'Chocopie', '4411 5577', 'KiÃªn Giang');
INSERT INTO `suppliers` VALUES (5, 'King Dom', '5567 3344', 'HÃ  TÄ©nh');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `userID` int(0) NOT NULL AUTO_INCREMENT,
  `userEmail` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `userPassword` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `userName` nvarchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userAddress` nvarchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPhone` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `registrationDate` date NOT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'nguyenvanbanh@gmail.com', 'vanbanh', 'Nguyá»…n VÄƒn BÃ¡nh', 'BÃ¬nh DÆ°Æ¡ng', '4487 5567', '2020-08-10');
INSERT INTO `users` VALUES (2, 'lethithanh@gmail.com', 'thithanh', 'LÃª Thá»‹ Thanh', 'Háº­u Giang', '7784 4432', '2021-10-22');
INSERT INTO `users` VALUES (3, 'nguyenvanba@gmail.com', 'vanba', 'Nguyá»…n VÄƒn BÃ¡', 'BÃ¬nh PhÆ°á»›c', '3312 4412', '2020-08-19');
INSERT INTO `users` VALUES (4, 'lethihoaithu@gmail.com', 'hoaithu', 'LÃª Thá»‹ HoÃ i Thu', 'HÃ  Ná»™i', '6648 9987', '2021-04-15');

SET FOREIGN_KEY_CHECKS = 1;
