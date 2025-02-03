package logic.run;

import logic.testIf.sample.IfElseSample;
import logic.testIf.sample.IfSample;
import logic.testIf.sample.MultiIfSample;

public class TestMain {

	public static void main(String[] args) {
		// 제어문 실행용
		
		// 클래스가 가진 메서드를 사용(호출)하려면
		// 클래스명 레퍼런스변수 = new 클래스 생성자();
		IfSample ifSample = new IfSample();
		IfElseSample ifElseSample = new IfElseSample();
		MultiIfSample multiIfSample = new MultiIfSample();
		
		// 레퍼런스변수.메서드명([매개변수에게 전달할 값, ....]);
//		ifSample.testGugudan();
//		ifSample.testUnicode();
//		ifSample.testUnicode2();
//		ifSample.testLogin();
		
//		ifElseSample.testEven();
//		ifElseSample.testEven2();
//		ifElseSample.testPass();
//		ifElseSample.testPass2();
//		ifElseSample.testCalculator();
//		ifElseSample.checkMaxMin();
		
//		multiIfSample.checkThreeMax();
//		multiIfSample.scoreToGrade();
//		multiIfSample.checkChar();
		multiIfSample.checkChar2();
	}

}
