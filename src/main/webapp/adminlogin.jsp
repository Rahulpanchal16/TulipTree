<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="meta.jsp" %>
<title>Admin Login</title>
<%@ include file="head.jsp" %>
</head>
<body >
<%@ include file="navbar.jsp" %>

<br><br>

               <div  class="col-lg-3 col-md-6">
                <h3 class="text-primary mb-4">Admin Login</h3>
                <form action="AdminLoginServlet" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control py-4" placeholder="Username" required="required" name="username" />
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control py-4" placeholder="Password"
                            required="required" name="password"/>
                    </div>
                    <div>
                        <button class="btn btn-primary btn-block border-0 py-3" type="submit">Login</button>
                    </div>
                </form>
            </div>
            
            
<%@ include file="footer.jsp" %>

 <!-- Back to Top -->
    <a href="#" class="btn btn-primary p-3 back-to-top"><i class="fa fa-angle-double-up"></i></a>


<%@ include file="foot.jsp" %>



</body>
</html>