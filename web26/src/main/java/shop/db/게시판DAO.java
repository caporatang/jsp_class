package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;
import shop.dto.회원bag;
import shop.dto.회원bag2;

public class 게시판DAO {
	Connection con; //전역변수, 클래스 아래에 선언한 변수, 클래스 전체에서 접근하여 사용이 가능하다. 전역 변수는 자동 초기화..	
	
	
	
	//생성자 메서드, 생성자(constructor)
	//new 키워드로 객체 생성할 떄 클래스 이름과 동일한 메서드가 있으면 자동 호출되는 메서드
	//객체 생성시 자동으로 꼭 해야하는 작업이 있는 경우, 이 생성자 안에 넣어 놓으면 무조건 처리 하게 할 수 있다.
	
	public 게시판DAO() {
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "fender601";
			  con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	//메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//			  중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	//			  파라메터, parameter
	public void create(회원bag bag) {
		//메서드 안에서 만들어진 변수임. 
		//변수는 (타입 변수명;) 해야 만들어진다(선언!)
		//선언의 위치가 변수의 생존범위를 결정한다.
		//파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		
		
		
		// 받아온 bag을 get을 이용해서 꺼낸다.
		System.out.println("전달된 id는 " + bag.getTitle());
		System.out.println("전달된 pw는 " + bag.getWriter());
		System.out.println("전달된 name은 " + bag.getContent());
		

		 try {
			  //3. sql문을 만든다.
			  String sql = "insert into board values (?, ?, ?, ?)";
			  //String sql = "delete from member where id = 'win'";
			  //PrepareStatment : sql을 나타내는 부품.
			  //부품을 램에 넣어놓은 주소만 잇으면 됨.
			  //ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getTitle());
			  ps.setString(3, bag.getContent());
			  ps.setString(4, bag.getWriter());
			  
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);

		} catch (SQLException e) { // 2-4단계 
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		
		
		
	}
	//하나의 이름으로 메서드 이름을 쓸 수 있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성(오버로딩)
	public 게시판Bag read(게시판Bag bag) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 (타입 변수명;) 해야 만들어진다(선언!)
		// 선언의 위치가 변수의 생존범위를 결정한다.
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		// 지역변수는 자동초기화x, 쓰레기값 들어있는 상태!

		// 받아온 bag을 get을 이용해서 꺼낸다.

		ResultSet rs = null; // resultset 으로 리턴을 받아와야 하고 초기화는 참조형이기 때문에 null로 한다.
		// 지역변수는 초기화를 해주어야 한다 try밖에 빼서 결과를 위한 선언이다 기존에 dao랑 비교해서 복습하자
		//try안에 만들면 인식을 못하므로 밖에다가 만들어야함.
		게시판Bag bag2 = new 게시판Bag(); // 입력용 출력용 부품은 따로따로 만들어야함.
		
		try {
			

			// 3. sql문을 만든다.
			String sql = "select * from board where id = ? ";
			// String sql = "delete from member where id = 'win'";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			// result = ps.executeUpdate(); // executeUpdate(); << CUD 할때만 사용 read는 리턴이 1이
			// 아니기 떄문이다
			rs = ps.executeQuery(); // read는 테이블 형태로 리턴 받는다.
			System.out.println("4. sql문 전송 전송");
		//	System.out.println("검색 결과는" + rs.next()); rs.next는 사용될때마다 내려가므로 두번 써주면 결과 없음이 나올것이다.
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); // apple rs.getString("컬럼명 사용 가능");
				String title = rs.getString(2); // apple
				String content = rs.getString(3); // apple
				String writer = rs.getString(4); // apple
				System.out.println(id + " " + title + " " + content + " " + writer);
				bag2.setId(id);
				bag2.setContent(content);
				bag2.setTitle(title);
				bag2.setWriter(writer);
			} else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		return bag2;

	} // read
	
	
	
	
	
	public ArrayList<게시판Bag> read() { // 한거번에 여러개 로우 가지고 오기
		//DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어 주어야 한다.
		ArrayList<게시판Bag> list = new ArrayList<게시판Bag>();

		ResultSet rs = null; 
		
		
		try {
		
			// 3. sql문을 만든다.
			String sql = "select * from board";
			// String sql = "delete from member where id = 'win'";

			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setString(1, bag.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			// result = ps.executeUpdate(); // executeUpdate(); << CUD 할때만 사용 read는 리턴이 1이
			// 아니기 떄문이다
			rs = ps.executeQuery(); // read는 테이블 형태로 리턴 받는다.
			System.out.println("4. sql문 전송 전송");
		//	System.out.println("검색 결과는" + rs.next()); rs.next는 사용될때마다 내려가므로 두번 써주면 결과 없음이 나올것이다.
			
			//1. Rs.next로 있는지 체크.
			//2. rs.next가 트루이면 가방 만들고 가방에 넣고 list에 가방을 넣는다. 
			// rs.next가 false일때까지
			while (rs.next()) {
				게시판Bag bag2 = new 게시판Bag();
				System.out.println("검색 결과가 있음.");
				//String id = rs.getString(1); // apple rs.getString("컬럼명 사용 가능");
				//String title = rs.getString(2); // apple
				//String content = rs.getString(3); // apple
				//String writer = rs.getString(4); // apple
				//System.out.println(id + " " + title + " " + content + " " + writer);
				bag2.setId(rs.getString(1));
				bag2.setTitle(rs.getString(2));
				bag2.setContent(rs.getString(3));
				bag2.setWriter(rs.getString(4));
				System.out.println(bag2);
				list.add(bag2);
			} 
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		return list;

	} // read
		
	
	public void update() {

	}

	public void delete() {

	}

}
