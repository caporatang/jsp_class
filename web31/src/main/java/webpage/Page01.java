package webpage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//jsp가 서버에서 실행될 때는 자바프로그램으로 자동 코드 변경되어 실행된다.
//이렇게 자동생성되는 자바 코드를 서블릿이라고 부른다.
// servlet : server + let (릿, 작은 프로그램)
// JSP -- > Servlet : Tomcat내의 JSPd엔진 (서블릿 엔진)  < < < jsp에서 서블릿으로 바꿔주는건
// JSP내에 작성한 모든 자바 코드는 service() 메서드 안으로 들어가서 자동 생성된다.
// JSP내에 선언된 변수는 모두 지역변수이다. 지역변수는 초기화를 반드시 해주어야한다. <% ~ %> , 지역변수는 자동 초기화가 되지 않는다 
// 전역변수를 선언해서 사용하고자 하는 경우는 <%! ~~%> 전역변수 선언시 사용한다.
public class Page01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id"); 
		super.service(req, resp);
	}
	
	
	

	
	
}
