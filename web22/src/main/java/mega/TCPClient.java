package mega;

import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 2000; i++) {
			//클라이언트 객체를 생성하자.
			Socket client = new Socket("localhost", 9100); //socket << 생성자 .. 눈에 안보여도 생성자 안에 이미 코드가 되어있기 때문에, 서버와 연결이 되는것이다.
			System.out.println("client request ----" + i); // 내 자리에 있는 ip , 포트로 코딩 되어 있을것이다.
		}
		
	}

}
