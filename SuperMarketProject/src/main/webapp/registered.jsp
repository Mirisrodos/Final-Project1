<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/includes/header.jsp"/>
        <!-- //navigation -->
        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                    <li class="active">Register Page</li>
                </ol>
            </div>
        </div>
        <!-- //breadcrumbs -->
        <!-- register -->
        <div class="register">
            <div class="container">
                <h2>Register Here</h2>
                <div class="login-form-grids">
                    <h5>profile information</h5>
                    
                    <!-- Form Dang nhap -->
                    <form action="registered" method="post">
                        <input type="text" placeholder="Name..." name="userName" required>
                        <input type="text" placeholder="Address..." name="userAddress" required>
                        <input type="text" placeholder="Phone..." name="userPhone" required>
                    <!--  
                    <div class="register-check-box">
                        <div class="check">
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i> </i>Subscribe to Newsletter</label>
                        </div>
                    </div>
                    -->
                    <h6>Login information</h6>
                    <!-- <form action="#" method="post"> -->
                        <input type="email" placeholder="Email Address" name="userEmail" required>
                        <input type="password" placeholder="Password" name="userPassword" required>
                        <!-- Kiểm tra password và confirmPassword -->
                        <input type="password" placeholder="Password Confirmation" name="" required>
                        <div class="register-check-box">
                        <!-- Xử checkbox phải true mới được bấm submit -->
                            <div class="check">
                                <label class="checkbox"><input type="checkbox" name="checkbox" required><i> </i>I accept the terms and conditions</label>
                            </div>
                        </div>
                        <input type="submit" value="Register">
                    </form>
                </div>
                <div class="register-home">
                    <a href="index.jsp">Home</a>
                </div>
            </div>
        </div>
        <!-- //register -->
        <!-- //footer -->
        <c:import url="/includes/footer.jsp" />