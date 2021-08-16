<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!--cdn 으로 jqueary 연결.   // min > 엔터를 다 뺀다. 압축됐다고 표현한다. 엔터를 다 빼주면 용량이 줄어들고, 다운로드 하기 편하다. 어글리코드라고 부른다.  -->
<script>
$(function() {
	$('#b3').click(function() { // b3 버튼을 클릭하면,  
		conValue = $('#content').val // content에 있는 값을 가져와라.
		$('#result1').append(conValue + '<br>')
		conValue.val('')
		
	})
})


</script>
</head>
<body>
	댓글입력 :
	<input id='content'>
	<button id=b3>댓글달기</button>
	<hr color=red>
	<div id='result1'>댓글창</div>
</body>
</html>