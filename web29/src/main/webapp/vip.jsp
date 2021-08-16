<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	price = prompt('결제 금액을 입력하세요')
	cla = prompt ('등급을 입력하세요 1.vip고객 2.일반고객')
	
	price2 = parseInt(price)
function add() {
	if (cla == '1') {
		alert ('vip 고객님이 계산하실 금액은' + (price2 - price2 / 10) + '입니다')
	} else {
		alert ('일반 고객님이 계산하실 금액은 ' + (price2 + price2 / 10) + '입니다' )		
	}
}



</script>
</head>
<body>
<button onclick="add()"> 계산하기</button>
</body>
</html>