package logic.home.model;

import java.util.Scanner;

public class StaticMethodSample {
	
	private Scanner scanner = new Scanner(System.in);

	// Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력
	public void testMathRandom() {
		
		System.out.println("Math 클래스를 이용한 1 ~ 45 임의의 정수: "+((int)(Math.random() * 45) + 1));
		
	}

	// Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기
	public void testMathAbs() {
		
		System.out.printf("원하는 실수를 입력해주세요: ");
		double num = scanner.nextDouble();
		
		System.out.println(num+"의 절대값은 "+Math.abs(num)+"입니다.");
	}

	// Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기
	public void testMathMax() {
		
		int first = 0;
		int second = 0;
		
		System.out.printf("첫 번째 정수 입력: ");
		first = scanner.nextInt();
		System.out.printf("두 번째 정수 입력: ");
		second = scanner.nextInt();
		
		System.out.println(first+"와(과) "+second+" 중 더 큰 수는 "+ Math.max(first, second)+"입니다.");
		
	}

}
