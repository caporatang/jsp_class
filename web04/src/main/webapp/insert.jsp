<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<!--1. 클라이언트가 전송한 데이터들을 가지고 와야 한다.  -->
	
	<% //자바코드 넣어주는 부분이다. <% << 해줘야한다.
	//HttpServletRequest request = new HttpServletRequest(); << 이게 눈에는 안보이지만 만들어져 있다.
	String id = request.getParameter("id"); // getparameter 는 리턴값이 String 여러개 받을땐 사용하지 못한다.
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String com = request.getParameter("com");
	String tel = request.getParameter("tel");
	String gender = request.getParameter("gender");
	String word = request.getParameter("word");
	String hobby[] = request.getParameterValues("hobby"); // 여러개 받을때는 배열을 사용한다 배열안에 여러개를 넣는다.
	
	String result ="";
	if(hobby != null) {
		for(String s: hobby) {
			result += s + " ";
		}
	}else{
		result ="없음!";
	}
	%>
	
	<!--2. 서버가 받은 데이터를 dao를 통해서 db에 저장해야 한다.  -->    
	<!--3. DB처리에 따라 결과를 클라이언트에게 html로 알려주어야 한다.  -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 서버에서 받은 값들 정리</h3>
<hr color="blue">
서버에서 받은 아이디 <%=id %> <br>
서버에서 받은 비밀번호 <%=pw %> <br>
서버에서 받은 이름 <%=name %><br>
서버에서 받은 전화번호 <%=com %><%=tel %><br>
서버에서 받은 성별 <%=gender %><br>
서버에서 받은 하고 싶은 말 <%=word %><br>
서버에서 받은 취미 목록 : <%= result %><br>
</body>
</html>