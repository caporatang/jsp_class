<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 세션을 끊어주는 처리를 해야한다.  -->



	<%
		//id 세션만 제거하고자 하는 경우
		//session.removeAttribute("id");
	
		//모든 세션 잡은 것을 없애고자 하는 경우, 로그아웃 같은 경우 모두 끊는것이 맞다.
		session.invalidate();
		//response: 서버가 클라이언트에게 특정한 처리를 하라고 명령할 때 사용한다.
		//request : 클라이언트롭주터 넘어온 데이터를 받을 때 사용한다. 
		response.sendRedirect("login.jsp");
		
	%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>