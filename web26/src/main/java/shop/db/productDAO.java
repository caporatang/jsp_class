package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.eclipse.jdt.internal.compiler.ast.SwitchStatement;

import shop.dto.productDTO;
import shop.dto.회원bag2;

public class productDAO {

	public productDTO read(productDTO dto) {

		ResultSet rs = null;
		productDTO dto2 = new productDTO();

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
			String sql = "select * from product where id = ? ";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());

			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery();

			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); // apple rs.getString("컬럼명 사용 가능");
				String name = rs.getString(2); // apple
				String content = rs.getString(3); // apple
				String price = rs.getString(4); // apple

				dto2.setId(id);
				dto2.setName(name);
				dto2.setContent(content);
				dto2.setPrice(price);

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
		return dto2;

	} // read end

	public ArrayList<productDTO> read() {
		ResultSet rs = null;

		ArrayList<productDTO> list = new ArrayList<productDTO>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");

			String sql = "select * from product where id like 'a100%'";

			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 생성 성공!!!");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			while (rs.next()) {

				System.out.println("검색 결과가 있음.");
				productDTO dto2 = new productDTO(); // 반복해서 만들어야 하기 때문에 반복문 안에 가방을 생성한다
				String id = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				String content = rs.getString(4);
				System.out.println(id + " " + name + " " + price + " " + content);

				dto2.setId(id);
				dto2.setName(name);
				dto2.setPrice(price);
				dto2.setContent(content);
				list.add(dto2);

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

}
