package oop.testsuper;

public class TestSuper {

	public static void main(String[] a) {
		// super() 생성자 자동 실행 확인 테스트용

		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(100.0, 50.0);

		System.out.println("rectangle : " + rectangle);
		System.out.println("rectangle2 : " + rectangle2);

		// 부모인 Point가 가진 메서드를 후손인 Rectangle 이 자신의 것처럼 사용할 수 있게 됨
		System.out.println("X : " + rectangle.getX());
		System.out.println("Y : " + rectangle.getY());

		Rectangle rectangle3 = new Rectangle(10, 10, 100, 100);
		System.out.println("rectangle : " + rectangle3);
	}

}
