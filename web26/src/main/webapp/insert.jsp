<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="shop.dto.회원bag2"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //전송된 데이터 받아줘야 함.
    //
    
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
    	int result = dao.create(bag); // result 에 성공(1) 실패(0)이 들어있을것이다
	String text = "회원 가입 실패했습니다. 재가입 해주세요";
    	if(result == 1){
    		text = "회원 가입 성공했습니다. 축하드립니다";
    	}
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
실행 결과는 <%= text %>

</body>
</html>