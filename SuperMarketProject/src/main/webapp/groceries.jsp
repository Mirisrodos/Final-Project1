<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/includes/header.jsp"/>
        <!-- //navigation -->
        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                    <li class="active">Groceries</li>
                </ol>
            </div>
        </div>
        <!-- //breadcrumbs -->
        <!--- groceries --->
        <div class="products">
            <div class="container">
                <div class="col-md-4 products-left">
                    <div class="categories">
                        <h2>Categories</h2>
                        <ul class="cate">
                            <!--<li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Fruits And Vegetables</a></li>
                            <ul>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Cuts & Sprouts</a></li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Flowers</a></li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Fresh Herbs & Seasonings</a></li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Fresh Vegetables</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>International Vegetables</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Organic Fruits & Vegetables</a></li>
                            </ul>
                            <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Grocery & Staples</a></li>
                            <ul>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Dals & Pulses</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Dry Fruits</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Edible Oils & Ghee</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Flours & Sooji</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Masalas & Spices</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Organic Staples</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Rice & Rice Products</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Salt, Sugar & Jaggery</a></li>
                            </ul>
                            <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>PersonalCare</a></li>
                            <ul>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Baby Care</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Cosmetics</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Deos & Perfumes</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Skin Care</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Sanitary Needs</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Oral Care</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Personal Hygiene</a> </li>
                                <li><a href="products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Shaving Needs</a></li>
                            </ul>-->
                            <li><a href="groceries.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Groceries</a></li>
                            <li><a href="household.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>House Hold</a></li>
                            <li><a href="personalcare.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Personal Care</a></li>
                            <li><a href="packagedfood.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Packaged Food</a></li>
                            <li><a href="beverages.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Beverages</a></li>
                            <li><a href="gourmet.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Gourmet</a></li>
                            <li><a href="offers.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>Special</a></li>
                        </ul>
                    </div>																																												
                </div>
                <div class="col-md-8 products-right">
                    <div class="products-right-grid">
                        <div class="products-right-grids">
                            <div class="sorting">
                                <select id="country" onchange="change_country(this.value)" class="frm-field required sect">
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Default sorting</option>
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Sort by popularity</option> 
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Sort by average rating</option>					
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Sort by price</option>								
                                </select>
                            </div>
                            <div class="sorting-left">
                                <select id="country1" onchange="change_country(this.value)" class="frm-field required sect">
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Item on page 9</option>
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Item on page 18</option> 
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>Item on page 32</option>					
                                    <option value="null"><i class="fa fa-arrow-right" aria-hidden="true"></i>All</option>								
                                </select>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                    <c:forEach var = "i" begin = "0" end = "${ total-1 }" step = "3" varStatus = "status">    
                    	<div class="agile_top_brands_grids"> 
                    	<c:forEach var = "product" items="${ products }" begin = "${ status.index }" end = "${ status.index + 2}">                 
                        <div class="col-md-4 top_brand_left">
                            <div class="hover14 column">
                                <div class="agile_top_brand_left_grid">
                                    <div class="agile_top_brand_left_grid_pos">
                                        <img src="images/offer.png" alt=" " class="img-responsive">
                                    </div>
                                    <div class="agile_top_brand_left_grid1">
                                        <figure>
                                            <div class="snipcart-item block">
                                                <div class="snipcart-thumb">
                                                    <a><img title=" " alt=" " src='images/${product.productImage}'></a>		
                                                    <p>${product.productName}</p>
                                                    <h4>$ ${product.quantity}</h4>
                                                </div>
                                                <div class="snipcart-details top_brand_home_details">
                                                    <form action="#" method="post">
                                                        <fieldset>
                                                            <input type="hidden" name="cmd" value="_cart">
                                                            <input type="hidden" name="add" value="1">
                                                            <input type="hidden" name="business" value=" ">
                                                            <input type="hidden" name="item_name" value="Fortune Sunflower Oil">
                                                            <input type="hidden" name="amount" value="55.00">
                                                            <input type="hidden" name="discount_amount" value="1.00">
                                                            <input type="hidden" name="currency_code" value="USD">
                                                            <input type="hidden" name="return" value=" ">
                                                            <input type="hidden" name="cancel_return" value=" ">
                                                            <input type="submit" name="submit" value="Add to cart" class="button">
                                                        </fieldset>
                                                    </form>
                                                </div>
                                            </div>
                                        </figure>
                                    </div>
                                </div>
                            </div>
                        </div>                      
                        </c:forEach> 
                        <div class="clearfix"> </div>
                    </div>                               
                  	</c:forEach>
                                       
                    <nav class="numbering">
                        <ul class="pagination paging">
                            <li>
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <li class="active"><a href="#">1<span class="sr-only">(current)</span></a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li>
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <!--- groceries --->
        <!-- //footer -->
        <c:import url="/includes/footer.jsp" />