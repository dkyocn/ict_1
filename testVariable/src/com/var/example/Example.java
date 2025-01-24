package com.var.example;

import java.util.*;

/**
 * 변수 연습문제 메서드
 */
public class Example {
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * 정수 두 개를 입력받아, 두 수의 합,차,곱,나누기한 몫과 나머지 출력
	 */
	public void example1() {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.printf("첫번째 정수: ");
		num1 = scanner.nextInt();
		
		System.out.printf("두번째 정수: ");
		num2 = scanner.nextInt();
		
		System.out.println("더하기 결과: "+(num1 + num2));
		System.out.println("빼기 결과: "+(num1-num2));
		System.out.println("곱하기 결과: "+(num1*num2));
		System.out.println("나누기한 몫: "+(num1/num2));
		System.out.println("나누기한 나머지: "+(num1%num2));
		
	}
	
	/**
	 * 가로, 세로 값을 실수형으로 입력받아 사격형의 면적과 둘레를 계산하여 출력
	 */
	public void example2() {
		
		double width = 0.0;
		double height = 0.0;
		
		System.out.printf("가로: ");
		width = scanner.nextDouble();
		
		System.out.printf("세로: ");
		height = scanner.nextDouble();
		
		System.out.println("면적: "+(width*height));
		System.out.println("둘레: "+2*(width+height));
		
	}
	
	/**
	 * 영어 문자열 값을 키보드로 입력받아 각 자리의 문자를 출력
	 */
	public void example3() {
		
		String english = null;
		
		System.out.printf("문자열을 입력하시오(단,3자 이상): ");
		english = scanner.next();
		
		if(english.length()<3) {
			System.out.println("잘못된 입력입니다.");
		} else {
			System.out.printf("첫번째 문자: "+english.charAt(0)); // english.substring(0,1)
			System.out.printf("두번째 문자: "+english.charAt(1));
			System.out.printf("세번째 문자: "+english.charAt(2));
		}
	}
	
	/**
	 *  학생 이름, 학년, 반, 번호, 성별, 점수를 입력 받아 출력
	 */
	
	public void inputSungjuk() {
		
		String name = null;
		int grade = 0;
		int school = 0;
		int num = 0;
		char gender = '남';
		double score = 0.0;
		
		System.out.printf("이름: ");
		name = scanner.next();
		
		System.out.printf("학년: ");
		grade = scanner.nextInt();
		
		System.out.printf("반: ");
		school = scanner.nextInt();
		
		System.out.printf("번호: ");
		num = scanner.nextInt();
		
		System.out.printf("성별(남/여): ");
		gender = scanner.next().charAt(0);	
		
		System.out.printf("점수(소수점아래 첫째자리까지 입력): ");
		score = scanner.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 점수는 %.1f",grade,school,num,name,gender,score);
	}
}
