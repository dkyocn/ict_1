package logic.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	
	Scanner scan = new Scanner(System.in);
	
	/**
	 *  간단 계산기
	 */
	public void calculator() {
		
		int first = 0;
		int second = 0;
		char operator = '+';
		
		// 정수 및 연산문자 입력
		System.out.printf("첫번째 정수: ");
		first = scan.nextInt();
		System.out.printf("두번째 정수: ");
		second = scan.nextInt();
		System.out.printf("연산 문자(곱하기는 x(X)로 입력): ");
		operator = scan.next().charAt(0);
		
		// 계산 및 출력
		switch(operator) {
		case '-':
			System.out.println(first + " - " + second+ " = "+(first-second));
			break;
		case '+':
			System.out.println(first + " + " + second+ " = "+(first+second));
			break;
		case 'x':
		case 'X':
			System.out.println(first + " X " + second+ " = "+(first*second));
			break;
		case '/':
			if(second == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println(first + " / " + second+ " = "+0);
			} else {
				System.out.println(first + " / " + second+ " = "+(first/second));
			}
			break;
		}
	}
	
	/**
	 * 작은 수에서 큰 수까지 합계
	 */
	public void totalCalculator() {
		
		int num1 = 0;
		int num2 = 0;
		
		// 두 개의 정수 입력
		System.out.printf("첫번째 수 입력: ");
		num1 = scan.nextInt();
		System.out.printf("두번째 수 입력: ");
		num2 = scan.nextInt();
		
		// 작은 수 판별 후 합계 구하기
		if (num1 < num2) {
			minMaxNumSum(num1,num2);
		} else {
			minMaxNumSum(num2,num1);
		}
		
	}
	
	/**
	 * 작은 수 부터 큰수 까지의 합계를 구한 후 출력
	 * @param min 입력받은 수 중 작은 수
	 * @param max 입력받은 수 중 큰수
	 */
	private void minMaxNumSum(int min, int max) {
		
		int result = 0;
		
		// 작은 수부터 큰 수 까지 합계
		for (int i = min; i<=max; i++) {
			result += i;
		}
		
		System.out.printf("%d부터 %d까지 정수들의 합계: %d\n",min,max,result);
	}

	/**
	 * 신상정보 확인하기
	 */
	public void profile() {
		
		String name = "";
		int age = 0;
		String gender = "";
		String personality = "";
		
		// 신상 정보 입력
		System.out.printf("이름: ");
		name = scan.next();
		System.out.printf("나이: ");
		age = scan.nextInt();
		System.out.printf("성별(남자/여자): ");
		gender = scan.next();
		System.out.printf("성격: ");
		personality = scan.next();
		
		System.out.println("[신상정보]");
		System.out.println("이름: "+name+"\n나이: "+age+"\n성별: "+gender+"\n성격: "+personality);
	}
	
	/**
	 * 학생정보 확인하기
	 */
	public void sungjuk() {
		
		String name = "";
		int grade = 0;
		int group = 0;
		int num = 0;
		char gender = 'M';
		double score = 0.0;
		char mark = 'A';
		
		// 학생 정보 입력
		System.out.printf("학생이름: ");
		name = scan.next();
		System.out.printf("학년: ");
		grade = scan.nextInt();
		System.out.printf("반: ");
		group = scan.nextInt();
		System.out.printf("번호: ");
		num = scan.nextInt();
		System.out.printf("성별(M/F): ");
		gender = scan.next().charAt(0);
		System.out.printf("성적(소수 둘째 자리까지 입력): ");
		score = scan.nextDouble();
		
		// 학점 구하기
		mark = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %s학점입니다.\n",grade,group,num,gender == 'M' ? "남학생" : "여학생", name, score, mark);
	}
	
	/**
	 * 난수까지의 합게 구하기
	 */
	public void sumRandomNumber() {
		
		int randomNum = 0;
		int result = 0;
		
		// 1 ~ 100 사이의 난수 생성
		randomNum = (int)(Math.random() * 100) + 1;
		
		// 1부터 생성된 난수까지의 합계 구하기
		for(int i = 1; i<=randomNum; i++) {
			result += i;
		}
		
		System.out.println("1부터 "+randomNum+"까지의 합계: "+result);
	}
	
	/**
	 * 구구단
	 */
	public void continueGugudan() {
		
		int singular = 0;
		int multiple = 0;
		
		// 정수 입력 받기 및 제외할 배수 구하기
		System.out.printf("정수 하나 입력: ");
		singular = scan.nextInt();
		
		multiple = singular*singular;
		
		// 음수 판별 및 입력받은 배수 제외한 값 출력
		if(singular < 0) {
			System.out.println("양수가 아닙니다.");
		} else {
			
			System.out.println("\n단수: "+ singular);
			System.out.println("제외할 배수: "+ multiple);
			
			for (int i = 1; i < 10; i++) {
				
				if((singular*i) % multiple == 0 ) {
					continue;
				}
				
				System.out.println(singular+" * "+i+" = "+ singular*i);
			}	
		}
	}
	
	/**
	 * 주사위 숫자 알아맞추기 게임
	 */
	public void shutNumber() {
		
		Random random = new Random();
		
		int dice = 0;
		int expectedNum = 0;
		boolean loop = true;
		
		
		// 게임 무한 루프
		do {
			// 2 ~ 12 난수 저장
			dice = random.nextInt(11) + 1;
			
			// 예상 가는 값 입력
			System.out.printf("두 주사위 눈의 합을 맞춰 보세요: ");
			expectedNum = scan.nextInt();
			
			// 난수와 입력값 비교로 게임 승패 여부 판단
			if(dice == expectedNum) {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
			
			//게임 계속 진행 여부
			System.out.printf("계속하시겠습니까?(y/n): ");
			char yn = scan.next().charAt(0);
				
			if(yn == 'n') {
				loop = false;
			}
			
		} while(loop);
	}
}
