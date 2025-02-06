package logic.home.model;

import java.util.Scanner;

public class IfSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
	public void maxNumber() {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.printf("첫 번째 정수 입력: ");
		num1 = scanner.nextInt();
		System.out.printf("두 번째 정수 입력: ");
		num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("입력하신 두 수 중 큰 수는 "+num1+" 입니다.");
		} else {
			System.out.println("입력하신 두 수 중 큰 수는 "+num2+" 입니다.");
		}
	}

	// 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
	public void minNumber() {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.printf("첫 번째 정수 입력: ");
		num1 = scanner.nextInt();
		System.out.printf("두 번째 정수 입력: ");
		num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("입력하신 두 수 중 작은 수는 "+num2+" 입니다.");
		} else {
			System.out.println("입력하신 두 수 중 작은 수는 "+num1+" 입니다.");
		}
	}

	// 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기
	public void threeMaxMin() {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.printf("첫 번째 정수 입력: ");
		num1 = scanner.nextInt();
		System.out.printf("두 번째 정수 입력: ");
		num2 = scanner.nextInt();
		System.out.printf("세 번째 정수 입력: ");
		num3 = scanner.nextInt();
		
		if (num1 > num2) {
			if(num2>num3) {
				System.out.println("입력하신 수 중 가장 큰 수는 " +num1+" 이고 가장 작은 수는 "+num3+" 입니다.");
			} else {
				if(num1 > num3) {
					System.out.println("입력하신 수 중 가장 큰 수는 " +num1+" 이고 가장 작은 수는 "+num2+" 입니다.");
				} else {
					System.out.println("입력하신 수 중 가장 큰 수는 " +num3+" 이고 가장 작은 수는 "+num2+" 입니다.");
				}	
			}
		} else {
			if(num1>num3) {
				System.out.println("입력하신 수 중 가장 큰 수는 " +num2+" 이고 가장 작은 수는 "+num3+" 입니다.");
			} else {
				if(num2 > num3) {
					System.out.println("입력하신 수 중 가장 큰 수는 " +num2+" 이고 가장 작은 수는 "+num1+" 입니다.");
				} else {
					System.out.println("입력하신 수 중 가장 큰 수는 " +num3+" 이고 가장 작은 수는 "+num1+" 입니다.");
				}	
			}
		}
	}

	// 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기
	public void checkEven() {
		
		int num1 = 0;
		
		System.out.printf("정수 하나 입력: ");
		num1 = scanner.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("입력하신 수는 짝수 입니다.");
		} else {
			System.out.println("입력하신 수는 홀수 입니다.");
		}
	}

	// 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기
	public void isPassFail() {
		
		int korean = 0;
		int english = 0;
		int math = 0;
		
		int total = 0;
		int avg = 0;
		
		System.out.printf("국어 점수: ");
		korean = scanner.nextInt();
		System.out.printf("영어 점수: ");
		english = scanner.nextInt();
		System.out.printf("수학 점수: ");
		math = scanner.nextInt();
		
		total = korean + english + math;
		avg = total / 3;
		
		if (korean>=40 && english>=40 && math>=40 && avg>=60 ) {
			System.out.println("축하드립니다. 합격입니다.");
		} else {
			System.out.println("아쉽습니다. 불합격입니다.");
		}
		
	}

	// 점수를 입력받아, 학점 확인하기
	public void scoreGrade() {
		
		int score = 0;
		char grade;
		
		System.out.printf("점수 입력(단, 0이상의 값만 입력): ");
		score = scanner.nextInt();
		
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
			System.out.println("잘못된 점수 입니다.");
		}
		
	}

	// 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기
	public void checkPlusMinusZero() {
		
		int num1 = 0;
		String result = "";
		
		System.out.printf("정수 하나 입력: ");
		num1 = scanner.nextInt();
		
		if (num1 > 0) {
			result = "양수";
		} else if(num1 == 0) {
			result = "0";
		} else {
			result = "음수";
		}
		
		System.out.println("입력하신 수는 "+result+" 입니다.");
		
	}

	// 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기
	public void whatCaracter() {
		
		char temp;
		String result="";
		
		System.out.printf("문자 하나 입력: ");
		temp = scanner.next().charAt(0);
		
		if (temp>='A' && temp <='Z') {
			result = "영어 대문자";
		} else if (temp >='a' && temp <='z') {
			result = "영어 소문자";
		} else if (temp >=0 && temp <=9 ) {
			result = "숫자";
		} else {
			result = "기타 문자";
		}
		
		System.out.println("입력하신 "+temp+" 는 "+result+"입니다.");
		
	}

}
