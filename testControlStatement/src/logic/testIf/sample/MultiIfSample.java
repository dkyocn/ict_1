package logic.testIf.sample;

import java.util.Scanner;

/**
 * 다중 if문 사용 샘플 
 * if(조건1) {
 *  [조건1이 true 일 때 실행 코드] 
 *  } else if(조건2){
 *   [조건1이 false이고 조건2가 true 일 때 처리할 구문들] 
 *  } else if(조건3){
 *   [조건1,2가 false이고 조건3가 true 일 때 처리할 구문들] 
 *  } else if(조건N){
 *   위 조건들이 모두 false고, 조건식N이 true일 때 처리할 구문들 
 *  } else {
 *   마지막 else 사용은 선택사항임
 *   위에 제시된 모든 조건이 false 일 때 처리할 구문들
 *  }
 */
public class MultiIfSample {

	private Scanner scan = new Scanner(System.in);
	
	public MultiIfSample() {}
	
	
	/** 
	 * 3 개의 정수를 입력받아서, 세 수중 가장 큰값을 찯아내서 max 변수에 저장 후 출력
	 */
	public void checkThreeMax() {
		
		int first = 0;
		int second = 0;
		int third= 0;
		int max = 0;
		
		System.out.printf("첫번째 정수 입력: ");
		first = scan.nextInt();
		System.out.printf("두번째 정수 입력: ");
		second = scan.nextInt();
		System.out.printf("세번째 정수 입력: ");
		third = scan.nextInt();
		
		
		if(first>second && first>third) {
			max = first;
		} else if(second> third) { // else가 second > first 의 뜻을 가지고 있음 (위 조건의 반대 의미)
			max = second;
		} else {
			max =  third;
		}
		
		System.out.println("max: "+max);
	}
	
	/**
	 * 키보드로 점수(int)를 입력받아, 점수에 대한 등급(char)을 부여해서 출력
	 * 단, 점수는 반드시 0이상의 값이어야 함
	 * 다중 if문으로
	 * 점수가 90 이상이면 A
	 * 80 이상이면 B
	 * 70 이상이면 C
	 * 60 이상이면 D
	 * 60 미만이면 F
	 * 점수와 등급을 출력
	 * 
	 * 점수가 0미만이면 "잘못 입력하셨습니다" 출력
	 */
	public void scoreToGrade() {
		
		int score = 0;
		char grade = 'A';
		
		System.out.printf("점수 입력: ");
		score = scan.nextInt();
		
		if(score >=0 ) {
			if(score>=90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("점수: "+score+", 등급: "+grade);
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	
	/**
	 * 문자 하나를 입력받아서
	 * 영어 대문자이면 "upper" 출력
	 * 영어 소문자이면 "lower" 출력
	 * 숫자이면 "numeric" 출력
	 * 한글이면 "korea" 출력(한글의 범위: '가' ~'힝', 'ㄱ ~ 'ㅣ')
	 * 그 외 문자이면 "other" 출력 
	 */
	public void checkChar() {
		
		char temp;
		String result="";
		System.out.printf("문자 하나 입력: ");
		temp = scan.next().charAt(0);
		
		if (temp>='A' && temp <='Z') {
			result = "upper";
		} else if (temp >='a' && temp <='z') {
			result = "lower";
		} else  if (temp >='가' && temp <='힣' || temp >='ㄱ' && temp <= 'ㅣ') {
			result = "korea";
		} else if (temp >=0 && temp <=9 ) {
			result = "numeric";
		} else {
			result = "other";
		}
		
		System.out.println(temp+" is "+result);
		
	}
	
	/**
	 * char의 wrapper class 인 Character 클래스가 제공하는 메서드 이용으로 바꾼다면
	 * 메서드 앞에 static(정적메모리) 이 붙은 경우에는 클래스명.메서드()로 사용됨
	 */
	public void checkChar2() {
		
		char temp;
		String result="";
		System.out.printf("문자 하나 입력: ");
		temp = scan.next().charAt(0);
		
		if (Character.isUpperCase(temp)) {
			result = "upper";
		} else if (Character.isLowerCase(temp)) {
			result = "lower";
		} else  if (isHangul(temp)) { // 같은 클래스 안의 메서드 사용 : 메서드명(전달값)
			result = "korea";
		} else if (Character.isDigit(temp) ) {
			result = "numeric";
		} else {
			result = "other";
		}
		
		System.out.println(temp+" is "+result);
		
	}
	
	// 매개변수도 있고 반환값도 있는 메서드
	// private (비공개) : 클래스 안에서만 사용할 수 있음
	// isHangul 메서드는 문자 하나를 전달 받아서, 메서드가 처리한 결과로 boolean 자료형 값 하나를 리턴하는 메서드이다.
	private boolean isHangul(char ch) { 
		// 한글의 유니코드 범위
		// 첫 번째 조건 한글 완성형 (가~ 힣), 두 번째 조건 한글 개별 자음 모음(초성, 중성, 종성), 세 번째 조건 한글 호환 자음 모음(ㄱ ~ ㅣ), 네 번째 한글 확장 자음 모음 A, 다섯 번째 한글 확장 자음 모음 B
		return (ch >= 0xAC00 && ch <= 0xD7A3 || ch >= 0x1100 && ch <= 0x11FF
			|| ch >= 0x3130 && ch <= 0x318F || ch >= 0xA960 && ch <= 0xA97F || ch >= 0xD7B0 && ch <= 0xD7FF);
		}
	
	/**
	 * 두 개의 정수를 입력받아, 두 수(A,B)를 비교한 후
	 * 어떤 수가 큰지 혹은 같은지 비교
	 */
	public void isGrateOrEquals() {
		
		int first = 0;
		int second = 0;
		
		System.out.printf("첫 번째 정수 입력: ");
		first = scan.nextInt();
		System.out.printf("첫 번째 정수 입력: ");
		second = scan.nextInt();
		
		if (first > second) {
			System.out.println(first+"가(이) "+second+"보다 크다.");
		} else  if (first < second) {
			System.out.println(second+"가(이) "+first+"보다 크다.");
		} else {
			System.out.println(first+"와(과) "+second+"는 같다.");
		}
	}
}
