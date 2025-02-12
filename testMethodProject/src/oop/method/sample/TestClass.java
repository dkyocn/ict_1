package oop.method.sample;

/**
 * 하나의 java 파일 안에서 클래스 여러개 작성할 수도 있음
 * 단, 파일명으로 사용한 클래스에만 public을 사용할 수 있음
 */
public class TestClass {

	int Abc;
	int 자바;
	int $variable;
	int variable_;
	int False;

	public static void main(String[] args) {
		// 같은 패키지 안에 있는 클래스끼리는 import 선언하지 않고 바로 사용할 수 있음
		// static 맴버들은 프로그램이 메모리에 로딩될떄 정적 메모리에 자동 기록됨

		System.out.println("Fruit.totalCount: " + Fruit.getTotalCount()); // 프로그램 실행하자마자 바로 조회 가능
		System.out.println("Fruit.totalPrice: " + Fruit.getTotalPrice());

		Fruit ref = new Fruit();
		System.out.println("할당된 Fruit 객체의 위치: " + ref.hashCode());

		// new 에 의해 힙 메모리에 Fruit 클래스에 대한 객체 인스턴스 공간이 할당되고, 그 안에 인스턴스변수들이 선언 순서대로 나열 할당됨
		System.out.println(ref.toString()); // 레퍼런스변수는 객체의 주소를 가지고 있음
		// 레퍼런스.메서드() 실행하면 레퍼런스가 가진 주소를 메서드 안의  this 에게 자동 전달됨
	}

}

/**
 * 하나의 java 파일 안에서 여러 개의 클래스 작성 시에 파일명으로 사용된 클래스가 아닌 클래스는 public 사용 못함
 * default(package private) 클래스로만 작성할 수 있음
 */
class Fruit {

	// Field
	// instance : heap 메모리에 만들어지는 객체

	private String name = "미정"; // new 에 의해 heap 메모리에 인스턴스가 생성될 때 jvm이 준비한 기본값으로 초기화 될 것임
	private int account = 1;
	private int price = 300;

	// 클래스 변수 : static 메모리에 프로그램이 로딩될 때 따로 만들어지는 필드
	private static int totalCount = 1; // jvm에 의해 준비된 기본값(int = 0)으로 초기화 될 것임
	private static int totalPrice = 1000; // jvm에 의해 준비된 기본값(int = 0)으로 초기화 될 것임

	// 클래스 변수 초기화 블럭
	static {
		totalCount = 10;
		totalPrice = 2000;
	}

	// 인스턴스 변수 초기화 블럭: { 필드 초기값 처리 }
	{
		// 제어문(if,switch, for, while, do~while, break, continue) 사용 가능
		name = "사과";
		account = 5;
		price = 2500;
	}

	// Constructor
	public Fruit() {
		name = "바나나";
		account = 3;
		price = 1350;
	}

	// 캡슐화된 필드에 기록괸 값 조회용 : getter 메서드 사용
	// public 필드자료형 get필드명() { return 필드명; }

	public String getName() {
		// this 레퍼런스가 자동으로 주소를 전달받아서, this가 참조하는 위치의 인스턴스 안의 필드 값 읽어서 리턴 처리
		return this.name;
	}

	public int getAccount() {
		return this.account;
	}

	public int getPrice() {
		return this.price;
	}

	// 클래스 변수에 대한 getter and setter도 작성 가능함
	// public static 필드 자료형 get필드명() { return 클래스명.필드명;}

	public static int getTotalCount() {
		return Fruit.totalCount;
	}

	public static int getTotalPrice() {
		return Fruit.totalPrice;
	}

	@Override // annotation : 컴파일러 주석 => 컴파일러에게 알려주는 용도
	public String toString() {
		// 메서드 안의 this 레퍼런스변수가 전달된 주소를 받아서, this 위치의 필드에 접근해서 필드에 기록된 값을 처리
		return this.name + ", " + this.account + ", " + this.price + ", " + Fruit.totalCount + ", " + Fruit.totalPrice;
	}
}

class car {

}