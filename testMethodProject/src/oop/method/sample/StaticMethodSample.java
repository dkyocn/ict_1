package oop.method.sample;

/**
 * 메서드 선언부(시그니처, Signature) 에 반환자료형 앞에 static이 표기된 메서드 샘플 클래스
 * 메서드 실행(call, 호출)시에 사용법은 클래스명.메서드명() 형식으로 사용
 * static(정적) 메모리 (Method Area)에 기록되는 메서드를 의미함
 * static 메서드 안에는 this 레퍼런스가 없음(인스턴스의 주소를 받을 필요가 없음)
 * 
 * 메서드 선언부에서 해당 메서드의 사용법을 정하는 것 (시그니처)
 */
public class StaticMethodSample {
	// 접근제한자 static 반환자료형 메서드명([자료형 변수, 자료형 변수, ....]) { this 레퍼런스 없다. 클래스명.정적필드명 }

	// 형식 1: 반환값 없고 매개변수 없는 메서드
	// 실행 : 클래스명.메서드명();
	public static void printRandom() {
		System.out.println(Math.random());
	}

	// 형식 2: 반환값 없고 매개변수 있는 메서드
	// 실행 : 클래스명.메서드명(전달값);
	public static void printRandom(int bound) {
		// 1 ~ bound 사이의 정수 랜덤하게 발생해서 출력
		System.out.println((int)(Math.random() * bound) + 1);
	}

	// 형식 3: 반환값 있고 매개변수 없는 메서드
	// 실행 : 자료형 반환값저장할변수 =  클래스명.메서드명();
	// 다른 실행 구문 안에서 사요 가능 : 실행 구문(클래스명.메서드())
	public static int randomValue() {
		return (int)(Math.random() * 10) + 1;
	}

	// 형식 4: 반환값 있고 매개변수 있는 메서드
	// 실행 : 자료형 반환값저장할변수 =  클래스명.메서드명(전달값, 전달값,...);
	// 다른 구문 안에서 메서드 실행 가능 : 실행 구문(클래스명.메서드(전달값,...))
	public static int randomValue(int begin, int end) {
		return (int)(Math.random() * (end - begin - 1) + begin);
	}
}
