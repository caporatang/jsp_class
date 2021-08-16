<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    String id = request.getParameter("id");
    
    게시판Bag dto = new 게시판Bag();
    dto.setId(id);
    
    게시판DAO dao = new 게시판DAO();
    게시판Bag bag = dao.read(dto);
    
    %>
    
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 게시물 검색 결과</h3>
<hr color="blue">
<table border=1>
			
<tr>
	<td>아이디</td>
	<td>제 목</td>
	<td>내 용</td>
	<td>작성자</td>
</tr>

<tr>
	<td><%=bag.getId() %></td>
	<td><%=bag.getTitle() %> </td>
	<td><%=bag.getContent() %></td>
	<td><%=bag.getWriter() %></td>
	</tr>
</table>
</body>
</html>