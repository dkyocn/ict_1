package logic.testIf.sample;

import java.util.Scanner;

/**
 * 조건문에서 if만 사용하는 경우에 대한 샘플 클래스
 * 제시한 조건을 만족하는 경우(true)에만 실행 내용이 작동되게 하는 구문
 * if(조건표현식) {
 * 	조건의 결과가 true일 때 실행시킬 내용들
 * }
 * 조건표현식은 반드시 true | false 의 결과가 나오게끔 작성해야 함
 */
public class IfSample {
	
	// Field (맴버변수) : 접근제한자 [예약어] 자료형 변수명[= 초기값];
	private Scanner scan = new Scanner(System.in);
	
	// Constructor (생성자함수) : 클래스에 대한 객체공간을 힙(heap)메모리에 할당할 때 사용하는 초기화함수
	// new 생성자함수(초기값...)
	// 생성자 함수명은 반드시 클래스명과 같아야 함
	// public 클래스명(){} => 기본 생성자라고 함, jvm이 준비한 기본값으로 초기화할 때 사용함
	// 클래스 안에 생성자가 없으면, jvm에 의해서 컴파일 시에 class 파일에 자동 추가됨
	public IfSample() {} // 직접 작성을 권장함
	
	// Method(맴버함수 : 기능)
	// 접근제한자 [예약어] 반환자료형 메소드이름([자료형 매게변수명, ......]) {처리할 코드 구문}
	
	/**
	 * 정수를 하나 입력받아서, 양수일 때만 입력된 수의 구구단 출력 처리
	 * 양수가 아니면 처리할 내용 없음
	 */
	public void testGugudan() {
		System.out.printf("정수 하나 입력:");
		int dan = scan.nextInt();
		
		if(dan > 0) {
			// dan 변수 안의 값이 양수일 때만 작동할 구문 작성 => 구구단 출력
			// dan 변수값 * 1 = 결과 ..... dan 변수값 * 9 = 결과 : 9번 반복 출력
			// 반복할 횟수가 정해진 경우에는 주로 for문 사용함\
			for(int su = 1; su < 10; su++) {
				System.out.println(dan+" * "+ su +" = "+ (dan*su));
			} // for
		} // if
		
	} // testGUgudan()
	
	/**
	 * 문자 하나를 입력받아, 0 ~ 65535 (unsigned 2byte) 범위의 값이면서, 영어 대문자일때만 문자의 유니코드를 출력 처리
	 */
	public void testUnicode() {
		
		// 1. 변수 선언과 값 대입(기록)		
		// 문자 하나 입력
		System.out.printf("문자 하나 입력: ");
		char temp = scan.next().charAt(0);
		
		// 2. 준비된 변수방 안의 값을 가지고 연산 처리 : 연산자와 제어문 사용함
		// 2바이트이면서 영어 대문자
		if( (temp>= 0 && temp <= 65535) && (temp>= 'A' && temp <= 'Z')) {
			System.out.println(temp + " is unicode "+ (int)temp);
		}
		
		// 3. 결과 출력 확인 또는 결과값 반환 처리
		return; // 반환값 없음 => void
	}
	
	public void testUnicode2() {
		// 1. 변수 선언과 값 대입(기록)		
		// 문자 하나 입력
		System.out.printf("문자 하나 입력: ");
		char temp = scan.next().charAt(0);
		
		// 2. 준비된 변수방 안의 값을 가지고 연산 처리 : 연산자와 제어문 사용함
		// 2바이트이면서 영어 대문자
		if(temp>= 0 && temp <= 65535) {
			if(temp>= 'A' && temp <= 'Z') {
				System.out.println(temp + " is unicode "+ (int)temp);
			}
		}
		
		// 3. 결과 출력 확인 또는 결과값 반환 처리
		return; // 반환값 없음 => void
	}
	
	/**
	 * 콘솔에 "회원이면  1, 비회원이면 2입력 : " 출력
	 * 입력값이 1이면 "로그인할 아이디 :" 출력하고 아이디 입력받고 "암호: " 출력하고 암호 입력받음 아이디와 암호 확인 출력
	 * 입력값이 2이면 "회원 가입하셔야 합니다." 출력하고 "이름: ", "아이디 지정: ", "암호 지정: ", "이메일: ", "전화번호: ", "성별(남/여): ", "나이: " 전부 입력받고 입력받은 값 전부 출력
	 */
	public void testLogin() {
		
		String id = "";
		String pwd = "";
		
		System.out.printf("회원이면 1, 비회원이면 2 입력: ");
		int check = scan.nextInt();
		
		if (check == 1) {
			
			System.out.printf("로그인할 아이디: ");
			id = scan.next();
			System.out.printf("암호: ");
			pwd = scan.next();
			
			System.out.println("입력한 아이디: "+id+" 입력한 암호: "+ pwd);			
		} else if(check == 2) {
			System.out.println("회원 가입하셔야 합니다.");
			System.out.printf("이름: ");
			String name = scan.next(); 
			System.out.printf("아이디 지정: ");
			id= scan.next();
			System.out.printf("암호 지정: ");
			pwd = scan.next();
			System.out.printf("이메일: ");
			String email = scan.next();
			System.out.printf("전화번호: ");
			String phone = scan.next();
			System.out.printf("성별(남/여): ");
			char gender = scan.next().charAt(0);
			System.out.printf("나이: ");
			int age = scan.nextInt();
			
			System.out.printf("이름: %s, 아이디: %s, 암호: %s, 이메일: %s, 전화번호: %s, 성별: %s, 나이: %d",name,id,pwd,email,phone,gender,age);
		}
	}
} // IfSample
