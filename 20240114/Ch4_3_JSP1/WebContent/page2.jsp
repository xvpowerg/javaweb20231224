<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<!--  -->
	<%
	int count = (Integer)request.getAttribute("count");
	String title = (String)request.getAttribute("title");
	%>
	<h1><%=title %></h1>
	<ol>
	<%for(int i = 0; i < count;i++){ %>
		<li><%=(char)('A'+i) %></li>
	<%} %>
	</ol>
</body>
</html>