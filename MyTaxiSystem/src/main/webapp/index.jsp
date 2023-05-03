<%@page import="Com.Mytaxi.model.User"%>
<%@page import="Com.Mytaxi.Ulti.DatabaseUlti"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 
    <%
		User user = (User)session.getAttribute("user");
	%>
	
	<div id="main">
		<%if(user == null){ %>
		<jsp:include page="trip.jsp"></jsp:include>
			
		<%}
		if(user != null){
		%>
			<h1>Welcome, <%=user.getUsername() %></h1>
		<%} %>
	</div>

</body>
</html>