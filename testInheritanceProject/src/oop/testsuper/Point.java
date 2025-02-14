package oop.testsuper;

public class Point {

	// field : 캡슐화
	private double x;
	private double y;

	//	protected double x; // # (protected) : 상속받은 후손 클래스 안에서만 접근 가능
	//	protected double y; // # (protected) : 상속이 아니면 package private (default) 와 같음 ( 같은 패키지 안에서만 접근 가능)

	// Constructor : 상속에서 제외됨
	// 상속에서 부모 클래스로 사용될 클래스 안에는 반드시 기본 생성자가 작성되어야 함
	public Point() {
		super(); // 모든 생성자 안 첫줄에 존재함, 표기 생략할 수 있음(숨겨져 있음)
		System.out.println("Point() 생성자 작동됨");
	}

	public Point(double x, double y) {
		super(); // 부모 클래스의 기본 생성자를 실행하는 구문임
		// java.lang.Object 클래스의 기본 생성자를 호출한 것임 : public Object() 찾아서 실행한 것임
		// 즉, 부모의 기본생성자가 없으면 후손클래스는 에러 발생함(클래스 만들기 못 함)

		System.out.println("Point() 생성자 작동됨");
		this.x = x; // 부모가 제공하는 필드는 상속이 됨 => 캡술화된 private 이면 접근은 못함
		this.y = y; // protected 로 변경하면, 후손 클래스안에서만 접근 가능 해짐 => 캡슐화에 위배됨
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
