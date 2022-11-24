<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Super Market an Ecommerce Online Shopping Category Flat
	Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Super Market Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- //font-awesome icons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link
	href='//fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic'
	rel='stylesheet' type='text/css'>
<link
	href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic'
	rel='stylesheet' type='text/css'>
<script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
            });
        });
    </script>
<!-- start-smoth-scrolling -->
</head>
<body>
	<!-- header -->
	<div class="agileits_header">
		<div class="container">
			<div class="w3l_offers">
				<p>
					SALE UP TO 70% OFF. USE CODE "SALE70%" . <a href="products.jsp">SHOP
						NOW</a>
				</p>
			</div>
			<div class="agile-login">			
				<ul>
					<c:if test="${empty sessionScope.userid}">
						<li><a href="registered.jsp"> Create Account</a></li>
						<li><a href="login.jsp">Login</a></li>
						<li><a href="contact.jsp">Help</a></li>						
						<li><a href="#">${sessionScope["userid"]}</a></li>
					</c:if>

					<c:if test="${!empty sessionScope.userid}">
					<!-- Them icon cham xanh hien thi dang hoat dong -->
						<li><a href="#"><i class='fas fa-circle' style='font-size:8px;color: #1bef31'>&nbsp;&nbsp;<b style='font-size:14px'>Online</b></i>&nbsp;&nbsp;${sessionScope.username}</a></li>										
						<li><a href="logout" style='padding_left=20px'>Logout</a></li>
					</c:if>
				</ul>				
			</div>
			<div class="product_list_header">			
				<form action="#" method="post" class="last">
					<input type="hidden" name="cmd" value="_cart"> <input
						type="hidden" name="display" value="1">
					<button class="w3view-cart" type="submit" name="submit" value="">
						<i class="fa fa-cart-arrow-down" aria-hidden="true"></i>
					</button>					
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>

	<div class="logo_products">
		<div class="container">
			<div class="w3ls_logo_products_left1">
				<ul class="phone_email">
					<li><i class="fa fa-phone" aria-hidden="true"></i>Order online
						or call us : (+84) 37221223</li>

				</ul>
			</div>
			<div class="w3ls_logo_products_left">
				<h1>
					<a href="index.jsp">super Market</a>
				</h1>
			</div>
			<div class="w3l_search">
				<form action="SearchProductServlet" method="get">
					<input type="search" name="searchValue"
						placeholder="Search for a Product..." required="">
					<button type="submit" class="btn btn-default search"
						aria-label="Left Align">
						<i class="fa fa-search" aria-hidden="true"> </i>
					</button>
					<div class="clearfix"></div>
				</form>
			</div>

			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //header -->
	<!-- navigation -->
	<div class="navigation-agileits">
		<div class="container">
			<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
					<button type="button"
						class="navbar-toggle collapsed navbar-toggle1"
						data-toggle="collapse" data-target="#bs-megadropdown-tabs">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.jsp" class="act">Home</a></li> 
						<!-- Mega Menu -->
						<!-- <li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Groceries<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="multi-gd-img">
										<ul class="multi-column-dropdown">
											<h6>All Groceries</h6>
											<li><a href="groceries.jsp">Dals & Pulses</a></li>
											<li><a href="groceries.jsp">Almonds</a></li>
											<li><a href="groceries.jsp">Cashews</a></li>
											<li><a href="groceries.jsp">Dry Fruit</a></li>
											<li><a href="groceries.jsp"> Mukhwas </a></li>
											<li><a href="groceries.jsp">Rice & Rice Products</a></li>
										</ul>
									</div>
								</div>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Household<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="multi-gd-img">
										<ul class="multi-column-dropdown">
											<h6>All Household</h6>
											<li><a href="household.jsp">Cookware</a></li>
											<li><a href="household.jsp">Dust Pans</a></li>
											<li><a href="household.jsp">Scrubbers</a></li>
											<li><a href="household.jsp">Dust Cloth</a></li>
											<li><a href="household.jsp"> Mops </a></li>
											<li><a href="household.jsp">Kitchenware</a></li>
										</ul>
									</div>


								</div>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Personal Care<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="multi-gd-img">
										<ul class="multi-column-dropdown">
											<h6>Baby Care</h6>
											<li><a href="personalcare.jsp">Baby Soap</a></li>
											<li><a href="personalcare.jsp">Baby Care Accessories</a></li>
											<li><a href="personalcare.jsp">Baby Oil & Shampoos</a></li>
											<li><a href="personalcare.jsp">Baby Creams & Lotion</a></li>
											<li><a href="personalcare.jsp"> Baby Powder</a></li>
											<li><a href="personalcare.jsp">Diapers & Wipes</a></li>
										</ul>
									</div>

								</div>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Packaged Foods<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="multi-gd-img">
										<ul class="multi-column-dropdown">
											<h6>All Accessories</h6>
											<li><a href="packagedfoods.jsp">Baby Food</a></li>
											<li><a href="packagedfoods.jsp">Dessert Items</a></li>
											<li><a href="packagedfoods.jsp">Biscuits</a></li>
											<li><a href="packagedfoods.jsp">Breakfast Cereals</a></li>
											<li><a href="packagedfoods.jsp"> Canned Food </a></li>
											<li><a href="packagedfoods.jsp">Chocolates & Sweets</a></li>
										</ul>
									</div>


								</div>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Beverages<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="multi-gd-img">
										<ul class="multi-column-dropdown">
											<h6>Tea & Coeffe</h6>
											<li><a href="beverages.jsp">Green Tea</a></li>
											<li><a href="beverages.jsp">Ground Coffee</a></li>
											<li><a href="beverages.jsp">Herbal Tea</a></li>
											<li><a href="beverages.jsp">Instant Coffee</a></li>
											<li><a href="beverages.jsp"> Tea </a></li>
											<li><a href="beverages.jsp">Tea Bags</a></li>
										</ul>
									</div>

								</div>
							</ul></li> -->
						<li><a href="renderdata?categoryName=Groceries">Groceries</a></li>
						<li><a href="renderdata?categoryName=Household">House Hold</a></li>
						<li><a href="renderdata?categoryName=Personal Care">Personal Care</a></li>
						<li><a href="renderdata?categoryName=Packaged Foods">Packaged Foods</a></li>
						<li><a href="renderdata?categoryName=Beverages">Beverages</a></li>
						<li><a href="renderdata?categoryName=Gourmet">Gourmet</a></li>
						<li><a href="renderdata?categoryName=Special">Special</a></li>
						<li><a href="contact.jsp">Contact</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>