<%@page import="shop.dto.회원bag2"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
	// jsp에서 자동 import: 클릭후, 커맨드 + 쉬프트 + m 
    회원bag2 bag = new 회원bag2();
    bag.setId(id);
    bag.setPw(pw);
    bag.setName(name);
    bag.setTel(tel);
    
    회원DAO2 dao = new 회원DAO2();
    dao.create(bag);

    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
전송된 회원 정보의 sql문을 전송함
</body>
</html>