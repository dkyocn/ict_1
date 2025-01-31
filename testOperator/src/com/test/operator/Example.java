package com.test.operator;

import java.util.Scanner;

public class Example {

	Scanner scan = new Scanner(System.in);
	
	/**
	 * 문제 1
	 * 국, 영, 수 세 과목의 각 점수가 40이상이면서 평균 60점 이상인 경우 합격
	 */
	public void sample1() {
		
		int korean = 0;
		int english = 0;
		int math = 0;
		double avg = 0.0;
		String result = "불합격";
		
		// 각 점수 입력
		System.out.printf("국어 점수: ");
		korean = scan.nextInt();
		System.out.printf("영어 점수: ");
		english = scan.nextInt();
		System.out.printf("수학 점수: ");
		math = scan.nextInt();
		
		// 평균
		avg = (korean + english + math)/3.0;
		
		result = (korean >= 40 && english >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격"; 
		
		System.out.println("결과: " + result);
	}
	
	/**
	 * 문제 2
	 * 변수 선언 후 각 값을 변수 저장 및 출력
	 */
	public void sample2() {
		
		String name = "";
		int grade = 0;
		int group = 0;
		int num = 0;
		char gender = 'M';
		float score = 0;
		
		System.out.printf("학생 이름: ");
		name = scan.next();
		System.out.printf("학년: ");
		grade = scan.nextInt();
		System.out.printf("반: ");
		group = scan.nextInt();
		System.out.printf("번호: ");
		num = scan.nextInt();
		System.out.printf("성별(M/F): ");
		gender = scan.next().charAt(0);
		System.out.printf("성적(소수 둘째 자리까지 입력): ");
		score = scan.nextFloat();
		
		// 성별 입력 받은 값의 따라 남/여학생으로 출력
		System.out.printf("%d학년 %d반 %d번 %s학생 %s은(는) 성적이 %.2f이다.",grade, group, num, gender=='M'?"남":"여", name, score);
	}
	
	/**
	 * 문제 3
	 * 정수 입력 받은 후 양수 판별
	 */
	public void sample3() {
		
		int num = 0;
		
		System.out.printf("정수 입력: ");
		num = scan.nextInt();
		
		System.out.println(num <= 0 ? "양수가 아니다." : "양수다.");
	}
	
	/**
	 * 문제 4
	 * 입력받은 정수 짝수, 홀수 판별
	 */
	
	public void sample4() {
		
		int num = 0;
		String even = "";
		
		System.out.printf("정수 입력: ");
		num = scan.nextInt();
		
		even = num % 2 == 0 ? "짝수다" : "홀수다";
		
		System.out.println(even);
	}
}
