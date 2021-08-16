<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 1. 서버로 전송된 데이터를 받아야 한다. -->
<%
		//java코드를 사용
		//HttpServletRequest request = new ttpServletRequest(); 톰캣에 부품이 있어서 이건 안써줘도 되고 밑에부터 사용해주면 된다
		String id = request.getParameter("id"); // apple
		String pw = request.getParameter("pw"); // 1234
		String name = request.getParameter("name"); // apple
		String tel = request.getParameter("tel"); // 011
%>
<!-- 2. DB에 넣어야함  -->
<!-- 3. DB처리가 잘 되었는지 확인하는 메시지를 클라이언트에 보내주어야 한다. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
회원 정보가 잘 도착하였음..<br>
서버에 도착한 id는 <%= id %><br>
서버에 도착한 pw는 <%= pw %><br>
서버에 도착한 name은 <%= name %><br>
서버에 도착한 tel은 <%= tel %><br>
</body>
</html>