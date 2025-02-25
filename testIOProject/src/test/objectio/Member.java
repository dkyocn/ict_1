package test.objectio;

/**
 * 클래스 직렬화 처리 :
 * java.io.Serializable 인터페이스 상속 받으면 됨
 * 마크업 인터페이스 (Markup Interface) : 이름만 있고, 추상메서드나 필드같은 맴버가 없는 빈 인터페이스
 * 표시용 인터페이스임 : 사용에 의미가 있음
 * 
 * 직렬화 처리된 데이터가 다시 객체 상태로 돌아오는 것 : 역직렬화
 */
public class Member implements java.io.Serializable {

	private static final long SerialVersionUID = 2L;

	private String name;
	private int age;
	private transient char gender; // 직렬화 제외 : transient
	private double weight;
	private double height;

	public Member() {
		super();
	}

	public Member(String name, int age, char gender, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	// Getter & Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + ", height="
			+ height + "]";
	}
}
