package poly.model.dto;

/**
 * dto(data trensfer object) == vo(value object) == do(domain object) == entity  == bean
 * 값 저장을 위한 클래스
 * 
 * 작성 규칙
 * 1. 반드시 캡슐화할 것 : 모든 필드가 private일 것
 * 2. 기본 생성자와 매개변수 있는  생성자(모든 필드 초기기화)가 반드시 제공되어야 함
 * 3. 모든 필드에 대한 getters and setter  제공되어야 함
 * 4. toString()(필수 사할ㅇ_), equals(), clone() 등에 대한 오버라이딩해야 함(선택 사항)
 * 5. 반드시 직렬화 할것 : java.io.Seriallizable 인터페이스를 상속받으면 됨
 */
public class Person implements java.io.Serializable {

	// field
	private String name;
	private int age;
	private char gender;
	private String email;
	private String phone;

	/*
	 * 상속 시 초기화 블럭과 생성자느 후손에게 상속되지 않는ㄴ다.
	 * 초기ㅣ화 블럭 : 필드 = 초기값; 처리하는 블럭을 말함
	 * 기본값 >> 명시된 초기값 >> 초기화 블럭 >> 생성자
	 */
	{
		name = "이름 미정";
		email = "nomail";
		phone = "010-0000-0000";
	}

	static {
		// static 필드의 초기화 처리를 작성하는 초기화 블럭
	}

	// constructor
	public Person() {
		super(); // 부모의 기본생성자 실행 구문임 => 부모 클래스가 기본생성자를 가지고 있지 않으면 에러 발생함
	}

	public Person(String name, int age, char gender, String email, String phone) {
		super(); // 반드시 생성자 첫 줄에만 표기할 수 있음 (생략해도 됨)
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	// 복사 생성자 : 다른 Person 객체의 필드값들을 복사하는 생성자
	public Person(Person other) {
		// super(); 대신에 this() 생성자 실행 구문을 작성할 수 있음 -> this() 생성자 실행 구문도 첫 줄에만 표기할 수 있음
		this(other.name, other.age, other.gender, other.email, other.phone);
	}

	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gende) {
		this.gender = gende;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Pearson [name=" + name + ", age=" + age + ", gende=" + gender + ", email=" + email + ", phone=" + phone
			+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 *  매개변수 object obj <= 다형성(다양한 클래스 타입 == 다형 -> 한가지 타입으로 처리) 적용됨
		 *  단, 상속 관계에 있는 클래스끼리만 이용할 수 있는 기술임
		 *  Object 는 모든 클래스의 부모클래스임 : 부모클래스 타입의 레처런스가 후손들의 주소를 받을 수 있음 
		 *  실행하는 쪽에서 Person 객체 주소를 전달하면 => Object obj 가 받는다는 의미임 => 클래스 형변환 됨
		 */

		// Object 클래스의 equals 메서드의 원래 기능은 return this == obj; (주소가 같으먄 true 다르면 false 리턴)
		// 오버라이딩 목적 : this가 참조하는 객체 안의 필드 값들과 obj가 참조하는 필드 값들이 일치하는지로 내용 번경함
		if (this == obj) // 두 레퍼런스에 저장된 주소가 같으냐?
			return true;
		if (obj == null) // obj 레퍼런스 안에 주소가 없느냐? (레퍼런스가 비어있다면)
			return false;
		if (this.getClass() != obj.getClass()) // 두 레퍼런스가 참조하는 객체들의 클래스 타입이 같으냐? 
			return false;

		// upcasting 된 obj는 타입이 Object 이므로, Person 객체 안의 Object 것만 다를 수 있음
		// Object 상태에서는 Person 의 맴버를 사용할 수 없음 => 다시 Person 타입으로 형변환해야 함

		Person other = (Person)obj; // 후손 타입으로 클래스 형변환함

		// 각 필드의 값들이 모두 같으면 true,  하나라도 다르면 false
		//		return age == other.age && Objects.equals(email, other.email) && gender == other.gender
		//			&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);

		// String 클래스의 equals 사용으로 바꾼다면 : 문자열 변수. equals(비교할문자열)
		return this.age == other.age && this.email.equals(other.email) && this.gender == other.gender &&
			this.name.equals(other.name) && this.phone.equals(other.phone);
	}

	/**
	 * 오버라이딩 재작성 규칙 : 
	 * 1. 부모 메서드의 시그니처 그대로 복사해서 사용할 것 ( 메서드명, 매개변수, 매개변수 자료형, 반환자료형 변경 못함)
	 * 2. 부모 매서드의 접근제한자는 더 넓은 범위의 제한자로 변경할 수 있음
	 * 3. 부모가 가진 예외는 개수를 줄일 수 있음 (0개까지 가능함)
	 * 
	 * 부모 메서드가 final이 표시되어 있으면, 오버라이딩 불가
	 */
	@Override
	public Object clone() {

		// this 위치의 객체 필드값들을 그대로 복사한 새 객체를 만들어서 리턴함
		return new Person(this); // Person 객체의 주소가 리턴되면서 Object 타입의 주소로 자동 형변환되는 구조임 (다형성 사용됨)

	}

}
