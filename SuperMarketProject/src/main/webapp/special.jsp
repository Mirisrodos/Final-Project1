<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/includes/header.jsp"/>
        <!-- //navigation -->
        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                    <li class="active">Special</li>
                </ol>
            </div>
        </div>
        <!-- //breadcrumbs -->
        <!-- top-brands -->
        <div class="top-brands">
            <div class="container">
                <h2>Special products of us</h2>
                <div class="grid_3 grid_5">
                    <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                        <ul id="myTab" class="nav nav-tabs" role="tablist">
                            <li role="presentation" class="active"><a href="#expeditions" id="expeditions-tab" role="tab" data-toggle="tab" aria-controls="expeditions" aria-expanded="true">All Products</a></li>
                            <li role="presentation"><a href="#tours" role="tab" id="tours-tab" data-toggle="tab" aria-controls="tours">Daily Special</a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div role="tabpanel" class="tab-pane fade in active" id="expeditions" aria-labelledby="expeditions-tab">
                                <div class="agile-tp">
                                    <h5>All Products</h5>
                                    <p class="w3l-ad">Our daily specials won't let you down, so don't miss out on anything every day.</p>
                                </div>
                                <c:forEach var = "i" begin = "0" end = "${ total/2 - 1 }" step = "3" varStatus = "status">
                                <div class="agile_top_brands_grids">
                                	<c:forEach var = "product" items="${ products }" begin = "${ status.index }" end = "${ status.index + 2}">
                                    <div class="col-md-4 top_brand_left">
                                        <div class="hover14 column">
                                            <div class="agile_top_brand_left_grid">
                                                <div class="agile_top_brand_left_grid_pos">
                                                    <img src="images/offer.png" alt=" " class="img-responsive" />
                                                </div>
                                                <div class="agile_top_brand_left_grid1">
                                                    <figure>
                                                        <div class="snipcart-item block" >
                                                            <div class="snipcart-thumb">
                                                                <a href="products.jsp"><img title=" " alt=" " src='images/${product.productImage}' /></a>		
                                                                <p>${product.productName}</p>
                                                                <div class="stars">
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star gray-star" aria-hidden="true"></i>
                                                                </div>
                                                                <h4>$ ${product.quantity}</h4>
                                                            </div>
                                                            <div class="snipcart-details top_brand_home_details">
                                                                <form action="#" method="post">
                                                                    <fieldset>
                                                                        <input type="hidden" name="cmd" value="_cart" />
                                                                        <input type="hidden" name="add" value="1" />
                                                                        <input type="hidden" name="business" value=" " />
                                                                        <input type="hidden" name="item_name" value="Fortune Sunflower Oil" />
                                                                        <input type="hidden" name="amount" value="20.99" />
                                                                        <input type="hidden" name="discount_amount" value="1.00" />
                                                                        <input type="hidden" name="currency_code" value="USD" />
                                                                        <input type="hidden" name="return" value=" " />
                                                                        <input type="hidden" name="cancel_return" value=" " />
                                                                        <input type="submit" name="submit" value="Add to cart" class="button" />
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
                            </div>    
                            <div role="tabpanel" class="tab-pane fade" id="tours" aria-labelledby="tours-tab">
                                <div class="agile-tp">
                                    <h5>Daily Special</h5>
                                    <p class="w3l-ad">We've pulled together all our advertised offers into one place, so you won't miss out on a great deal.</p>
                                </div>
                               <c:forEach var = "i" begin = "${ total / 2 }" end = "${ total-1 }" step = "3" varStatus = "status">
                                <div class="agile_top_brands_grids">
                                	<c:forEach var = "product" items="${ products }" begin = "${ status.index }" end = "${ status.index + 2}">
                                    <div class="col-md-4 top_brand_left">
                                        <div class="hover14 column">
                                            <div class="agile_top_brand_left_grid">
                                                <div class="agile_top_brand_left_grid_pos">
                                                    <img src="images/offer.png" alt=" " class="img-responsive" />
                                                </div>
                                                <div class="agile_top_brand_left_grid1">
                                                    <figure>
                                                        <div class="snipcart-item block" >
                                                            <div class="snipcart-thumb">
                                                                <a href="products.jsp"><img title=" " alt=" " src='images/${product.productImage}' /></a>		
                                                                <p>${product.productName}</p>
                                                                <div class="stars">
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star blue-star" aria-hidden="true"></i>
                                                                    <i class="fa fa-star gray-star" aria-hidden="true"></i>
                                                                </div>
                                                                <h4>$ ${product.quantity}</h4>
                                                            </div>
                                                            <div class="snipcart-details top_brand_home_details">
                                                                <form action="#" method="post">
                                                                    <fieldset>
                                                                        <input type="hidden" name="cmd" value="_cart" />
                                                                        <input type="hidden" name="add" value="1" />
                                                                        <input type="hidden" name="business" value=" " />
                                                                        <input type="hidden" name="item_name" value="Fortune Sunflower Oil" />
                                                                        <input type="hidden" name="amount" value="20.99" />
                                                                        <input type="hidden" name="discount_amount" value="1.00" />
                                                                        <input type="hidden" name="currency_code" value="USD" />
                                                                        <input type="hidden" name="return" value=" " />
                                                                        <input type="hidden" name="cancel_return" value=" " />
                                                                        <input type="submit" name="submit" value="Add to cart" class="button" />
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
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //top-brands -->
        <!-- //footer -->
        <c:import url="/includes/footer.jsp" />