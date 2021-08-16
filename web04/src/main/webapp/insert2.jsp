<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String word = request.getParameter("word");
    String kind = request.getParameter("kind");
    String sel = request.getParameter("sel");
    String date = request.getParameter("date");
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버</title>
</head>
<body>
<h3>문제풀이 받은값~</h3>
<hr color="blue">
 받은 제목 <%=title %> <br>
 받은 글쓴이 <%=writer %> <br>
 받은 내용 <%=word %> <br>
 받은 종류 <%=kind %> <br>
 받은 부서 <%=sel %> <br>
 받은 날짜 <%=date %> <br>

</body>
</html>