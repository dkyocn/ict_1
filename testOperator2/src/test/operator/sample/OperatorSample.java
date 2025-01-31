package test.operator.sample;

import java.util.Random;
import java.util.Scanner;

public class OperatorSample {
	
	Scanner scan =  new Scanner(System.in);

	/**
	 * 나열 연산자 : 우선 순위 15 순위임, 항목들을 나열할 때 사용
	 */
	public void testComma() {
		
//		int a = 10;
//		int b = 20;
//		int c = 30;
		
		// 같은 자료형 변수가 여러 개 선언이 될 경우, 나열 연산자 사용해서 한번에 선언할 수 있음
//		int a = 10, b= 20, c= 30;
		int a = 10, b, c=30;
		b = 20;
		
		System.out.println(a+", "+b+", "+c);
		
	}
	
	/**
	 * 일반 논리 연산자의 성질
	 * 논리표현식 && 논리표현식 : 앞의 결과가 false 이면 뒤를 실행 안함
	 * 논리표현식 || 논리표현식 : 앞의 결과가 true 이면 뒤를 실행 안함
	 * 
	 * 비트논리연산자로 논리식을 작성해도 됨, 연산처리 속도가 일반논리연산자보다 느림
	 * 논리표현식 & 논리표현식 : 뒤까지 다 실행하고 결과 도출함
	 * 논리표현식 | 논리표현식 : 뒤까지 다 실행하고 결과 도출함
	 */
	public void testLogical() {
		
		System.out.printf("정수 하나 입력: ");
		int num = scan.nextInt();
		
		String result = num >= 1 & num++ <= 100 ? "1 ~ 100 사이의 값이다." : "1 ~ 100 사이의 값이 아니다.";
		
//		System.out.println(num+"은 "+result);
		System.out.println(result);
		System.out.println("num: "+num);
	}
	
	/**
	 * java에서 랜덤 값(임의의 난수)
	 * 방법 1 : java.lang.Math 클래스의 random() 메서드 사용(static)
	 * 방법 2 : java.utill.Random 클래스의 메서드 사용
	 */
	public void testRandom() {
		
		Random random = new Random();
		
		System.out.println("Math random: " + Math.random()); //0.0 <= x <= 1.0
		// Math.random() 으로 1 ~ 100 사이의 정수 발생한다면
		// 원하는 범위의 정수를 만드려면 : (int)(Math.random() * 끝값) + 시작값
		int value = (int)(Math.random() * 100) + 1;
		System.out.println("value: " +value);
		
		// 51 ~ 100 사이의 정수를 랜덤하게 발생시킨다면
		// 원하는 범위의 정수를 만드려면 : (int)(Math.random() * (끝값-시작값 + 1)) + 시작값
		value = (int)(Math.random() * 50) + 51;
		System.out.println("51 ~ 100 value: "+ value);
		
		int num = random.nextInt(100); //  0 ~ 99 사이의 정수 하나 발생, 1 ~ 100 사이의 값으로 변경하려면 +1
		
		// 51 ~ 100 사이의 랜덤 정수 발생
		num = random.nextInt(50) + 51;
		
		System.out.println("utill random:  "+ num);
	}
}
