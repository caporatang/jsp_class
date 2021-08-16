<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
Cookie[] list = request.getCookies();
for (Cookie c : list) {
	if (!c.getName().equals("JSESSIONID")) { // 세션 아이디와 같지 않으면
		//out.print(c.getValue() + "<br>");
	}
}
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>