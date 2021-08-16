<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String com = request.getParameter("com");
    String tel = request.getParameter("tel");
    String gender = request.getParameter("gender");
    String word = request.getParameter("word");
    String hobby[] = request.getParameterValues("hobby");
    
    String result="";
    if(hobby != null){
    	for(String s: hobby){
    		result += s + " ";
    	}
    }else{
    	result = "없음 !";
    }
    
    
    
    
    %>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= id %> <br>
<%= pw %> <br>
<%= name %> <br>
<%= com %> <%= tel %> <br>
<%= gender %> <br>
<%= word %> <br>
<%= result %> <br>


</body>
</html>