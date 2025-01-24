package test.keyboardinput;

import java.util.Scanner;

public class ScannerExample {
	Scanner sc = new Scanner(System.in);
	
	// 맴버 변수(Field)
	// 생성자 함수(Constructor) : 클래스 안에 생성자가 없으면, 자동으로 기본생성자가 컴파일되면서 추가됨
	// 맴버 함수(Method) : 기능 (소스 코드를 작성하는 부분)
	
	public void testScanner() {
		
		
		System.out.printf("\n정수값 하나를 입력하세요: ");
		int num = sc.nextInt();
		
		
		System.out.println("num : "+num);
	}
	
	public void testScanner2() {
		
		System.out.printf("\n이름: ");
		String name = sc.next();
		System.out.printf("나이: ");
		int age = sc.nextInt();
		System.out.printf("키[소수점 아래 첫째자리까지 입력]: ");
		double height = sc.nextDouble();
		
		System.out.println(name+", "+age+"세, "+ height+"cm");
					
	}
}
