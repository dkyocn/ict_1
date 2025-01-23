package day2.test;

import java.util.*;

public class TestExample1 {

	public static void main(String[] args) {
		TestExample1 testEx = new TestExample1();
		// 클래스가 가진 메소드 실행 : 클래스명 레퍼런스변수 = new 생성자();
		// 레퍼런스변수.메서드();
		testEx.example();
		
		System.out.println("==============="); // 빈줄 추가
		
		testEx.exampleVariable();
		
	}
	
	public void example() {
		System.out.println("이름: 정동주");
		System.out.println("나이: 27세");
		System.out.println("키: 170.1cm");
		System.out.println("몸무게: 65.1kg");
		System.out.println("성별: M");
		System.out.println("전화번호: 010-4915-2698");
		System.out.println("이메일: gioconda77@daum.net");
		
	}

	public void exampleVariable() {
		String name = "정동주";
		int age = 27;
		double height = 170.1;
		float weight = 65.1F;
		String gender = "M";
		String phone = "010-4915-2698";
		String email = "gioconda77@daum.net";
		
		System.out.println("현재 입력 된 정보");
		System.out.println("이름: "+ name + "\n나이: "+ age + "세 \n키: "+ height + "cm\n몸무게: "+ weight + "kg\n성별: "+ gender + "\n전화번호: "+ phone + "\n이메일: "+ email);
		
		
		// 전부 수정 가정
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 정보를 입력해주세요");
		name = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		weight = sc.nextFloat();
		gender = sc.next();
		phone = sc.next();
		email = sc.next();
		
		System.out.println("수정된 정보");
		System.out.println("이름: "+ name + "\n나이: "+ age + "세 \n키: "+ height + "cm\n몸무게: "+ weight + "kg\n성별: "+ gender + "\n전화번호: "+ phone + "\n이메일: "+ email);
	}
}
