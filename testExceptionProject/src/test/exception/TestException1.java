package test.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TestException1 {

	public static void main(String[] a) throws IOException {

		//		new TestException1().testA();

		TestException1 exception1 = new TestException1();
		int[][] arr = exception1.solution(16);

		for (int[] test : arr) {
			for (int i : test) {
				System.out.printf(i + " ");
			}
			System.out.println();
		}

	}

	public void testA() throws IOException {
		testB();
	}

	public void testB() throws IOException {
		testC();
	}

	public void testC() throws IOException {
		/*
		 *  자바가 제공하는 클래스의 생성자나 메서드 사용 시 반드시 예외 처리를 해야되는 경우가 있음
		 *  생성자나 메서드 선언부 참조 : 접근제한자 [static] 반환자료형 메서드명([자료형 매개변수,...]) throws XXX.Exception
		 */

		FileWriter fileWriter = new FileWriter("sample.txt");
	}

	public int[][] solution(int n) {
		int[][] answer = {};
		answer = new int[n][n];
		int i = 0;
		int j = 0;
		int loop = 1;
		int count = 0;
		do {
			i = count;
			j = count;

			for (j = count; j < (n - count); j++) {
				if (loop > (n * n) || answer[i][j] != 0) {
					break;
				}
				answer[i][j] = loop;
				loop++;
			}
			j--;

			for (i = count + 1; i < (n - count); i++) {
				if (loop > (n * n) || answer[i][j] != 0) {
					break;
				}
				answer[i][j] = loop;
				loop++;
			}
			i--;

			for (j = (n - count) - 2; j >= count; j--) {
				if (loop > (n * n) || answer[i][j] != 0) {
					break;
				}
				answer[i][j] = loop;
				loop++;
			}
			j++;

			for (i = (n - count) - 2; i >= count; i--) {
				if (loop > (n * n) || answer[i][j] != 0) {
					break;
				}
				answer[i][j] = loop;
				loop++;
			}
			i++;

			count++;

			if (loop >= (n * n)) {
				if (n % 2 != 0) {
					answer[count][count] = (n * n);
				}

				break;
			}
		} while (true);
		return answer;
	}
}
