<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<Link rel="stylesheet" href="css/out.css">

<script type="text/javascript">
id = prompt('아이디를 입력하세요')
pw = prompt('비밀번호를 입력하세요')

function log() {
	if (id == 'root' && pw == 'pass' ) {
		location.href = 'http://www.naver.com'
	} else{
		location.href = 'http://www.daum.net'
	}
}
</script>
</head>
<body>
<button style="background : gray;" onclick="log()">로그인</button> 
</body>
</html>