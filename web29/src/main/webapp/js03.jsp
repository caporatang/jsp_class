<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
num1 = prompt('첫번째 숫자를 입력하세요')
num2 = prompt('두번째 숫자를 입력하세요')

num3 = parseInt(num1)
num4 = parseInt(num2)
alert('두 수를 더한 결과는 ' + (num3 + num4) + '입니다')
alert('두 수를 뺀 결과는' + (num3 - num4) + '입니다')
alert('두 수를 곱한 결과는' + (num3 * num4) + '입니다')
alert('두 수를 나눈 결과는' + (num3 / num4) + '입니다')

</script>
</head>
<body>

</body>
</html>