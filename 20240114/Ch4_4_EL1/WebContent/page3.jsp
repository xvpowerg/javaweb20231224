<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@page import="java.util.Map,tw.com.beans.MyUser" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<% Map<String,MyUser> myUserMap  = (Map)request.getAttribute("userMap") ;

%>
</head>
<body>
	<h3>Jsp Map</h3>
	<p>name:<%=myUserMap.get("user1_Ken").getName() %></p>
	<p>name:<%=myUserMap.get("user2 Vivin").getName() %></p>
	
	<h3>EL Map</h3>
	<p>name:${userMap.user1_Ken.name}</p>
	<p>name:${userMap["user2 Vivin"].name }</p>
</body>
</html>