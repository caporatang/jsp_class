<%@page import="java.util.ArrayList"%>
<%@page import="shop.dto.게시판Bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    <%
    
    게시판DAO dao = new 게시판DAO();
    ArrayList<게시판Bag> list = dao.read(); //ArrayList<게시판Bag>
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시물 전체 개수 <%=list.size() %> 개 <br>
<hr>
<%= list %>
<hr color ="red">

<%
for(int i = 0; i < list.size(); i++){
게시판Bag dto = list.get(i);

%>

게시판 id : <%= dto.getId() %> <br>
게시판 title : <%=dto.getTitle() %> <br>
게시판 content : <%=dto.getContent() %> <br>
게시판 writer : <%= dto.getWriter() %> <br><br>
<%} %>
<hr color ="blue">

<%
for(게시판Bag dto : list){

%>

게시판 id : <%= dto.getId() %> <br>
게시판 title : <%=dto.getTitle() %> <br>
게시판 content : <%=dto.getContent() %> <br>
게시판 writer : <%= dto.getWriter() %> <br><br>
<%} %>



<hr color ="green">
<table border=1>
<tr>
	<td>아이디</td>
	<td>제 목</td>
	<td>내 용</td>
	<td>작성자</td>
</tr>

<%
for(게시판Bag dto : list){
%>

<tr bgcolor ="pink">
	<td><%= dto.getId() %></td>
	<td>
	<a href="http://localhost:8889/web26/read2.jsp?id=<%= dto.getId() %>">
		<%= dto.getTitle() %>
	</a>
	</td>
	<td><%=dto.getContent() %> </td>
	<td><%= dto.getWriter() %></td>
</tr>

<%} %>


</table>

</body>
</html>