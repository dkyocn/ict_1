package oop.encapsulation;

/**
 * 자바 언어로 작성할 클래스는
 * 첫번째, 실행용 클래스 : 어플리케이션(프로젝트)을 실행시키기 위한 클래스,
 * 				main() 메서드를 가지고 있는 클래스
 * 				main() 메서드를 start 스위치의 역할을 하는 특수 메서드
 * 두번째, 기능 제공용 클래스 : 자바가 제공하는 대부분의 클래스들
 * 				외부 라이브러리(*.jar : 자바 전용 압출 파일)
 * 				메서드 위주로 제공되는 클래스
 * 세번째, 값(data) 저장용 클래스 : 데이터 저장을 목적으로 하는 클래스
 * 				vo, dto, bean, entity, do
 * 				객체지향 프로그래밍(Object Oriented Programming : OOP)에서 
 * 				캡슐화 적용 대상이 되는 클래스
 */
// 상품 정보 저장용 클래스
public class Product {

	/*
	 *  Field : 캡슐화 적용 대상
	 *  클래스 밖에서는 접근 못하게 하는 것이 캡슐화
	 *  private [비공개 - 로 표시] : 클래스 안에서만 접근 가능, 클래스 밖에서는 접근 불가능
	 *  private [예약어] 자료형 변수명[= 초기값];
	 */

	private String productID; // 상품 id
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price; // 가겨
	private double tex; // 부가세비율

	/*
	 *  Constructor (생성자 함수)
	 *  힙(heap, 자유메모리 영역)에 객체공간(instance, 인스턴스) 만들 때 필드 초기화가 목적인 함수
	 *  new 할 떄만 사용하는 함수
	 *  접근제한자 클래스명(){} 기본 생성자라고 함(매개변수 없는 생성자)
	 *  클래스 안에 생성자가 하나도 없으면 , jvm에 의해 컴파일시에 class에 자동 추가됨
	 *  접근제한자 클래스명 (자료형 변수명, 자료형 변수명, ....){필드 = 매개변수;} 매개변수 있는 생성자(직접작성)
	 *  오버로딩(OverLoading, 중복 작성, 중복 정의) : 한 클래스 안에 이름이 같은 함수 여러 개 만드는 것
	 *     단, 매개변수가 반드시 다르게 구성되어야 함 (접근제한자, 반환 자료형은 오버로딩 판단 기준이 아님)
	 */

	public Product() {

		// 모든 생성자와 일반 메서드 안에는 this 라는 레퍼런스 변수(주소 저장)가 존재하고 있음
		// 생성자 안에 있는 this 레퍼런스는 객체 공간이 힙 영역에 new에 의해 할당되고 나서 발생한 주소를 자동으로 전달받음
		System.out.println("Product() 안에 this 레퍼런스 받은 주소: " + this.hashCode());
	}

	public Product(String productID, String productName, String productArea) {

		System.out.println("Product(String, String, String) 안에 this 레퍼런스 받은 주소: " + this.hashCode());
		this.productID = productID;
		this.productName = productName;
		this.productArea = productArea;
		// 나머지 필드(객체 인스턴스 안에 할당되는 변수 : 인스턴스 변수)들은 jvm이 준비한 기본값으로 초기화 됨
	}

	public Product(String productID, String productName, String productArea, int price, double tex) {
		//		System.out.println("Product(String, String, String, int, double) 안에 this 레퍼런스 받은 주소: " + this.hashCode());
		this.productID = productID;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tex = tex;
	}

	/*
	 * Method (맴버함수) : 캡슐화된 필드에 대한 데이터 처리가 목적
	 * 접근제한자 [예약어] 반환 자료형 메서드명([자료형 매개변수명, ......]){}
	 * 
	 * 참조하는 대상 객체(인스턴스) 안에 있는 필드가 가진 값들 출력 확인하는 메서드
	 */
	public void printlnformation() {
		//		System.out.println("printlnformation() 안에 this 레퍼런스 받은 주소: " + this.hashCode());
		System.out.println(
			this.productID + ", " + this.productName + ", " + this.productArea + ", " + this.price + ", " + this.tex);
	}

	public void setProductId(String productId) {
		this.productID = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTex(double tex) {
		this.tex = tex;
	}

	/*
	 * Getter ------------------------------------
	 * 캡슐화된 필드에 값을 조회해서 필요한 위치로 넘기는 메서드
	 * public 필드자료형 get필드명(){ return this.필드; }
	 */

	public String getProductId() {
		return this.productID;
	}

	public String getProductName() {
		return this.productName;
	}

	public String getProductArea() {
		return this.productArea;
	}

	public int getPrice() {
		return this.price;
	}

	public double getTex() {
		return this.tex;
	}
}
