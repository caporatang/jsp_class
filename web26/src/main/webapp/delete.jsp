<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag"%>
<%@page import="shop.db.회원DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 탈퇴하는 sql문을 만들어서 전송
	
    	//가방 만들어서 넣자
		회원bag bag = new 회원bag();
    	bag.setId(id);
    	
    	회원DAO2 da = new 회원DAO2();
    	int result = da.delete(bag);
    	String text = "회원탈퇴에 실패 했습니다";
    	if (result == 1){
    		text = "회원탈퇴 되었습니다.";
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