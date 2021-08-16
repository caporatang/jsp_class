<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b3').click(function() {
			
			in3Tag = $('#content')
			in3Value = in3Tag.val()
			$('#result1').append(in3Value + '<br>')
			in3Tag.val('')
			
			
		})
	})
			
			/* 
			conValue = $('#content').val()
			//alert(conValue) 값이 넘어오는지 확인 .
			result1Tag = $('#result1')
			result1Tag.append(conValue + '<br>')
			conValue.val(''); */
</script>
</head>
<body>
	댓글입력 :
	<input id='content'>
	<button id='b3'>댓글달기</button>
	<hr color=red>
	<div id='result1'>댓글창</div>
</body>
</html>