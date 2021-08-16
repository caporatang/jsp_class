<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!--로그인.html 이랑 같이 복습할것. -->
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String id2 = "root";
    	String pw2 = "1234";
    	String result = "로그인 실패@@@";
    	if(id.equals(id2) && pw.equals(pw2)){
    		result = "로그인 성공!!!"; //else하는거보다 이게 더 좋은 코드이다.
    	}
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
회원정보는<br> 
id : <%= id %><br>
pw : <%= pw %>
<hr>
로그인 결과는 <%= result %>
</body>
</html>
