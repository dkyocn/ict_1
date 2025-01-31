package test.operator.sample;

import java.util.Scanner;
//import java.lang.*; // 생략할 수 있음. 생략하면 컴파일 시에 자동으로 추가됨

/**
 * 삼항 연산자(ternary operator) 연습용 클래스
 * 항목이 3개로 표현되는 연산자, 13순위
 * 첫번째 항목 ? 두번째 항목 : 세번째 항목
 * 조건 표현식 ? 조건의 결과가 참일 때 선택할 값(true) : 조건의 결과가 거짓일 때 선택할 값(false)
 * 자료형 변수명 = (조건표현식) ? 값1 : 값2;
 * 다른 문장의 부분 사용 가능: 선택된 값을 사용하는 구문에 적용
 * 조건표현식은 반드시 결과가 true | false 가 나오게끔 작성
 * 일반 산술계산식(true | false) 결과가 아닌 식은 사용할 수 없음
 */
public class TernaryOperator {

	Scanner scan = new Scanner(System.in);
	
	/*
	 * 메서드 작성 규칙
	 * 접근제한자 [예약어] 반환자료형 메서드명([자료형 변수명, .....]) {소스 코드 구문}
	 * 반환자료형 : return 되는 값의 자료형 표기, return 10; --> int가 반환자료형
	 * void -> 반환되는 값 없음
	 */
	
	/**
	 * 정수 한 개를 키보드로 입력받아, 그 수의 절대 값을 출력
	 * 정수: 음수 0 양수
	 * 		1씩 차이나는 수, 소수점 아래값 취급 안함
	 * 절대값(absolute) : 모든 정수의 양수화(음수 --> 양수로 바꿈, 0과 양수는 그대로 처리)
	 */
	public void testAbs() {
		
		System.out.printf("정수 하나 입력: ");
		int num = scan.nextInt();
		
		System.out.println(num+ "의 절대값: "+ (num<0 ? -num : num));
		
		return; // return 값 없을 때 생략 가능, 생략 시 컴파일 시에 자동으로 추가됨
		// 모든 메서드 맨 마지막에는 return 문이 존재해야 함
		// System.out.println(); return 문 다음에는 코드가 존재할 수 없음
	}
	
	/**
	 * 문자 하나를 키보드로 입력받아서
	 * 영어 소문자이면 "Lower" 출력
	 * 영어 대문자이면 "Upper" 출력
	 * 숫자 문자이면 "Numeric" 출력
	 * 그 외의 문자는 "Etc" 출력
	 * 
	 * 삼항연산자 중첩 사용 가능함
	 * (조건1) ? true 일 때 선택 값 : ((조건2) ? 조건1이 false이면서 조건2가 true일 때 선택값 : ((조건3)? 조건 1과 2가 false이면서 조건 3이 true일 때 선택 값 : 모든 조건이 false일 때 선택 값))
	 */
	public void testAlphabettic() {
		
		System.out.printf("문자 하나 입력: ");
		char ch = scan.next().charAt(0);
		
		
//		String result = 65<=(int)ch && (int)ch<=90 ? "Upper" : 97<=(int)ch && (int)ch<=122 ? "Lower" : 48<=(int)ch && (int)ch<=57 ? "Numeric" : "Etc" ;
		
		/*
		 * 비교 연산자
		 * 비교 연산자 사용시 char, int 한문자 일 시 자동으로 ascii코드로 변환 후 비교
		 */
		
		String result = (ch>='a' && ch <='z') ? "Lower" : 
			(ch>='A' && ch <='Z') ? "Upper" :
				(ch >= '0' && ch <= '9') ? "Numeric" : "Etc";
		
		
		System.out.println(ch + " is "+result);
		
	}
	
	/**
	 * 삼항연산자 중첩 사용 테스트 2
	 * 정수 하나를 입력받아서, 
	 * 양수이면 "Positive",
	 * 음수이면 "Negative", 
	 * 0이면 "Zero" 
	 */
	public void  testInteger() {
		
		/*
		 *  메서드 안 코딩 작성 순서
		 *  1. 변수 선언 및 초기화
		 */
		
		System.out.printf("정수 하나 입력: ");
		int num = scan.nextInt();
		
		// 2. 준비된 변수 안의 값에 대한 계산 처리 : 연산자와 제어문 사용
		String result = num == 0 ? "Zero" : num < 0 ? "Negative" : "Positive";
		
		// 3. 계산 결과 처리 : 출력 확인 또는 return
		System.out.println(num + " is "+result);
	}
	
