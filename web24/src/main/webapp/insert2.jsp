<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.회원bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		// 1.게시판에 입력한 값을 가지고 와야한다.
		//2.가방을 만들어서 1번의 값들을 넣어준다.
		//3 게시판 dao를 만들어서  create기능을 처리하라고 메서드 호출한다.
		// 	2번에서 만든 가방을 입력값으로 주어야한다.
		//4. html로 알려주세요
		
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		회원bag bag = new 회원bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
			
		게시판DAO da = new 게시판DAO();
		da.create(bag);
	%>    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
sql문을 전송함.
</body>
</html>