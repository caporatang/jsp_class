<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    
     Cookie[] cookies = request.getCookies(); // 리턴타입이 배열이므로 배열로 변수에 넣어준다.
    for (Cookie c : cookies){
    	//out : 브라우저에 텍스트로 프린트하고자 하는 경우이다.
    	// get name 은 쿠키 들의 이름을 갖고온다.
    	//out.print(c.getName() + ", " + c.getValue() + "<br>"); //>> 다찍는경우
    	//쿠키의 이름이 age인 값만 프린트해보세요
    		if(c.getName().equals("age")){
    			out.print(c.getValue());
    		}
    }
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키의 개수는 : <%= cookies.length %> <!--표현식이라고 한다 , 프린트용  -->
</body>
</html>