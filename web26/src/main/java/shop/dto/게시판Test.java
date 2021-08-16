package shop.dto;

public class 게시판Test {

	public static void main(String[] args) {
		DTOTest2 test2 = new DTOTest2();
		
		test2.setId("test1");
		test2.setContent("test2");
		test2.setWriter("test3");
		test2.setNum("1234");
		
		System.out.println(test2);
		
		
		DTOTest2 test3 = new DTOTest2();
		
		test3.setId("abc");
		test3.setContent("abc");
		test3.setWriter("abc");
		test3.setNum("abc");
		
		System.out.println(test3);
		
		
		

	}

}
