package shop.dto;

public class 회원bag {
	//public String id; //모든 패키지에서 접근 가능.
	// private String id: // 해당 클래스 안에서만 접근 가능하다 
	private String id; //default접근 제어자, 같은 패키지내에서만 접근 가능하다.
	private String title;
	private String content;
	private String writer; // String tel = null;
	//맴버 변수..클래스 바로 아래 선언됨.!
	//선언의 위치는 생존 범위를 결정한다. => 클래스 전역에서 사용할 수 있다 .
	// 전역변수 (global, 글로벌 변수), 자동 초기화 된다.
	// 지역변수는 쓰레기값이 들어가있다 초기화가 되지 않는다.
	//참조형인 경우, null로 초기화된다.
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "회원bag [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	//값을 넣을때는 set변수명(), setID()   변수명은 대문자..낙타표기법
	//값을 꺼낼때는 get변수명()	getID()
	//getters / setters 라고 부른다. 
	//source 에서 자동완성하자 
	
	
	
	
	
}
