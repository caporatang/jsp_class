<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    
   	String id = request.getParameter("id");
    
  	회원bag2 bag = new 회원bag2();
  	bag.setId(id);
  	
  	회원DAO2 dao = new 회원DAO2();
  	회원bag2 bag2 = dao.read(bag);
    
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 정보 검색 결과입니다.</h3>
<hr>
검색된 id는 <%=bag2.getId() %><br>
검색된 pw는 <%=bag2.getPw() %><br>
검색된 name은 <%=bag2.getName() %><br>
<img src="img/<%= bag2.getTel() %>">
검색된 tel은 <%=bag2.getTel() %><br>

</body>
</html>