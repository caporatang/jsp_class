<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery -->
  <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
  <!-- iamport.payment.js -->
  <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>

<script type="text/javascript">

function pay() {
	nameValue = document.getElementById("name").value // 결제 위에 상품명
	moneyValue = document.getElementById("money").value // 결제 위에 상품명
	moneyValue2 = parseInt(moneyValue)
	var IMP = window.IMP; // 생략가능
	IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
	IMP.request_pay({ // { } 중간괄호 사이에 있는게 json이다
	pg : 'inicis', // version 1.1.0부터 지원.
	pay_method : 'card',
	merchant_uid : 'merchant_' + new Date().getTime(),
	name :  nameValue,
	amount : moneyValue2, // 금액
	buyer_email : 'iamport@siot.do',
	buyer_name : '구매자이름',
	buyer_tel : '010-1234-5678',
	buyer_addr : '서울특별시 강남구 삼성동',
	buyer_postcode : '123-456',
	m_redirect_url : 'www.yourdomain.com/payments/complete'
	}, 
	function(rsp) { // 위에 제이슨 정보들을 rsp에 넣어준다.
	if ( rsp.success ) {
	var msg = '결제가 완료되었습니다.';
	msg += '고유ID : ' + rsp.imp_uid;
	msg += '상점 거래ID : ' + rsp.merchant_uid;
	msg += '결제 금액 : ' + rsp.paid_amount;
	msg += '카드 승인번호 : ' + rsp.apply_num;
	console.log(msg)
	} else {
	var msg = '결제에 실패하였습니다.';
	msg += '에러내용 : ' + rsp.error_msg;
	console.log(msg)
	}
//	alert(msg)
	});
}// pay end


</script>

</head>
<body>
 결제금액 : <input id='money'> <br>
 주문명 : <input id = 'name'> <br>
<button onclick="pay()" style= "background: yellow; width: 100px; height:30px;"> 결제하기 버튼 @@ </button>
</body>
</html>