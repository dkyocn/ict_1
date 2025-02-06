package array.algorithm;

import java.util.Random;

/**
 * 배열 처리용 알고리즘 : 
 * 중복값 제거, 오름차순 정렬 로또 번호 1 ~ 45까지의 정수 6개 발생해서 배열에 저장 처리 
 * 단, 같은 번호가 중복 기록되면 안됨 배열에 저장된 값들을 오름차순정렬 처리하여 출력 
 * 오름차순정렬(ascending sort) : 작은 값에서 큰값으로 배치하는 것(1234순, abcd순, 가나다라순)
 */
public class TestLotto {
	// main() 메소드를 가진 클래스 안에 기능 처리를 위한 메서드 추가 작성 가능

	/*
	 *  배열의 주소를 전달받아서, 주소 위치의 배열 값들을 하나씩 출력 처리하는 메서드
	 *  전달 값 받은 매개변수는 자료형과 개수가 반드시 일치해야 함
	 *  int[] 주소 전달 => 매개변수 int[] 주소저장변수
	 */
	public void printArray(int[] arr) {
		System.out.println("ar이 전달받은 배열 공간의 주소: " + arr.hashCode());

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 전달받은 배열 공간의 주소 위치에 1 ~ 45사이의 중복되지 않은 6개의 정수를 기록 처리하는 메서드
	 */
	public void inputNumber(int[] arr) {

		Random random = new Random();

		System.out.println("ar이 전달받은 배열 공간의 주소: " + arr.hashCode());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;

			// 중복검사 처리 : 기존 기록된 값들과 새로 기록된 값을 비교함
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--; // 이전 인덱스로 되돌려 다시 실행
					break; // 비교 for 문(안쪽 for 문을 종료)
				}
			}
		}

	}

	public void sortAscending(int[] arr) {

		// select sort 방식의 오름차순 정력(선택정렬)
		for(int step = 0; step < arr.length -1; step++) {
			for(int i = step+1; i<arr.length; i++) {
				if(arr[step] > arr[i]) {
					int temp = arr[step];
					arr[step] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TestLotto 클래스 실행 테스트용

		TestLotto testLotto = new TestLotto();

		int[] lotto = new int[6];
		System.out.println("lotto 가 가진 배열 공간의 주소: " + lotto.hashCode());
		testLotto.printArray(lotto); // printArray 매서드를 실행하면서, 메서드 쪽으로 int[]공간의 주소를 전달

		testLotto.inputNumber(lotto);
		testLotto.printArray(lotto);

		testLotto.sortAscending(lotto);
		testLotto.printArray(lotto);
	}

}