	/**
	 * 학생 정보 입력받아서, 성적에 대한 등급 처리하고 출력
	 * 국어 점수(kor:int), 영어 점수(eng:int), 수학 점수(mat:int) 입력 받아
	 * 총점(tot:int), 평균(avg:double) 구하고
	 * 평균을 가지고 등급(grade:char) 구하고
	 * 전부 출력(단, 평균은 소수 첫재자리까지만 출력)
	 * 
	 * 등급 기준
	 * 평균 90이상 'A'
	 * 80 이상 90 미만 'B'
	 * 70 이상 80 미만 'C'
	 * 60 이상 70 미만 'D'
	 * 60 미만 'F'
	 */
	public void testExample() {
		
		// 1. 변수 선언과 값 기록
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int tot = 0;
		double avg = 0.0;
		char grade = 'A';
		
		System.out.printf("국어 점수: ");
		kor = scan.nextInt();
		System.out.printf("수학 점수: ");
		mat = scan.nextInt();
		System.out.printf("영어 점수: ");
		eng = scan.nextInt();
		
		// 2. 기록된 변수 값 사용해서 계산
		tot = kor + mat + eng;
		avg = tot / 3.0;
		
		// 평균에 대한 등급 처리
		grade = avg >=90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F';
//		grade = avg >= 90 ? 'A' : avg < 90 && avg >=80 ? 'B' : avg < 80 && avg >= 70 ? 'C' : avg < 70 && avg >=60 ? 'D' : 'F';
				
		// 3. 결과 출력 또는 반환
//		System.out.println("국어 점수: "+kor+"\n수학 점수: "+mat+"\n영어 점수: "+eng+"\n총점: "+tot+"\n평균: "+((int)(avg*10) / 10.0)+"\n등급: "+grade);
		System.out.printf("국어 점수: %d\n수학 점수: %d\n영어 점수: %d\n총점: %d\n평균: %.1f\n등급: %s",kor,mat,eng,tot,avg,grade);
	}
	
	/**
	 * 삼항 연산자 연습 2
	 * 수험 생의 이름과 점수를 입력받아 점수가 60이상이면 "합격" 아니면 "불합격" 문자열 변수에 저장하여 출력
	 * 출력 예) 홍길동님, 합격입니다. 축하합니다. / 홍길동님, 불합격입니다. 다음기회에 분발합시다.
	 * 출력도 삼항연산자 적용
	 */
	public void testPractice1() {
		
		String name = "";
		int score = 0;
		
		System.out.printf("수험생 이름: ");
		name = scan.next();
		System.out.printf("점수: ");
		score = scan.nextInt();
		
		String message = score >= 60 ? "님, 합격입니다. 축하합니다." : "님, 불학격입니다. 다음 기회에 분발합시다.";
		
		System.out.println(name+message);
		
	}
	
	/**
	 * 삼항 연산자 연습3
	 * 믄자 하나를 입력받아 출력
	 * "프로그램을 종료하시겠습니까?(종료:y,취소:n):"
	 * 대소문자 상관없이 'y'이면 종료
	 * 대소문자 상관없이 'n'이면 종료 취소 => "프로그램 계속 진행중입니다." 출력
	 * 
	 * 프로그램 종료 처리 방법 1 : java.lang.System 클래스에 exit(0) static 메서드 사용
	 * 프로그램 종료 처리 방법 2 : main()까지 리턴 처리(권장)
	 */
	public void testQuestion() {
	
		System.out.printf("프로그램을 종료하시겠습니까?(종료:y, 취소:n)");
		char yn = scan.next().charAt(0); // toUpperCase() 사용하여 대문자로만 비교 or toLowerCase() 사용하여 소문자로만 비교
		
		/*
		 *  삼항연산자는 계산한 결과값을 선택하는 연산자
		 *  삼항연산자에서 참과 거짓일 때 선택할 값부분에 실행할 구문에 작성하면 에러
		 *  해결 : if 문 사용
		 */
		if(yn == 'Y' || yn == 'y') { 
			System.out.println("프로그램 종료되었습니다.");
//			System.exit(0);
			return;
		} else {
			System.out.println("프로그램 계속 진행중입니다.");
			return;
		}
	}
}