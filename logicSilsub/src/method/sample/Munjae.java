package method.sample;

import java.util.Scanner;

public class Munjae {
	
	private Scanner  scan = new Scanner(System.in);
	
	/**
	 * 국,영,수 세과목(int) 점수 입력 받고
	 * 합계, 평균 계산
	 * 합격 조건 -> 세 과목 점수 각각 40점 이상, 평균 60점 이상
	 * 합격시 점수, 합계, 평균 출력하고 합격 리턴, 불합격시 불합격 리턴
	 */
	public String test1() {
		
		int korean = 0;
		int english = 0;
		int math = 0;
		
		int total = 0;
		int avg = 0;
		String result = "";
		
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
			result = "합격";
		} else {
			result = "불합격";
		}
		
		return result;
	}
	
	/**
	 * switch 문
	 * 
	 * 메서드 실행 위치에서 화면에 출력하고 번호 입력받고
	 * 입력받은 번호를 실행하는 메서드에 전달
	 * 메서드 안에서 전달받은 값을 가지고 문장을 리턴처리
	 */
	public String test2(int num) {
		
		String message = "";
		
		switch(num) {
		case 1:
			message = "\n입력메뉴가 선택되었습니다.";
			break;
		case 2:
			message = "\n수정메뉴가 선택되었습니다.";
			break;
		case 3:
			message = "\n조회메뉴가 선택되었습니다.";
			break;
		case 4:
			message = "\n삭제메뉴가 선택되었습니다.";
			break;
		case 7:
			message = "\n프로그램이 종료되었습니다.";
			break;
		default:
			message = "\n번호가 잘못 입력되었습니다.\n다시 입력하십시오.";
			break;
		}
		
		return message;
		
	}
	
	/**
	 * 메서드 실행 위치에서 정수 하나를 입력받아 전달 받아 양수인지 판별하는 메서드
	 * 양수면 true, 양수가 아니면 false 리턴
	 * 메서드 실행 위치에서 리턴받은 true | flase를 가지고 양수다. / 양수가 아니다 출력
	 */
	public boolean test3(int num) {
		
//		boolean result = true;
		
//		if (num >0) {
//			result = true;
//		} else {
//			result = false;
//		}
		
		return num > 0;
	}
	
	/**
	 * 매서드 실행 위치에서 정수를 입력받아 전달하고 
	 * 메서드 안에서 양수인지 판별하고 양수이면 짝수인지 홀수인지 판별하여 짝수다 / 홀수다 리턴
	 * 양수가 아니면 양수만 가능합니다 리턴 
	 */
	public String  test4(int num) {
		
		String temp = "";
		
		if(num > 0) {
			if (num % 2 == 0) {
				temp = "짝수다.";
			} else {
				temp = "홀수다.";
			}
		} else {
			temp = "양수만 가능합니다.";
		}

		return temp;
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
	
		if (name != null && name.length()>0 && age >0 && hight>0) {
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
