<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="student" class="tw.com.web.Student"/>
		<jsp:setProperty property="*" name="student"/>
		<div>name:${student.stName}</div>
		<div>email:${student.stEmail}</div>
</body>
</html>