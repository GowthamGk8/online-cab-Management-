<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Enquiry us</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<br>
<br>
<br>
   <div class="container">
    <div class="row">
      <div class="col-4">
      <h1 style="color:#f7b733";>Welcome to MyTaxi!</h1>
      <br>
      <h2>Asking Questions or Defining problems</h2>
      <h2>Exploring Solutions Or explanation</h2>
      <p>A customer service desk that helps customer service teams manage incoming service requests. Also known as a support center, the customer service desk is the single point of contact for customer service in your business. This system helps your service team communicate with your company’s stakeholders, whether these 
      are external customers or internal employees
       within your organization.</p>
      </div>
      <div class="col-2">
      </div>
      <div  style="border:2px solid #FA709A;" class="col-6">
     <table>
     <br>
    <h2>ENQURIY FORM</h2>
         <form action="enquiry" method="post">
                 <tr>
				<td><h5>your Name</h5></td>
				<td><input type="text" name="name" required/></td>
				<tr>
				<td><h5>your Mobile Number&nbsp;</h5></td>
				<td><input type="text" name="mobile" required/></td>
			</tr>
			 <tr>
				<td><h5>Your Email</h5></td>
				<td><input type="text" name="email" required/></td>
			</tr>
			 <tr>
				<td><h5>Subject</h5></td>
				<td><input type="text" name="subject" required/></td>
			</tr>
			 <tr>
				<td><h5>Comment</h5></td>
				<td><input style="height:100px" type="text" name="comment" required/></td>
			</tr>
			<tr>
			<td><input style="text" type="submit" value="Enquriy"/></td>
			</tr>
			</form>
         </table>
      </div>
    </div>
  </div>
</body>
</html>