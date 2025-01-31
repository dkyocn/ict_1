package test.operator.run;

import test.operator.sample.AssignmentOperator;
import test.operator.sample.OperatorSample;
import test.operator.sample.TernaryOperator;

public class TestOperator {

	public static void main(String[] args) {
		// 연산자 실행 테스트용
		OperatorSample samp = new OperatorSample();
		
		//클래스가 가진 기능을 작동 시키는 문장
		//래퍼런스 변수, 메서드명, 또는 자료형 변수 = 레퍼런스변수.메서드명;
//		System.out.println("samp가 가진 주소: "+ samp.hashCode());
//		System.out.println(samp.toString());
		
		TernaryOperator tenaryOperator = new TernaryOperator();
		AssignmentOperator assignmentOperator = new AssignmentOperator();
		
		// 절대 값 출력
//		tenaryOperator.testAbs();
		
		// 대문자, 소문자, 숫자 구별
//		tenaryOperator.testAlphabettic();
		
		// 양수 0 음수 구별
//		tenaryOperator.testInteger();
		
		// 국어, 영어, 수학 점수로 평균 및 등급 출력
//		tenaryOperator.testExample();
		
		// 수험생 점수에 따른 합불
//		tenaryOperator.testPractice1();
		
		// if문
//		tenaryOperator.testQuestion();
//		System.out.println("main() 종료");
		
		// 대입연산자
//		assignmentOperator.testAssignment();
		
		// 산술연산자
		assignmentOperator.testArithmeticAssign();
	}

}
