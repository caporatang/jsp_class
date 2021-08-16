<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.db.회원DAO"%>
<%@page import="shop.dto.회원bag2"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    
    
    회원bag2 bag = new 회원bag2();
    bag.setId(id);
    bag.setName(name);
    bag.setTel(tel);
    
    
    회원DAO2 da = new 회원DAO2();
    int result = da.update(bag);
    String text = "회원정보 수정에 실패했습니다. 재입력 해주세요";
    if(result == 1){
    	text = "정보 수정에 성공했습니다.";
    }
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
실행 결과는 <%=text %>
</body>
</html>