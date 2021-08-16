<%@page import="shop.dto.회원bag2"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% // 스크립트릿 이라고 부르고, 서버에서 돌아가는 작성된 작은 프로그램
    
    
    /* while문으로 전부 다 가져오기 , 입력값은 따로 없다. list만 프린트 해준다. */
    회원DAO2 dao = new 회원DAO2();
    //jsp 파일에서 자동 import 단축키 : 클릭후, cmd + shift + m
    ArrayList<회원bag2> list = dao.read();
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= list %> <!-- 표현식이라고 한다. -->
</body>
</html>