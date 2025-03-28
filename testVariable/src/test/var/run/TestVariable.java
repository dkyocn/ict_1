package test.var.run;

import test.keyboardinput.ScannerExample;
import test.var.sample.VariableSample;

// 변수 테스트
public class TestVariable {

	public static void main(String[] args) {
		
		// 클래스가 가진 메서드 실행을 하려면
		// 클래스명 레퍼런스 변수 = new 생성자();
		VariableSample samp = new VariableSample();
		
		ScannerExample scanEx = new ScannerExample();
		
//		// 레퍼런스변수.메서드명();
//		System.out.println("1. 변수 숫자 계산");
//		samp.useVariable();
//		System.out.println("\n2. 변수 초기화");
//		samp.initVariable();
//		System.out.println("\n3. 각 자료형 Wrapper class 크기");
//		samp.testWrapper();
		
		// final example
//		samp.testFinal();
		// literal example
		samp.testLiteral();
		
//		// scanner 샘플
//		scanEx.testScanner();
//		// scanner 여러가지 유형
//		scanEx.testScanner2();
//		// 한 문자 뽑기
//		scanEx.testInputChar();
		
//		// java.util.Scanner의 next() 메서드 사용 테스트
//		scanEx.testNext();
//		// java.util.Scanner의 nextLine() 메서드 사용 테스트
//		scanEx.testNextLine();
//		// nextLine() 사용 시 주의사항
//		scanEx.testNextLine2();
		
		// 연습문제
//		scanEx.inputPractice();
	}

}
