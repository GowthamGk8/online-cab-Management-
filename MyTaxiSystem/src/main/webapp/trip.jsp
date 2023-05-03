<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<linK  href="css/main.css"  rel="stylesheet"/>
<title>Trip Booking</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<br>
   <div class="container">
    <div class="row">
      <div class="col-5">
     <form action="Trip" method="post">
       <table>
       <h2 style="color:#f7b733;">MyTaxi</h2>
       <h3 style="color:blue;">Have a Nice Trip...</h3>
       <br>
             <tr>
				<td><h3>Pick-up Location</h3></td>
			</tr>
			<tr>
				<td><input type="text" name="pickup" required/></td>
			</tr>
			 <tr>
				<td><h3>Drop Location</h3></td>
			  </tr>
			  <tr>
				<td><input type="text" name="droplocation" required/></td>
			</tr>
			 <tr>
				<td><h3>Enter a Mobile Number</h3></td>
			</tr>
			<tr>
				<td><input type="number" name="mobile" required/></td>
			</tr>	
			<tr>
				<td><h3>Departure Time</h3></td>
				</tr>
				<tr>
				<td><input type="text" name="time" required/></td>
				</tr>
				<tr>
				<td><h3>Departure Date</h3></td>
				</tr>
				<tr>
				<td><input type="text" name="date" required/></td>
			</tr>		 
			<tr>
			<td><input type="submit" value="Process to Booking"/></td>
			</tr>
        </table>
        </form>

      </div>
      <div class="col-1">

      </div>
      <div class="col-6">
      <br>
      <br>
      <br>
       <h1 style="color:#f7b733; font-size:50px ">Welcome to MyTaxi!</h1>
       <h2>&nbsp;Save 30%<br>&nbsp;&nbsp;&nbsp;EveryDay Ride Only...</h2>
       <h1 style="color:#f7b733; font-size:100px; text-align:center ">MyTaxi</h1>
       <h2>Get More REWARDS & SAVE MONEY </h2>
       <div id="sinup">
       <a href="register.jsp"><h1 style="font-size:50px">Sing up</h1></a>
       </div>
      </div>
    </div>
  </div>

     
       
        
</body>
</html>