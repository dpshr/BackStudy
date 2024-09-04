package model;

public class MemberDTO {
//	클래스: 설계도 (필드, 메소드)
//	필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
//	생성자메소드 : 객체가 생성될 때 자동으로 호출되는 메소드(초기화용)
//	특징1. 이름이 class와 같음
//	특징2. return 타입이 없음. void 도쓰지않음
//	특징3. 오버로딩(중복정의)
	public MemberDTO(String id, String pw ,String name, int age) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.age=age;
	}
	public MemberDTO(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
//		Getter
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	
}
