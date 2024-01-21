<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<h2>Page3</h2>
	
	<jsp:forward page="page4.jsp">
			<jsp:param value="Hello" name="msg"/>
	</jsp:forward>
</body>
</html>