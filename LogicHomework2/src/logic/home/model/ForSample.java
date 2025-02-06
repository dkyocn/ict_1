package logic.home.model;

import java.util.Scanner;

public class ForSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 1~10까지 정수들의 합계 구하기
	public void sum1To10() {
		
		int sum = 0;

		for(int i = 1; i <= 10; i++) {
			System.out.printf(i + " + ");
			sum += i; // 10번 수행됨
		}

		System.out.println("1 ~ 10까지 정수들의 합: "+ sum);
		
	}

	// 1~100사이의 짝수들의 합게 구하기
	public void sumEven1To100() {
		
		int sum = 0;

		for(int i = 0; i <= 100; i+=2) {
			sum += i; // 100번 수행됨

			System.out.println("1 ~ 100까지 짝수들의 합: "+ sum);
		}
	}

	// 정수 하나 입력받아, 그 수의 구구단 출력하기
	public void oneGugudan() {
		
		int num = 0;

		System.out.printf("단수 입력: ");
		num = scanner.nextInt();

		for (int i = 1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}

	// 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기
	public void sumMinToMax() {
		
		int max =  0;
		int min = 0;
		int change = 0;
		int sum = 0;
		
		System.out.printf("첫번째 정수 입력: ");
		max = scanner.nextInt();
		System.out.printf("두번째 정수 입력: ");
		min = scanner.nextInt();
		
		// 입력받은 값 대소 비교
		if (min > max) {
			change = max;
			max = min;
			min = change;
		}
		
		// 작은 수부터 큰 수까지의 합
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min+"부터 "+max+"까지의 합: "+sum);
		
	}

	// 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기
	public void printStar() {
		
		int space;
		int line;
		
		System.out.printf("출력할 줄수를 입력해 주세요: ");
		line = scanner.nextInt();
		System.out.printf("출력할 칸수를 입력해 주세요: ");
		space = scanner.nextInt();
		
		for(int i=0; i<line;i++) {
			for(int j=0;j<space;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}

	// 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기
	public void printNumberStar() {
		
		for(int i=0; i<7;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			System.out.println(i+1);
		}
	}

	// 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)
	public void printTriangleStar() {
		
		int line = 0;

		System.out.printf("정수 입력: ");
		line = scanner.nextInt();

		if (line > 0) {
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		} else if (line == 0) {
			System.out.println("출력 기능이 없습니다.");
		} else {
			for (int i = 0; i < -line; i++) {
				for (int j = 0; j < -line; j++) {
					if (i > j) {
						System.out.printf(" ");
					} else {
						System.out.printf("*");
					}
				}
				System.out.println();
			}
		}
		
	}

	// 구구단 2단부터 9단까지 출력하기
	public void guguDan() {
		
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" * "+ j+" = "+(i*j));
			}
		}
		
	}
}
