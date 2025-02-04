package silsub.sample;

import java.util.Scanner;

public class Munjae {
	
	private Scanner  scan = new Scanner(System.in);
	
	/**
	 * 국,영,수 세과목(int) 점수 입력 받고
	 * 합계, 평균 계산
	 * 합격 조건 -> 세 과목 점수 각각 40점 이상, 평균 60점 이상
	 * 합격시 합격 출력, 불합격시 불합격 출력
	 */
	public void test1() {
		
		int korean = 0;
		int english = 0;
		int math = 0;
		
		int total = 0;
		int avg = 0;
		
		System.out.printf("국어 점수: ");
		korean = scan.nextInt();
		System.out.printf("영어 점수: ");
		english = scan.nextInt();
		System.out.printf("수학 점수: ");
		math = scan.nextInt();
		
		total = korean + english + math;
		avg = total / 3;
		
		if (korean>=40 && english>=40 && math>=40 && avg>=60 ) {
			System.out.println("국어 점수: "+ korean+ ", 영어 점수: "+english+", 수학 점수: "+math+", 합계: "+total);
		} else {
			System.out.println("불합격");
		}
		
	}
	
	/**
	 * switch 문
	 */
	public void test2() {
		
		int num = 0;
		
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.printf("메뉴번호 입력: ");
		num = scan.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("\n입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("\n수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("\n조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("\n삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("\n프로그램이 종료되었습니다.");
			break;
		default:
			System.out.println("\n번호가 잘못 입력되었습니다.\n다시 입력하십시오.");
			break;
		}
		
	}
	
	/**
	 * 정수 하나 입력받아 양수인지 판별하는 메서드
	 */
	public void test3() {
		
		int num = 0;
		
		System.out.printf("정수 하나 입력: ");
		num = scan.nextInt();
		
		if (num >0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}
	
	/**
	 * 정수를 입력받아 양수인지 판별하고 양수이면 짝수인지 홀수인지 판별하는 메서드 
	 */
	public void  test4() {
		
		int num = 0;
		String temp = "";
		
		System.out.printf("정수 하나 입력: ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			temp = "짝수다.";
		} else {
			temp = "홀수다.";
		}
		
		System.out.println("결과: "+temp);
	}
	
	/**
	 * 이름, 나이, 키를 입력받아 
	 * 이름이 null이 아니면서 비어있는 문자열이 아니고, 나이와 키가 양수일 때만 값을 출력해주는 메서드
	 */
	public void inputTest() {
		
		String name =  "";
		int age = 0;
		double hight = 0.0;
		
		System.out.printf("이름: ");
		name = scan.next();
		System.out.printf("나이: ");
		age = scan.nextInt();
		System.out.printf("키: ");
		hight = scan.nextDouble();
	
		if (name.isBlank() && age >0 && hight>0) {
			System.out.println(name+"의 나이는 "+age+"이고, 키는  "+hight+"cm 이다.");
		}
	}
	
	/**
	 * 두 개의 정수를 입력받아 두 수가 모두 양수일 때만 합,차,곱,몫을 출력하는 메서드 
	 */
	public void test6() {
		
		int first = 0;
		int second = 0;
		
		System.out.printf("첫 번째 정수: ");
		first = scan.nextInt();
		System.out.printf("두 번째 정수: ");
		second = scan.nextInt();
		
		if (first > 0 && second > 0) {
			System.out.println(first+" + "+second+" = "+(first+second));
			System.out.println(first+" - "+second+" = "+(first-second));
			System.out.println(first+" * "+second+" = "+(first*second));
			System.out.println(first+" / "+second+" = "+(first/second));
			System.out.println(first+" % "+second+" = "+(first%second));
		}
	}
	
	/**
	 * 점수를 입력받아 학점을 정하는 메서드
	 * 학점 -> 90 이상 : A, 90 미만 80 이상 : B, 80 미만 70 이상 : C, 70 미만 60 이상: D, 60 미만: F 
	 */
	public void test7() {
		
		int score = 0;
		char grade;
		
		System.out.printf("점수 입력(단, 0이상의 값만 입력): ");
		score = scan.nextInt();
		
		if(score>0) {
			if (score>=90) {
				grade = 'A';
			} else if (score>=80) {
				grade = 'B';
			} else if (score>=70) {
				grade = 'C';
			} else if (score>=60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("점수: "+score+", 학점: "+grade);
		} else {
			System.out.println("잘못된 점수 입니다.\n다시 입력해주세요.");
		}
	}
}
