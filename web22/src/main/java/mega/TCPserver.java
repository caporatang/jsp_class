package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPserver {

	
	//동작 방식 > 서버 먼저 살아있어야한다. > 무한루프로 계속 살린다.
	// request는 client 에서 socket요청 할때 연결된다. 
	
	
	
	
	public static void main(String[] args) throws Exception {
		//서버객체를 생성하자.
		ServerSocket se = new ServerSocket(9100);
		System.out.println("server start!!");
		
		
		
		int count = 0;
		while (true) { // 서버가 살아있을 경우에 서버가 스타트 되는것이므로 무한루프로 계속 승인한다
			System.out.println("wait request");
			se.accept(); // 서버 승인. 
			System.out.println("클라이언트가 연결됨..!!" + ++count);
			if(count == 1000) {
				break;
			}
		}
		System.out.println("server closed!");

		
	}

}
