<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> <!--cdn 으로 jqueary 연결.   // min > 엔터를 다 뺀다. 압축됐다고 표현한다. 엔터를 다 빼주면 용량이 줄어들고, 다운로드 하기 편하다. 어글리코드라고 부른다.  -->
<script type="text/javascript">
// $ : document를 의미한다
$(function() { // document를 RAM에 dom tree로 다 읽어들였으면! 
	$('#b1').click(function() { /* $('button') < getelementbyid이다 */
		alert('버튼1을 클릭 하셨군요.!!!')
	})
	$('#b2').click(function() { /* $('button') < getelementbyid이다 */
		alert('버튼2을 클릭 하셨군요.!!!')
	})
	$('#b3').click(function() { /* $('button') < getelementbyid이다 */
		alert('버튼3을 클릭 하셨군요.!!!')
	})
})
</script>
</head>
<body>
	<button id = b1>push me1 !!</button>
	<button id = b2>push me2 !!</button>
	<button id = b3>push me3 !!</button>
</body>
</html>