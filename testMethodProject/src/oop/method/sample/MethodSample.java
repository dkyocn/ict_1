package oop.method.sample;

/**
 * 매서드 작성 시 선언부에 static 이 표기되지 않는 일반 메서드 샘플 클래스
 * 메서드 선언부에 작성된 내용으로 메서드 사용 방식이 결정됨 (Signature)
 */
public class MethodSample {
	//접근제한자 [예약어] 반환자료형 메서드명([자료형 매개변수, ...]){ 메서드 구현부 }

	// 형식 1: 반환값 없고 매개변수 없는 메서드
	// 메서드 실행 : 레퍼런스.메서드();
	public void welcome() {
		System.out.println("자바 객체지향프로그래밍의 세게에 오신 것을 환영합니다.");
	}

	// 형식 2: 반환값 없고 매개변수 있는 메서드
	// 매서드 실행 : 레퍼런스.메서드(전달값);
	// 전달값(argument)을 받는 메서드 쪽 변수를 매개변수(parameter)라고 함
	// 매개 변수 개수와 자료형을 일치되게 전달밧을 전달해야 함
	// 매개 변수와 전달값의 개수와 자료형이 다르면 에러임 : 메서드 사용쪽에서 에러 발생
	public void welcome(String message) {
		System.out.println(message);
	}

	// 형식 3: 반환값 있고 매개변수 없는 메서드
	// 메서드 사용 : 반환 값의 자료형 반환 값 저장할 변수 = 레퍼런스.메서드명();
	// 반환 값이 있는 메서드는 반환 값 사용하는 구문에 메서드를 바로 사용해도 됨
	// syso(반환값); ==> syso(레퍼런스.메서드명());
	public int randomValue() {
		/*
		 *  return 반환값; => 값(리터럴) | 변수 사용(변수에 기록된 값) | 주소 리턴 가능
		 *  반환값의 자료형을 메서드명 앞에 표기해야함
		 *  반환값과 반환 자료형은 반드시 일치해야 함
		 *  반환 값은 1갬나 반환할 수 있음
		 *  return 문은 메서드 맨 마지막에 딱 한번만 실행되게 작성해야 함
		 */

		return (int)(Math.random() * 100) + 1; // 1 ~ 100사이의 정수 하나 랜덤으로 발생해서 리턴 처리
	}

	// 형식 4: 반환값 있고 매개변수 있는 메서드
	// 메서드 사용 : 자료형 변수 = 레퍼런스.메서드(전달값, 전달값, ....);
	// 반환값 사용하는 구문 안에서 바로 메서드 실행시켜도 됨
	// 실행구문(레퍼런스.메서드(전달값,전달값,...))
	public int randomValue(int begin, int end) {
		System.out.println("begin : " + begin + ", end : " + end);
		return (int)(Math.random() * (end - begin - 1)) + begin;
	}

}
