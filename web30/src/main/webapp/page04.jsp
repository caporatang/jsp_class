<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    int count = (int)session.getAttribute("count");  // Object이 int보다 더 큰 개념이다. <----변환 - int(small)
    //Object(big) --강제변환 해주어야 한다--> int(small)
    count++;
    session.setAttribute("count", count);
    %>
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count : <%= session.getAttribute("count") %> <!-- =${count} // 세션찍을때 찍어도된다. 앞에 써있는 프린트와 같은것이다.  -->
</body>
</html>