package logic.loop.sample;

import java.util.Scanner;

/**
 * 반복 횟수가 정해져 있지 않았을 때 주로 사용하는 구문 while(반복에 대한 조건식) { 조건이 참일 때 반복할 구문들 }
 * 
 * for 문과 다른 점 : 초기식, 증감식이 없음
 */
public class WhileSample {

	private Scanner scan = new Scanner(System.in);

	/**
	 * 문자열을 입력받아, 입력된 문자열의 글자 개수를 출력 => 반복 실행 "exit"가 입력되면 반복 종료함
	 */
	public void printStringLength() {

		String temp = "";

		System.out.printf("문자열 입력: ");
		temp = scan.next();

		while (!temp.equals("exit")) { // 문자열은 클래스이므로 같으냐를 물을 때 '==' 사용할 수 없음 , == 연산자 : 값 == 값 비교
			System.out.println(temp + " 글자 개수: " + temp.length());

			System.out.printf("문자열 입력: ");
			temp = scan.next();
		}
	}

	public void printStringLength2() {

		String temp = "";

		while (true) { // 문자열은 클래스이므로 같으냐를 물을 때 '==' 사용할 수 없음 , == 연산자 : 값 == 값 비교

			System.out.printf("문자열 입력: ");
			temp = scan.next();

			if (temp.equals("exit")) {
				break; // exit 입력되면 반복을 강제 종료함
			}

			System.out.println(temp + " 글자 개수: " + temp.length());
		}
	}

	public void printStringLength3() {

		String temp = "";

		do {

			System.out.printf("문자열 입력: ");
			temp = scan.next();

			if (temp.equals("exit")) {
				break; // exit 입력되면 반복을 강제 종료함
			}

			System.out.println(temp + " 글자 개수: " + temp.length());
		} while (true);
	}

	/**
	 * continue 문 : 반복문 안에서만 사용할 수 있음, 반복할 내용을 중간 생략시킬 때 이용함 if(조건식) continue;
	 * 
	 * 에 : 1~100까지 정수들의 합을 구해서 출력 단, 5의 배수는 제외함
	 */
	public void testContinue() {

		int sum = 0;
		int su = 1;

		while (su < 101) {
			if (su % 5 == 0) {

				// 반복 내용 끝에 증감식 처리
				su++;
				continue; // 아래 내용을 실행하지 말고 다음 값으로 넘어가라는 구문
			}

			sum += su++;

		}

		System.out.println("5의 배수를 뺀 1 ~ 100가지의 합: " + sum);
	}

	public void testContinue2() {

		int sum = 0;
		int su = 1;

		for (su = 1; su < 101; su++) {
			if (su % 5 == 0) {

				continue; // 아래 내용을 실행하지 말고 다음 값으로 넘어가라는 구문
			}

			sum += su;
		}

		System.err.println("5의 배수를 뺀 1 ~ 100가지의 합: " + sum);
	}

	public void testContinue3() {

		int sum = 0;
		int su = 1;

		do {
			if (su % 5 == 0) {

				// 반복 내용 끝에 증감식 처리
				su++;
				continue; // 아래 내용을 실행하지 말고 다음 값으로 넘어가라는 구문
			}

			sum += su++;

		} while (su < 101);

		System.err.println("5의 배수를 뺀 1 ~ 100가지의 합: " + sum);
	}
}
