package oop.method.sample;

public class TestMethodSample {

	public static void main(String[] args) {
		// MethodSample 클래스가 제공하는 일반메서드 사용 테스트
		MethodSample methodSample = new MethodSample();

		// 1: 반환값 없고 매개변수 없는 메서드 사용
		methodSample.welcome();

		// 2: 반환값 없고 매개변수 있는 메서드 사용
		methodSample.welcome("반갑습니다.");

		// 3: 반환값 있고 매개변수 없는 메서드 사용
		int data = methodSample.randomValue();
		System.out.println("1 ~ 100사이의 임의의 정수: " + data);
		System.out.println("1 ~ 100사이의 임의의 정수: " + methodSample.randomValue());

		// 4: 반환값 있고 매개변수 있는 메서드 사용
		int reasult = methodSample.randomValue(9, 101);
		System.out.println(reasult);
		System.out.println(methodSample.randomValue(9, 101));

		//		public int compaeTo(String anotherString)
		// 자바는 String 클래스만 기본자료형처럼 사용하 수 있도록 제공하고 있음
		//			String str = mew String("java");
		String str = "java";
		int value = str.compareTo("oracle");

		System.out.println(value);
		System.out.println('j' - 'o'); // 음수가 리턴 : 뒤 문자열이 크다
		System.out.println("oracle".compareTo("java")); // 양수 5 리턴

		if ("oracle".compareTo("java") > 0) {
			// 반환 값이 양수임?
			System.out.println("앞 문자열이 크다");
		} else if ("oracle".compareTo("java") == 0) {
			System.out.println("두 문자열이 같다.");

		} else {
			System.out.println("뒤 문자열이 같기");
		}
	}
}
