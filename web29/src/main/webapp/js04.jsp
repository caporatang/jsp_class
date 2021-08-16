<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

pw1 = prompt('비밀번호를 입력하세요')
pw2 = prompt('비밀번호를 한번 더 입력하세요')

if (pw1 == pw2) {
	alert ('비밀번호 확인 되었습니다')
} else {
	alert ('다시 입력하세요')
}

</script>
</head>
<body>

</body>
</html>