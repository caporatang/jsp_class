<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!--쿠키 정리문제   -->    
    
    <%
    //쿠키 바로 삭제는 setmaxage(0)으로 다시 심는다.
    
    //1.쿠키 객체를 만든다. 2개를 만든다.
    Cookie c1 = new Cookie("category", "운동");
    
	//2. 쿠키를 브라우저에 심는다.
	c1.setMaxAge(0); // setmaxage << 제거할때 사용한다.
   	response.addCookie(c1);
	    
    
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
saved in browser!!
</body>
</html>