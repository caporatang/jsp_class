package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import shop.dto.회원bag;
import shop.dto.회원bag2;

public class 회원DAO2 {

	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	// 중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	// 파라메터, parameter
	public int create(회원bag2 bag) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 (타입 변수명;) 해야 만들어진다(선언!)
		// 선언의 위치가 변수의 생존범위를 결정한다.
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		// 지역변수는 자동초기화x, 쓰레기값 들어있는 상태!

		// 받아온 bag을 get을 이용해서 꺼낸다.
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name은 " + bag.getName());
		System.out.println("전달된 tel은 " + bag.getTel());

		int result = 0; // 메서드 안에서 선언된 변수는 모두 지역변수이다
		// 지역변수는 초기화를 해주어야 한다 try밖에 빼서 결과를 위한 선언이다 기존에 dao랑 비교햇 ㅓ복습하자
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "insert into member values (?, ?, ?, ?)";
			// String sql = "delete from member where id = 'win'";
			// PrepareStatment : sql을 나타내는 부품.
			// 부품을 램에 넣어놓은 주소만 잇으면 됨.
			// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음.!!!!!");

			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		return result;

	} // create

	// 하나의 이름으로 메서드 이름을 쓸 수 있다.
	// 입력값의 형태가 다양한 형태이어야 한다.
	// 다형성(오버로딩)
	public 회원bag2 read(회원bag2 bag) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 (타입 변수명;) 해야 만들어진다(선언!)
		// 선언의 위치가 변수의 생존범위를 결정한다.
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		// 지역변수는 자동초기화x, 쓰레기값 들어있는 상태!

		// 받아온 bag을 get을 이용해서 꺼낸다.
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name은 " + bag.getName());
		System.out.println("전달된 tel은 " + bag.getTel());

		ResultSet rs = null; // resultset 으로 리턴을 받아와야 하고 초기화는 참조형이기 때문에 null로 한다.
		// 지역변수는 초기화를 해주어야 한다 try밖에 빼서 결과를 위한 선언이다 기존에 dao랑 비교해서 복습하자
		//try안에 만들면 인식을 못하므로 밖에다가 만들어야함.
		회원bag2 bag2 = new 회원bag2(); // 입력용 출력용 부품은 따로따로 만들어야함.
		
		try {
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from member where id = ? ";
			// String sql = "delete from member where id = 'win'";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			// result = ps.executeUpdate(); // executeUpdate(); << CUD 할때만 사용 read는 리턴이 1이
			// 아니기 떄문이
			rs = ps.executeQuery(); // read는 테이블 형태로 리턴 받는다.
			System.out.println("4. sql문 전송 전송");
		//	System.out.println("검색 결과는" + rs.next()); rs.next는 사용될때마다 내려가므로 두번 써주면 결과 없음이 나올것이다.
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); // apple rs.getString("컬럼명 사용 가능");
				String pw = rs.getString(2); // apple
				String name = rs.getString(3); // apple
				String tel = rs.getString(4); // apple
				System.out.println(id + " " + pw + " " + name + " " + tel);
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
			} else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음.!!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		return bag2;

	} // read end

	public ArrayList<회원bag2> read() { // 컨테이너로 한거번에 많은 양의 어레이리스트 가져오기
		// 메서드 안에서 만들어진 변수임.
		// 변수는 (타입 변수명;) 해야 만들어진다(선언!)
		// 선언의 위치가 변수의 생존범위를 결정한다.
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		// 지역변수는 자동초기화x, 쓰레기값 들어있는 상태!

		// 받아온 bag을 get을 이용해서 꺼낸다.
		
		ResultSet rs = null; // resultset 으로 리턴을 받아와야 하고 초기화는 참조형이기 때문에 null로 한다.
		// 지역변수는 초기화를 해주어야 한다 try밖에 빼서 결과를 위한 선언이다 기존에 dao랑 비교해서 복습하자
		//try안에 만들면 인식을 못하므로 밖에다가 만들어야함.
		
		//가방을 넣어줄 컨테이너를 하나 만들어주자.
		ArrayList<회원bag2> list = new ArrayList<회원bag2>();
		// 입력용 출력용 부품은 따로따로 만들어야함.
		
		try {
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from member";
			// String sql = "delete from member where id = 'win'";

			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setString(1, bag.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			// result = ps.executeUpdate(); // executeUpdate(); << CUD 할때만 사용 read는 리턴이 1이
			// 아니기 떄문이
			rs = ps.executeQuery(); // read는 테이블 형태로 리턴 받는다.
			System.out.println("4. sql문 전송 전송");
		//	System.out.println("검색 결과는" + rs.next()); rs.next는 사용될때마다 내려가므로 두번 써주면 결과 없음이 나올것이다.
			while(rs.next()) { // 눈에 보이지는 않지만 db에도 커서가 있다 . 커서가 밑으로 옮겨지면서 검색한다. row개수만큼 반복하게 된다.
				System.out.println("검색 결과가 있음.");
				//rs.next가 true이면 row가 존재하므로 가방을 만들어서 table에서 하나의 row를 꺼내준다음 가방에 넣어야 한다.
				회원bag2 bag2 = new 회원bag2(); 
				String id = rs.getString(1); // apple rs.getString("컬럼명 사용 가능");
				String pw = rs.getString(2); // apple
				String name = rs.getString(3); // apple
				String tel = rs.getString(4); // apple
				System.out.println(id + " " + pw + " " + name + " " + tel);
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
				//만들어진 가방에 컨테이너에 넣어주어야 한다.
				list.add(bag2); // row의 개수에 맞춰 돈다
			} 
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음.!!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		return list;

	} // read end
	
	
	public int update(회원bag2 bag) {
		// 받아온 bag을 get을 이용해서 꺼낸다.
		int result = 0;
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "update member set tel = ?, name = ? where id = ?";
			// String sql = "delete from member where id = 'win'";
			// PrepareStatment : sql을 나타내는 부품.
			// 부품을 램에 넣어놓은 주소만 잇으면 됨.
			// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음.!!!!!");

			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}

		return result;
	}// update

	public int delete(회원bag bag) {
		// 받아온 bag을 get을 이용해서 꺼낸다.
		System.out.println("전달된 id는 " + bag.getTitle());
		System.out.println("전달된 pw는 " + bag.getWriter());
		System.out.println("전달된 name은 " + bag.getContent());

		int result = 0;
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "delete from member where id = ?";
			// String sql = "delete from member where id = 'win'";
			// PrepareStatment : sql을 나타내는 부품.
			// 부품을 램에 넣어놓은 주소만 잇으면 됨.
			// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음.!!!!!");

			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}

		return result;

	} // delete

}
 