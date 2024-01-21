<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<%
	  boolean isPass = (Boolean)session.getAttribute("isPass");
	%>
	<%if (isPass){ %>
	<p>Pass</p>
	<%}else{ %>
	<p>Fail</p>
	<%} %>
</body>
</html>