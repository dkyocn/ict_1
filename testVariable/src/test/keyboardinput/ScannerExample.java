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
	
	// Scanner가 제공하는 메서드에는 문자 한 개(char)를 입려받는 기능이 없음
	// String 으로 입력받아서 문자 한 개를 추출하는 방식으로 해결
	// String 클래스와 charAt(순번) 이용(subString(시작,끝)이용 가능 두개의 차이 리턴 값 charAt(char), subString(String)
	
	public void testInputChar() {
		
		System.out.printf("\n문자 하나 입력: ");
		
//		String str = sc.next();
//		char ch = str.charAt(0);
		
		char ch = sc.next().charAt(0);
		
		System.out.println("입력 문자 확인: "+ch);
	}
	
	// java.util.Scanner의 next() 메서드 사용 테스트
	public void testNext() {
		
		System.out.printf("문자열 입력: ");
		String str = sc.next();
		// 입력되는 문자열 값 사이에 공백 사용 못함
		// 공백문자 앞 글자들만 읽어들임
		
		System.out.println("str: "+str);
	}
	
	// java.util.Scanner 의 nextLine() 메서드 사용 테스트
	public void testNextLine() {
		
		System.out.printf("문자열 입력: ");
		sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println("str: "+str2);
	}
	
	// nextLine() 사용 시 주의사항
	public void testNextLine2() {
		
		// 연속으로 여러 종류의 값들을 입력 받을 때 주의해야 함
		System.out.printf("글제목 입력: ");
		String title = sc.nextLine();
		
		System.out.printf("작성자 이름 입력(공백없이 입력): ");
		String writer = sc.next();
		
		System.out.printf("작성할 내용을 입력하세요: ");
		sc.nextLine(); // 입력 버퍼에서 남겨진 엔터키를 읽어내어 버림
		String content = sc.nextLine();
		// 이전 값 입력 시 남겨진 엔터기를 값으로 읽어들임 => 자동 입력완료가 되어서 사용자 입력을 건너뜀
		// 해결 : 입력 버퍼에 남겨진 엔터키를 제거해야 됨 => 버퍼에서 빼냄
		
		// 확인 출력
		System.out.println("title : "+title);
		System.out.println("writer : "+writer);
		System.out.println("content : "+content);
		
	}
	
	// 연습 : 고객이름, 나이, 성별(남/여), 전화번호, 누적포인트점수, 주소를 입력받아 출력
	public void inputPractice() {
		
		System.out.printf("이름: ");
		String name = sc.next();
		
		System.out.printf("나이: ");
		int age = sc.nextInt();
		
		System.out.printf("성별(남/여): ");
		char gender = sc.next().charAt(0);
		
		System.out.printf("전화번호(-포함하여 입력): ");
		String phone = sc.next();
		
		System.out.printf("누적포인트점수: ");
		double score = sc.nextDouble();
		
		System.out.printf("주소: ");
		sc.nextLine(); // 버퍼 clear
		String adress = sc.nextLine();
		
		System.out.println("\n고객 이름: "+name+"\n고객 나이: "+age+"\n고객 성별: "+gender+"\n고객 전화번호: "+phone+"\n고객 누적포인트점수: "+score+
				"\n고객 주소: "+adress);
	}
 }
