<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/includes/header.jsp"/>
        <!-- //navigation -->
        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <div class="container">
                <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                    <li class="active">Login Page</li>
                </ol>
            </div>
        </div>
        <!-- //breadcrumbs -->
        <!-- login -->
        <div class="login">
            <div class="container">
                <h2>Login Form</h2>
                    
                <!--Form dang nhap  -->
                <div class="login-form-grids animated wow slideInUp" data-wow-delay=".5s">
                    <form action="login" method="post">
                        <input type="email" placeholder="Email Address" name='userEmail' required>
                        <input type="password" placeholder="Password" name='userPassword' required >
                        <div class="forgot">
                            <a href="#">Forgot Password?</a>
                        </div>
                        <input type="submit" value="Submit">
                    </form>
                </div>
                <h4>For New People</h4>
                <p><a href="registered.jsp">Register Here</a> (Or) go back to <a href="index.jsp">Home<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></p>
            </div>
        </div>
        <!-- //login -->
        <!-- //footer -->
        <c:import url="/includes/footer.jsp" />