package oop.encapsulation;

// 데이터 저장용 클래스 : vo, do, entity, dto, bean)
// 웹 사이트에 가입하는 회원 정보 저장용 클래스
public class Member {

	// Field
	private String name; // 이름
	private String id; // 아이디
	private String pwd; // 패스워드
	private String email; // 이메일
	private int age; // 나이
	private char gender; // 성별
	private String phone; // 전화번호

	// 기본생성자
	public Member() {}

	// 이름, 아이디, 패스워드 초기화 생성자
	public Member(String name, String id, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}

	// All 생성자 
	public Member(String name, String id, String pwd, String email, int age, char gender, String phone) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	// 출력 메서드
	public void printMember() {
		System.out.printf("%s, %s, %s, %s, %d, %s, %s\n", this.name, this.id, this.pwd, this.email, this.age,
			this.gender, this.phone);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Getter
	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getPwd() {
		return this.pwd;
	}

	public String getEmail() {
		return this.email;
	}

	public int getAge() {
		return this.age;
	}

	public char getGender() {
		return this.gender;
	}

	public String getPhone() {
		return this.phone;
	}
}
