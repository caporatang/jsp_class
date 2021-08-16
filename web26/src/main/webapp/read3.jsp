<%@page import="shop.dto.productDTO"%>
<%@page import="shop.db.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    
   	String id = request.getParameter("id");
    
    productDTO dto = new productDTO();
    dto.setId(id);
    
    
    
    
    
    
    
    
    productDAO dao = new productDAO();
    
    productDTO dto2 = dao.read(dto); 
    
    
    
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
하나 검색 결과는 : <%= dto2 %>
</body>
</html>