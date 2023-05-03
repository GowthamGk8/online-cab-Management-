<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<linK  href="css/main.css"  rel="stylesheet"/>

<title>Login</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<br>

    <div class="container">
    <div class="row">
      <div class="col-4">

      <h2 style="color:#f7b733";>Welcome to MyTaxi!</h2>
      <br>
      <h3>Book Your trip Online Now</h3>
      <p>We at Maran Cabs located in Chennai,Tamil Nadu are engrossed in offering well-maintained and the best quality Cars
       and Tempo travellers on hiring (Rental) basis</p>
       
       <p>We at Maran Cabs located in Chennai, Tamil Nadu are engrossed in offering well-maintained and the best quality Cars 
       and Tempo travellers on hiring (Rental) basis</p>
     
      </div>
      <div class="col-2">
      
      </div>
      <div class="col-6">

 <div class="register">
<h1 style="color:#f7b733;">MyTaxi</h1>
<h3>Login to your Account</h3>
<br>
		<form action="login" method="post">
			<table>
				<tr>
					<td><h5>User name</h5></td> 
					</tr>
					<tr>
					<td><input type="text" name="username" required/></td>
				</tr>		
				<tr>
					<td><h5>Password</h5></td>
					<tr/>
					<tr>
					<td><input type="password" name="password" required/></td>
				  </tr>
				<tr>
					<td><input type="submit" value="Login"/></td>
				</tr>
				<tr><td>
				<p>Not have account?</p><a href="register.jsp">Sign up Here</a>
				</td>
				</tr>
			</table>
		</form>	
</div>
    
  
</body>
</html>