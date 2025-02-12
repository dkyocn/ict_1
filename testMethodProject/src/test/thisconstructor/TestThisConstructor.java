package test.thisconstructor;

public class TestThisConstructor {

	public static void main(String[] args) {

		// this() 생성자 테스트
		Customer customer = new Customer("홍길동", 3457, "010-1234-5678");
		System.out.println("customer : " + customer); // toStirng override 했을 경우 print 시 toString 생략
		System.out.println("customer에 저장된 인스턴스의 위치정보: " + customer.hashCode());

		Customer customer2 = new Customer(customer); // custormer에 저장된 주소를 전달함
		System.out.println("customer2에 저장된 인스턴스의 위치정보: " + customer2.hashCode());
		System.out.println("customer2 : " + customer2);
	}

}

/**
 * this() 생성자 샘플 클래스
 * 자기 클래스 안의 다른 생성자를 실행시킬 때 사용
 * 즉, 생성자 안에서 다른 생성자를 실행할 때 사용
 * 생성자 코드 중복을 줄이기 위해 사용할 수 있음
 */
class Customer {

	private String name;
	private int point;
	private String phone;

	public Customer() {
		super(); // 상속받은 부모의 기본생성자 실행구문임, 반드시 블럭 안 첫줄에만 기입해야 함
	}

	public Customer(String name, int point) {
		super(); // 모든 생성자 첫 줄에 숨겨져 있음, 직접 표기시에는 첫 줄에만 기입해야 함
		this.name = name;
		this.point = point;
	}

	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Customer(String name, int point, String phone) {
		this.name = name;
		this.point = point;
		this.phone = phone;
	}

	// 복사 생성자 : 기존에 할당된 인스턴스가 가진 필드값들을, 새로 만드는 객체에 복사하는 생성자
	public Customer(Customer other) {
		this(other.name, other.point, other.phone); // this() 생성자라고 함
		/*
		 *  바로 위에서 제공되는 모든 필드값 받아서 초기화하는 생성자를 실행한 것
		 *  반드시 생성자 {} 블럭 안에 첫줄에 작성해야 함 => 첫 줄에 작성하지 않으면 에러
		 */

		//		System.out.println("매개변수 other 가 받은 주소 확인: " + other.hashCode());

		//		this.name = other.name;
		//		this.point = other.point;
		//		this.phone = other.phone;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.point + ", " + this.phone;
	}
}
