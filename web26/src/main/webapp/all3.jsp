<%@page import="shop.dto.productDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
	<%
	
	
	productDAO dao = new productDAO();
	ArrayList<productDTO> dto = dao.read();
	
	
	
	
	%>    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=dto %>
</body>
</html>