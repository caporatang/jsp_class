package shop.dto;

public class DTOtest {

	public static void main(String[] args) {
		회원bag2 bag = new 회원bag2();
		//bag.id = "apple";
		//bag.pw = "apple";
		//bag.name = "apple";
		//bag.tel = "apple";
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		System.out.println(bag);
		
		
		회원bag2 bag2 = new 회원bag2();
		bag2.setId("melon");
		bag2.setPw("melon");
		bag2.setName("melon");
		bag2.setTel("melon");

		System.out.println(bag2);
	}

}
