<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
<h1>검색된 게시판 정보입니다.</h1>




<hr>


<a href="bbs_list">
	<button> 게시판 전체 목록으로 가기 ! </button>
</a> <br>
<hr>
<!-- $를 사용한 출력은 속성으로 지정된 것만 출력 가능, 
     session, model속성으로 지정된 것만 가능. -->
검색된 id: ${dto.id} <br> <!-- dto.getId() -->
검색된 title: ${dto.title} <br>
검색된 content: ${dto.content} <br>
검색된 writer: ${dto.writer} <br>
<hr color= "green">
${list2}
</body>
</html>