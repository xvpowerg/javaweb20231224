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
	<c:choose>
			<c:when test="${show_image == 1}">
				<img width="30%"  height="30%" alt="Donut" src="check.png">
			</c:when>
			<c:when test="${show_image == 2}">
				<img width="30%"  height="30%" alt="Donut" src="Donut.png">
			</c:when>
			<c:when test="${show_image == 3}">
				<img width="30%"  height="30%" alt="Donut" src="fox1.png">
			</c:when>
			<c:otherwise>
				<p>Error</p>
			</c:otherwise>
	
	</c:choose>
	
	
</body>
</html>