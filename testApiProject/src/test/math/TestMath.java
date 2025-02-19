package test.math;

public class TestMath {

	public static void main(String[] args) {
		// java.lang.Math 클래스 상수필드, 정적메서드 사용 테스트

		/*
		 *  클래스가 가진 모든 맴버가 static 이면, 싱글톤 디자인 패턴 적용한 것임
		 *  프로그램 구동내내 메모리에 딱 한번 할당되고, 딱 한개 만들어서 공유하게 하는 것
		 *  RAM에 정적 메모리인 static 메모리 영역이 딱 한번 딱 한개만 만드는 메모리임
		 *  객체 생성(동적 메모리 할당)이 필요없음 => 생성자 없는 클래스임
		 *  사용 시 : 클래스명.필드명, 클래스명.메서드명(...)
		 */

		// 상수필드 : public static final double 대문자 이름 = 초기값;
		System.out.println(Math.E);
		System.out.println(Math.PI);

		// import static 선언으로 불러들인 정적메서드는 사용 시 클래스명. 을 표기하지 않음
		System.out.println("-12.3의 절대값 : " + Math.abs(-12.3));

	}

}
