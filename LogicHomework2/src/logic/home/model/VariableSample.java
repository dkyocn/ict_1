package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 내 신상정보 변수에 담아 출력하기
	public void myProfile() {
		
		String name = "";
		int age = 0;
		String gender = "";
		String personality = "";
		
		// 신상 정보 입력
		System.out.printf("이름: ");
		name = scanner.next();
		System.out.printf("나이: ");
		age = scanner.nextInt();
		System.out.printf("성별(남자/여자): ");
		gender = scanner.next();
		System.out.printf("성격: ");
		personality = scanner.next();
		
		System.out.println("[신상정보]");
		System.out.println("이름: "+name+"\n나이: "+age+"\n성별: "+gender+"\n성격: "+personality);
	}

	// 사원정보를 키보드로 입력받아 출력하기
	public void empInformation() {
		
		
	}

	// 기본 자료형 변수의 초기값 확인하기
	public void defaultValue() {
		
		
	}

}
