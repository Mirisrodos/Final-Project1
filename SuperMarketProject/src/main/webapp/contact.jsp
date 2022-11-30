<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/includes/header.jsp"/>
        <!-- //navigation -->
        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                    <li class="active">Contact</li>
                </ol>
            </div>
        </div>
        <!-- //breadcrumbs -->
        <!-- contact -->
        <div class="about">
            <div class="w3_agileits_contact_grids">
                <div class="col-md-6 w3_agileits_contact_grid_left">
                    <div class="agile_map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.4843009848687!2d106.76934737490892!3d10.850721389302555!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752763f23816ab%3A0x282f711441b6916f!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBTxrAgcGjhuqFtIEvhu7kgdGh14bqtdCBUcC4gSOG7kyBDaMOtIE1pbmg!5e0!3m2!1svi!2s!4v1669245649903!5m2!1svi!2s"></iframe>
                    </div>
                    <div class="agileits_w3layouts_map_pos">
                        <div class="agileits_w3layouts_map_pos1">
                            <h3>Contact Info</h3>
                            <p>No. 1 Vo Van Ngan, Thu Duc District, Ho Chi Minh City.</p>
                            <ul class="wthree_contact_info_address">
                                <li><i class="fa fa-envelope" aria-hidden="true"></i><a href="mailto:phanhongson234@gmail.com">phanhongson234@gmail.com</a></li>
                                <li><i class="fa fa-phone" aria-hidden="true"></i>(+84) 37221223</li>
                            </ul>
                            <div class="w3_agile_social_icons w3_agile_social_icons_contact">
                                <ul>
                                    <li><a href="https://www.facebook.com/thuanhoa.truong.7" class="icon icon-cube agile_facebook"></a></li>                                  
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 w3_agileits_contact_grid_right">
                    <h2 class="w3_agile_header">Leave a<span> Message</span></h2>

                    <form action="contact" method="get">
                        <span class="input input--ichiro">
                            <input class="input__field input__field--ichiro" type="text" id="input-25" name="Name" placeholder=" " required="" />
                            <label class="input__label input__label--ichiro" for="input-25">
                                <span class="input__label-content input__label-content--ichiro">Your Name</span>
                            </label>
                        </span>
                        <span class="input input--ichiro">
                            <input class="input__field input__field--ichiro" type="email" id="input-26" name="Email" placeholder=" " required="" />
                            <label class="input__label input__label--ichiro" for="input-26">
                                <span class="input__label-content input__label-content--ichiro">Your Email</span>
                            </label>
                        </span>
                        <textarea name="Message" placeholder="Your message here..." required=""></textarea>
                        <input type="submit" value="Submit">
                    </form>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <!-- contact -->

        <!-- //footer -->
        <c:import url="/includes/footer.jsp" />