<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="h" uri="/WEB-INF/customtag.tld" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
	<%
			String message = "Hello !!!";
			pageContext.setAttribute("message", message);
	
	%>

</head>
<body>
	<div>
			<h:mybody message="${message}">
					<h2>�A�n!!${message}</h2>
			</h:mybody>
	
	</div>
</body>
</html>