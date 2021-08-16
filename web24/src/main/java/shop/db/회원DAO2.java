package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.dto.회원bag2;

public class 회원DAO2 {
	
	
	
	
	
	//메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//			  중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	//			  파라메터, parameter
	public void create(회원bag2 bag) {
		//메서드 안에서 만들어진 변수임. 
		//변수는 (타입 변수명;) 해야 만들어진다(선언!)
		//선언의 위치가 변수의 생존범위를 결정한다.
		//파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		
		
		
		// 받아온 bag을 get을 이용해서 꺼낸다.
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name은 " + bag.getName());
		System.out.println("전달된 tel은 " + bag.getTel());
		
		
		
		 try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "fender601";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "insert into member values (?, ?, ?, ?)";
			  //String sql = "delete from member where id = 'win'";
			  //PrepareStatment : sql을 나타내는 부품.
			  //부품을 램에 넣어놓은 주소만 잇으면 됨.
			  //ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getPw());
			  ps.setString(3, bag.getName());
			  ps.setString(4, bag.getTel());
			  
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
				System.out.println("1번 에러 >> 드라이버 없음.!!!!!");

				e.printStackTrace();
		} catch (SQLException e) { // 2-4단계 
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		
		
		
	}
	//하나의 이름으로 메서드 이름을 쓸 수 있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성(오버로딩)
	public void read(String id) {

	}
	
	public void read() {

	}
	
	
	public void update() {

	}

	public void delete() {

	}

}
