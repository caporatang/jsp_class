<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Link rel="stylesheet" href="css/out.css">
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
	<jsp:include page="top2.jsp"></jsp:include>
	
	</div>
	<div id="center">
		<h3>게시판 하나 검색</h3>
			<form action="read3.jsp"> <!-- 여기서 입력한거 insert.jsp로 받아줘. -->
				ID: <input name="id"><br> 
				<button>게시판 하나 검색처리</button>
			</form>
		<h3>게시물 전체 검색</h3>
		<a href = 'all3.jsp'>전체 검색 페이지로</a>
	
	</div>
</div>


</body>
</html>