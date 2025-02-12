package oop.method.sample;

public class TestStaticMethodSample {

	public static void main(String[] a) {
		// StaticMethodSample 클래스의 static 메서드 사용 테스트

		// 형식 1: 반환값 없고 매개변수 없는 static 메서드
		StaticMethodSample.printRandom();

		// 형식 2: 반환값 없고 매개변수 있는 메서드
		StaticMethodSample.printRandom(50);

		// 형식 3: 반환값 있고 매개변수 없는 메서드
		int result = StaticMethodSample.randomValue();
		System.out.println("result : " + result);
		System.out.println(StaticMethodSample.randomValue());

		// 형식 4: 반환값 있고 매개변수 있는 메서드
		int random = StaticMethodSample.randomValue(4, 15);
		System.out.println("random : " + random);
		System.out.println(StaticMethodSample.randomValue(4, 15));

		// public static double abs(double a)
		double result3 = Math.abs(-3.5);
		System.out.println("-3.5의 절대 값: " + result3);
	}

}
