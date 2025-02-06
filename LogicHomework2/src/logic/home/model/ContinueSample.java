package logic.home.model;

import java.util.Scanner;

public class ContinueSample {

	private Scanner scanner = new Scanner(System.in);

	// 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기
	public void sumJumpThree() {

		int sum = 0;
		int su = 1;

		while (su < 101) {
			if (su % 3 == 0) {

				// 반복 내용 끝에 증감식 처리
				su++;
				continue; // 아래 내용을 실행하지 말고 다음 값으로 넘어가라는 구문
			}

			sum += su++;

		}

		System.out.println("3의 배수를 뺀 1 ~ 100가지의 합: " + sum);
	}

	// 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기
	public void rowColJump() {


		for (int i = 0; i < 3; i++) {
			int j = 0;
			while (j < 5) {

				if (i == 0 && j > 1) {
					j++;
					continue;
				}
				System.out.printf("*");
				j++;
			}
			System.out.println();
		}
	}

}
