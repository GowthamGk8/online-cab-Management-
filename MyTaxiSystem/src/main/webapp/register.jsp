<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<br>
<br>
<br>

<div  class="container">
    <div class="row">
      <div  style="border:2px solid #FA709A;" class="col-4">
     <h1 style="text-align:center;">Register</h1>
	<form action="register" method="post">
		<table >
			<tr>
				<td><h3>User Name &nbsp;</h3></td>
				</tr>
				<tr>
				<td><input type="text" name="username" required/></td>
			</tr>
			
			<tr>
				<td><h3>Email</h3></td>
				</tr>
				<tr>
				<td><input type="text" name="email" required/></td>
			</tr>
			<tr>
				<td><h3>Password</h3></td>
				</tr>
				<tr>
				<td><input type="password" name="password" required/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"/></td>
			</tr>
		</table>
	 </form>
      </div>
      
      <div class="col-2">
      
      </div>
      <div class="col-4">
      
      <h2 style="color:orange";>Welcome to MyTaxi!</h2>
      <br>
      <h3>Book Your trip Online Now</h3>
      <p>We at Maran Cabs located in Chennai,Tamil Nadu are engrossed in offering well-maintained and the best quality Cars
       and Tempo travellers on hiring (Rental) basis</p>
       
       <p>We at Maran Cabs located in Chennai, Tamil Nadu are engrossed in offering well-maintained and the best quality Cars 
       and Tempo travellers on hiring (Rental) basis</p>
      
      </div>
   
    </div>
  </div>
 
 

</body>
</html>