/*
* 작성일자 : 2021.8. 21
* 작성자 : 김태일
* 최종수정내용 : 배열 적용
 */

	
	function add(x, y) {
		
	
		console.log('더하기 기능 정의할 예정이다. + (x + y)')
	}
	function minus(x, y) {
		
		console.log('빼기 기능 정의할 예정이다. + (x -y)')
	}
	
	
	function move() {
		site = prompt('1)naver, 2)daum, 3)google')
		if (site == '1') {
			location.href = 'http://www.naver.com'
		}else if (site == '2') {
			location.href = 'http://www.daum.net'
		}else if (site == '3') {
			location.href = 'http://www.google.com'
		}else{
			alert('해당 사이트가 없습니다.')
		}
	}
