<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("recent")==null){ // 
		ArrayList<String[]> recent = new ArrayList();  
		session.setAttribute("recent", recent); // 세션으로 잡은 값이 Null일 경우 recent라는 값을 세션으로 잡는다 //세션이 안잡히면 에러가 나기 때문이다.
	}
	ArrayList<String[]> result1 = (ArrayList)session.getAttribute("recent"); // 
								// 세션값이 null이 아닐 경우에 recent값을 가져와서 result1 배열안에 넣는다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.recent_product{
		/* 다른 애들보다 맨 앞에 있음. 맨 위 레이어라 생각하면 됨 */
		z-index : 1000;
		/* 화면 특정 위치에 아예 고정 시켜버리는거. 스크롤 영향 안받음 */
		position : fixed;
		/* position 건 애들은 top, bottom, left, right로 위치 조절함 */
		right: 0;
		/* Y축 정 가운데 위치하게 하는 방법 이 두가지를 사용함 */
  		top: 50%;
    	transform: translateY(-50%);
	}
	.recent_product ul{
		width : 100px;
	}
	.recent_product li{
		float : left;
	}
	.recent_product a{
		display : block;
	}
	
	.recent_product a img{
		width : 100px;
	}
</style>
</head>
<body>
	<div class="recent_product">
		<ul>
		
		<%
			for(int i=0;i< result1.size(); i++) {
		%>	
			<li><a href="<%= result1.get(i)[0] %>"><img src="<%= result1.get(i)[1] %>"></a></li>
	<%}%> <!-- for문으로 클릭할때마다 값을 가져오도록 하고,  result1.get(i)[0]이 형태가 되는 이유는 이중배열이 아니라 배열안에 있는 값을 가져와야되기 때문이다.-->
		</ul>
	</div>
</body>
</html>