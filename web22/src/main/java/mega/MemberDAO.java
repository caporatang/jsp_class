package mega;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MemberDAO {
			//자바에서 db처리할 때는 DML중심으로 클래스를 만든다.
			//db연결할 때는 "db를 단위로 연결" 한다.
		//db연결하여 데이터처리를 하는 클래스를 만들 때는 테이블 단위로 만든다.
		//테이블(enity, 개체)
		//create(insert~into values)
	
	public int create(String id, String pw, String name, String tel) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		
		//2. java에서 db로 연결:
		//연결할 주소 url(ip, port , db명), username, password
		String url = "jdbc:mysql://localhost:3306/shop";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shop db연결 성공!!!");
		//3. sql문을 만든다.
		String sql = "insert into member values (?, ?, ?, ?)";
		//String sql = "delete from member where id ='win''";
		//PrearedStatment : sql을 나타내는 부품이다.
		//부품을램에 넣어놓은 주소만 있으면 된다.
		//ps부품을 2단계에서 획득한 con 부품에 만들어서 리턴한다. 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. sql문 생성 성공");
		
		
		//4.sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.");
		System.out.println(result);
		System.out.println("SQL문 수행 개수 " + result + "개" );
		return result;
		
		
	}
}// create end