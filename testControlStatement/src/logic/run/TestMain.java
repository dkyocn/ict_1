package logic.run;

import java.util.Scanner;

import logic.loop.sample.DoubleForSample;
import logic.loop.sample.ForSample;
import logic.loop.sample.WhileSample;
import logic.testIf.sample.IfElseSample;
import logic.testIf.sample.IfSample;
import logic.testIf.sample.MultiIfSample;
import logic.testswitch.sample.SwitchSample;

public class TestMain {

	public static void main(String[] args) {
		// 제어문 실행용

		// 클래스가 가진 메서드를 사용(호출)하려면
		// 클래스명 레퍼런스변수 = new 클래스 생성자();
		IfSample ifSample = new IfSample();
		IfElseSample ifElseSample = new IfElseSample();
		MultiIfSample multiIfSample = new MultiIfSample();
		SwitchSample switchSample = new SwitchSample();
		ForSample forSample = new ForSample();
		DoubleForSample doubleForSample = new DoubleForSample();
		WhileSample whileSample = new WhileSample();

		// 레퍼런스변수.메서드명([매개변수에게 전달할 값, ....]);
		// 단일 if
//		ifSample.testGugudan();
//		ifSample.testUnicode();
//		ifSample.testUnicode2();
//		ifSample.testLogin();

		// if - else
//		ifElseSample.testEven();
//		ifElseSample.testEven2();
//		ifElseSample.testPass();
//		ifElseSample.testPass2();
//		ifElseSample.testCalculator();
//		ifElseSample.checkMaxMin();

		// 다중 if
//		multiIfSample.checkThreeMax();
//		multiIfSample.scoreToGrade();
//		multiIfSample.checkChar();
//		multiIfSample.checkChar2();
//		multiIfSample.isGrateOrEquals();

		// switch
//		switchSample.printMessage();
//		switchSample.simpleCalculator();
//		switchSample.priceCalculator();

		// for
//		forSample.add1To100();
//		forSample.add1To100_2();
//		forSample.add1To100_3(); // 메서드가 실행되는 위치임, 이 메서드는 반환값이 있는 메서드임, 
		// 반환값이 있는 메서드 사용 1 : 자료형 반환 값 받을 변수 = 레퍼런스.메서드();
//		int result = forSample.add1To100_3();
//		System.out.println("result: "+result);
//		forSample.sumOdd(); // 반환값이 없는 (void) 메서드는 메서드 실행만 하면 됨
//		forSample.sumEven();
//		forSample.printGugudan();
//		forSample.sumMinToMax();
//		int minMax = forSample.sumMinToMax2();
//		System.out.println("result: "+minMax);

		/*
		 * 반환값이 있는 메서드 사용 2: 반환값을 변수에 저장하지 않고, 반환값이 사용되는 위치에 바로 메서드 사용할 수 있음
		 */
//		System.out.println("반환 결과: "+ forSample.sumMinToMax2());

		/*
		 * 메서드 실행 위치에서 키보드로 두 개의 정수를 입력받아서, 실행시킬 메서드로 두 수 전달
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.printf("첫번째 정수 입력: ");
//		int max = scan.nextInt();
//		System.out.printf("두번째 정수 입력: ");
//		int min = scan.nextInt();
//		
//		int minMax3 = forSample.sumMinToMax3(max,min); // 메서드 실행, 메서드로 값 전달함, 결과를 리턴함
//		System.out.println("작은 수부터 큰 수 까지의 합계: "+minMax3);

//		forSample.testMathRandom();
//		forSample.sumOneToRandomNumber();

//		int randomNum = (int)(Math.random()*100)+1;
//		int randomSum = forSample.sumOneToRandomNumber2(randomNum);
//		System.out.println("1 ~ "+randomNum+"까지 정수들의 합계: "+ randomSum);

		// 실행 코드를 한 줄로 줄린다면
//		System.out.println("1부터 랜덤값까지 정수들의 합계: "+ forSample.sumOneToRandomNumber2((int)(Math.random()*100)+1));

//		doubleForSample.printNumber();
//		doubleForSample.printGugudan();
//		doubleForSample.printStar();
//		doubleForSample.printStar2();
//		doubleForSample.printStar3();
//		doubleForSample.printStar4();

		// while
//		whileSample.printStringLength();
//		whileSample.printStringLength2();
//		whileSample.printStringLength3();
		whileSample.testContinue();
		whileSample.testContinue2();
		whileSample.testContinue3();
	}
}
