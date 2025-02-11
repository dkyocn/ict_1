package oop.array.model.vo;

/*
 * vo 작성 규칙
 * 1. 모든 필드는 반드시 private 이어야 함 -> 캡슐화할 것
 * 2. 기본 생성자와 메개변수 있는 생성자
 * 3. 모든 필드에 대한 getter & setter가 있어야 함
 * 4. java.lang.Object 클래스가 제공하는 메서드 중 toString(), equals(), hashCode(), clone() 메서드 오버라이딩함 (선택)
 * 
 * 오버라이딩(Overriding) : 상속 관계에 있는 부모 클래스가 제공하는 메서드를 후손 클래스가 재작성하는 것
 */

/**
 * 개인 신상정보 저장용 클래스
 * 
 * @author J.D.J
 * @since 2024-02-11
 * @version 1.0
 */
public class Person {

	private String personId; // 주민등록번혹
	private String name; // 이름
	private int age; // 나이
	private String phone; // 전화번호
	private String email; // 이메일
	private String address; // 주소
	private double height; // 키
	private double weight; // 몸무게

	public Person() {};

	public Person(String personId, String name) {
		this.personId = personId;
		this.name = name;
	}

	public Person(String personId, String name, String phone) {
		this.personId = personId;
		this.name = name;
		this.phone = phone;
	}

	public Person(String personId, String name, String phone, String address) {
		this.personId = personId;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Person(String personId, String name, double hight, double weight) {
		this.personId = personId;
		this.name = name;
		this.height = hight;
		this.weight = weight;
	}

	public Person(String personId, String name, int age, String phone, String email, String address, double height,
		double weight) {
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}

	// getter
	public String getPersonId() {
		return this.personId;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getEmail() {
		return this.email;
	}

	public String getAddress() {
		return this.address;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	// setter
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void SetWeight(double weight) {
		this.weight = weight;
	}

	// java.lang.Object 클래스가 제공하는 toString() 메서드 오버라이딩
	@Override // annotation 컴파잉러 주석문
	public String toString() {
		// 후손 클래스가 가진 필드값들을 하나의 문자열로 만들어서 리턴 처리하는 것으로 수정함
		return this.personId + ", " + this.name + ", " + this.age + ", " + this.phone + ", " + this.email + ", "
			+ this.address + ", " + this.height + ", " + this.weight;
	}
}
