<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@page import ="tw.com.beans.MyItem" %>    
<%@page import ="tw.com.beans.MyUser" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
  MyItem item = (MyItem)request.getAttribute("Item1");
  MyUser user = (MyUser)session.getAttribute("User1");
  
%>
<body>
	<p>Item</p>
	<p>name:<%=item.getName() %> price:<%=item.getPrice() %></p>
	<p>User</p>
	<p>name:<%=user.getName()%> age:<%=user.getAge() %></p>
</body>
</html>