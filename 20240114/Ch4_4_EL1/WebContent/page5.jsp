<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<%
boolean canShow = (Boolean)application.getAttribute("canShow");

%>
<%if (canShow) {%>
		<img width="30%"  height="30%" alt="Donut" src="Donut.png">
<%} %>	

<c:if test="${canShow}">
	<img width="30%"  height="30%" alt="Donut" src="Donut.png">
</c:if>
	
</body>
</html>