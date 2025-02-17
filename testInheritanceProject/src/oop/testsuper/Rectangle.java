package oop.testsuper;

public class Rectangle extends Point {
	// field
	private double width; // 가로 너비
	private double height; // 세로 높이
	// 사각형의 위치 x,y 좌표값은 부모의 x,y 필드 사용할 것임

	public Rectangle() {
		super(); // Point 의 기본 생성자 호출
		System.out.println("Rectangle() 생성자 작동됨");
	}

	public Rectangle(double width, double height) {
		super(); // Point 의 기본생성자 호출

		System.out.println("Rectangle(width, height) 생성자 작동됨");
		this.width = width;
		this.height = height;
	}

	public Rectangle(double x, double y, double width, double height) {
		//		super(); // Point 의 기본생성자 호출
		super(x, y); // Point 의 매개변수 있는 생성자로 호출을 변경해도 됨
		System.out.println("Rectangle(width, height) 생성자 작동됨");

		//		this.x = x; // 부모가 제공하는 필드는 상속이 됨 => 캡술화된 private 이면 접근은 못함
		//		this.y = y; // protected 로 변경하면, 후손 클래스안에서만 접근 가능 해짐 => 캡슐화에 위배됨

		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// 이름이 같은 부모 메서드르 후손 메서드 안에서 실행 시키려면 : super.method()
		return super.toString() + "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
