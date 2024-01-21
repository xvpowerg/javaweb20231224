<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ page import="java.util.List,tw.com.beans.MyUser" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<%
List<MyUser> myUserList = (List)request.getAttribute("userList");


%>
</head>
<body>
	<%
	for(MyUser user: myUserList){	
	%>
	<p>name:<%=user.getName() %></p>
	<%} %>
	
	<c:forEach var="myUser" items="${userList}">
		<p>name:${myUser.name}</p>
		<p>age:${myUser.age}</p>
	</c:forEach>

</body>
</html>