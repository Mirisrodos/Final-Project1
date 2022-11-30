<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/includes/header.jsp"/>
        <!-- //navigation -->
        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <ol class="breadcrumb breadcrumb1">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                    <li class="active">Checkout Page</li>
                </ol>
            </div>
        </div>
        <!-- //breadcrumbs -->
        <!-- checkout -->
        <div class="checkout">
            <div class="container">
            	<c:choose>
            		<c:when test="${empty totalProduct}">
            			<h2>Your shopping cart contains: <span>0 PRODUCTS</span></h2>
            		</c:when>
            		<c:otherwise>
            			<h2>Your shopping cart contains: <span>${totalProduct} PRODUCTS</span></h2>
            		</c:otherwise>
            	</c:choose>      
            	<form>    
                <div class="checkout-right">
                    <table class="timetable_sub">
                        <thead>
                            <tr>
                                <th>SL No.</th>	
                                <th>Product</th>
                                <th>Quality</th>
                                <th>Product Name</th>

                                <th>Price</th>
                                <th>Remove</th>
                            </tr>
                        </thead>
                        <c:forEach var="item" items="${orderlist}" varStatus="status">
                        	<tr class="rem1">
	                            <td class="invert">${status.index + 1}</td>
	                            <td class="invert-image"><a><img src='images/${item.products.productImage}' alt=" " class="img-responsive" /></a></td>
	                            <td class="invert">
	                                <div class="quantity"> 
	                                    <div class="quantity-select">                           
	                                        <div class="entry value-minus">&nbsp;</div>
	                                        <div class="entry value"><span>${item.detailQuantity}</span></div>
	                                        <div class="entry value-plus active">&nbsp;</div>
	                                    </div>
	                                </div>
	                            </td>
	                            <td class="invert">${item.products.productName}</td>
	
	                            <td class="invert">${item.products.price}</td>
	                            <td class="invert">
	                                <div class="rem">
	                                    <a href="#"><div class="close1"></div></a>
	                                </div>                              
	                            </td>
                        	</tr>
                        </c:forEach>                      
                       
                        <!--  <tr class="rem2">
                            <td class="invert">2</td>
                            <td class="invert-image"><a href="single.jsp"><img src="images/2.png" alt=" " class="img-responsive" /></a></td>
                            <td class="invert">
                                <div class="quantity"> 
                                    <div class="quantity-select">                           
                                        <div class="entry value-minus">&nbsp;</div>
                                        <div class="entry value"><span>1</span></div>
                                        <div class="entry value-plus active">&nbsp;</div>
                                    </div>
                                </div>
                            </td>
                            <td class="invert">Fortune oil</td>

                            <td class="invert">$250.00</td>
                            <td class="invert">
                                <div class="rem">
                                    <div class="close2"> </div>
                                </div>
                                <script>$(document).ready(function (c) {
                                        $('.close2').on('click', function (c) {
                                            $('.rem2').fadeOut('slow', function (c) {
                                                $('.rem2').remove();
                                            });
                                        });
                                    });
                                </script>
                            </td>
                        </tr>
                        <tr class="rem3">
                            <td class="invert">3</td>
                            <td class="invert-image"><a href="single.jsp"><img src="images/3.png" alt=" " class="img-responsive" /></a></td>
                            <td class="invert">
                                <div class="quantity"> 
                                    <div class="quantity-select">                           
                                        <div class="entry value-minus">&nbsp;</div>
                                        <div class="entry value"><span>1</span></div>
                                        <div class="entry value-plus active">&nbsp;</div>
                                    </div>
                                </div>
                            </td>
                            <td class="invert">Aashirvaad atta</td>

                            <td class="invert">$15.00</td>
                            <td class="invert">
                                <div class="rem">
                                    <div class="close3"> </div>
                                </div>
                                <script>$(document).ready(function (c) {
                                        $('.close3').on('click', function (c) {
                                            $('.rem3').fadeOut('slow', function (c) {
                                                $('.rem3').remove();
                                            });
                                        });
                                    });
                                </script>
                            </td>
                        </tr> -->
                        <!--quantity-->
                        <script>
                            $('.value-plus').on('click', function () {
                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) + 1;
                                divUpd.text(newVal);
                            });

                            $('.value-minus').on('click', function () {
                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) - 1;
                                if (newVal >= 1)
                                    divUpd.text(newVal);
                            });
                        </script>
                        <!--quantity-->
                    </table>
                </div>        
                </form>          
                <div class="checkout-left">	
                    <div class="checkout-left-basket">
                        <h4>Continue to basket</h4>
                        <ul>
                            <li>Product1 <i>-</i> <span>$15.00 </span></li>
                            <li>Product2 <i>-</i> <span>$25.00 </span></li>
                            <li>Product3 <i>-</i> <span>$29.00 </span></li>
                            <li>Total Service Charges <i>-</i> <span>$15.00</span></li>
                            <li>Total <i>-</i> <span>$84.00</span></li>
                        </ul>
                    </div>       
                    <div class="checkout-center-basket">
                        <h4>Delivery Address</h4>
                        <p><b>(*) Please fill in the correct delivery address information (note Building: ABC... if any)</b></p>                
                        <input disabled="disabled" style='width:100%' type="text" name="fullName" value="${sessionScope.username}" required><br>
                        <input style='width:49%;margin-right:0.52em' type="text" name="phoneNumber" placeholder="Phone Number" required>
                        <input style='width:49%' type="text" name="province" placeholder="Province" required><br>
                        <input style='width:49%;margin-right:0.52em' type="text" name="district" placeholder="District" required>
                        <input style='width:49%' type="text" name="wards" placeholder="Wards" required><br>
                        <input style='width:100%' type="text" name="address" placeholder="Address" required><br>    
                        <input style="" type="submit" value="Pay"><br>   
                    </div>                       
                  <div class="clearfix"> </div>                               
                </div>
                
                <div class="checkout-left-basket">
                        <a href="single.jsp"><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Continue Shopping</a>
                </div>     
            </div>
        </div>
        <!-- //checkout -->
        <!-- //footer -->
       <c:import url="/includes/footer.jsp" />