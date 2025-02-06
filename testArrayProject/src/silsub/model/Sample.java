package silsub.model;

import java.util.Random;
import java.util.Scanner;

public class Sample {

	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();

	/**
	 * 
	 */
	public void munjae1() {

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = random.nextInt(100) + 1;
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				
				if (j == arr[i].length - 2) {
					arr[3][3] += arr[i][3];
				}
				
				if (i == arr.length - 2) {
					arr[3][3] += arr[3][j];
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void munjae2() {

		int[][] arr = new int[3][];
		int num = 0;

		System.out.printf("첫번째 열 개수: ");
		arr[0] = new int[scanner.nextInt()];
		System.out.printf("두번째 열 개수: ");
		arr[1] = new int[scanner.nextInt()];
		System.out.printf("첫번째 열 개수: ");
		arr[2] = new int[scanner.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(100) + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];
			}

			if (sum % 5 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public void munjae3() {

		int[][] arr = new int[7][7];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("학생 번호: ");
			arr[i][0] = scanner.nextInt();
			System.out.printf("국어 점수: ");
			arr[i][1] = scanner.nextInt();
			System.out.printf("영어 점수: ");
			arr[i][2] = scanner.nextInt();
			System.out.printf("수학 점수: ");
			arr[i][3] = scanner.nextInt();

			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
			arr[i][5] = arr[i][4] / 3;
			arr[i][6] = 1;

		}

		// 등수 loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][5] < arr[j][5]) {
					arr[i][6]++;
				}
			}
		}

		// 출력 loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
