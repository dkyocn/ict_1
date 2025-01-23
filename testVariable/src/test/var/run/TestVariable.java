package test.var.run;

import test.var.sample.VariableSample;

// 변수 테스트
public class TestVariable {

	public static void main(String[] args) {
		
		// 클래스가 가진 메서드 실행을 하려면
		// 클래스명 레퍼런스 변수 = new 생성자();
		VariableSample samp = new VariableSample();
		
		// 레퍼런스변수.메서드명();
		System.out.println("1. 변수 숫자 계산");
		samp.useVariable();
		System.out.println("\n2. 변수 초기화");
		samp.initVariable();
		System.out.println("\n3. 각 자료형 Wrapper class 크기");
		samp.testWrapper(); 
	}

}
