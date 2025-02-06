package twodimension.array;

public class TwoDimensionArraySample {

	public void sample1() {
		// 1차원 배열: 자료형이 같은 변수들의 묶음, 선언과 할당시에 배열기호 [] 1개 사용됨
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] brr = new int[] { 11, 22, 33, 44, 55 };
		int[] crr = new int[] { 99, 88, 77, 66, 55 };

		// 출력 확인
		System.out.println("arr.length : " + arr.length);
		System.out.println("brr.length : " + brr.length);
		System.out.println("crr.length : " + crr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < brr.length; i++) {
			System.out.printf(brr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < crr.length; i++) {
			System.out.printf(crr[i] + " ");
		}
		System.out.println();

		// 2차원 배열: 자료형이 같은 1차원 배열들의 묶음, 선언과 할당 시에 배열 기호 [][] 2개 사용됨
		int[][] tar = new int[3][5]; // new 자료형[행 개수][열 개수]
		/*
		 *  행 개수 : 1차원 배열 개수
		 *  열 개수 : 각 1차원 배열이 가진 값 개수
		 *  각 1차원 배열들의 값 개수가 동일하면, 정방배열이라고 함
		 *  각 1차원 배열들의 값 개수가 다르면, 가변배열이라고 함 => int[][] tar = new int[3][]; 선언 할당함
		 */

		tar[0] = arr; // tar 이 참조하는 0행에 arr이 가진 주소를 대입
		tar[1] = brr; // tar 이 참조하는 1행에 brr이 가진 주소를 대입
		tar[2] = crr; // tar 이 참조하는 2행에 crr이 가진 주소를 대입

		System.out.println("tar length: " + tar.length); // 행 개수 : 3
		System.out.println("tar[0] length: " + tar[0].length); // 열 개수 : 3

		// 2차원배열은 2중 for문을 사용함
		for (int i = 0; i < tar.length; i++) { // 행 반봅 : 3행이므로 3번 반복
			System.out.println("tar[" + i + "] 행의 열 개수: " + tar[i].length);
			for (int j = 0; j < tar[i].length; j++) {
				System.out.println(tar[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void sample2() {
		// 2차원 배열 초기화
		int[][] tar = { { 1, 2, 3, 4, 5, }, { 10, 20, 30, 40, 50 }, { 11, 22, 33, 44, 55 } };

		// 2차원 배열: 행과 열로 구성됨, 매트릭스(Matrix) 라고도 함
		// 3 X 5 행렬
		System.out.println("tar.length: " + tar.length + "행 개수");
		// 각 행별 열 개수가 같은 2차원 배열: 정변배열 이라고 함
		System.out.println("0행의 열(값) 개수: " + tar[0].length);
		System.out.println("1행의 열(값) 개수: " + tar[1].length);
		System.out.println("2행의 열(값) 개수: " + tar[2].length);

		// 2차원 배열에서 개별 값에 접근은 배열레퍼런스[행 인덱스][열 인덱스]로 표기함
		for (int i = 0; i < tar.length; i++) {
			for (int j = 0; j < tar[i].length; j++) {
				System.out.printf(tar[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void sample3() {
		// 2차원 배열 초기화
		int[][] tar = { { 1, 2, 3, 4, }, { 10, 20, 30, 40, 50 }, { 11, 22, 33 } };

		// 2차원 배열: 행과 열로 구성됨, 매트릭스(Matrix) 라고도 함
		System.out.println("tar.length: " + tar.length + "행 개수");
		// 각 행별 열 개수가 다른 2차원 배열: 가변배열 이라고 함
		System.out.println("0행의 열(값) 개수: " + tar[0].length);
		System.out.println("1행의 열(값) 개수: " + tar[1].length);
		System.out.println("2행의 열(값) 개수: " + tar[2].length);

		// 2차원 배열에서 개별 값에 접근은 배열레퍼런스[행 인덱스][열 인덱스]로 표기함
		for (int i = 0; i < tar.length; i++) {
			for (int j = 0; j < tar[i].length; j++) {
				System.out.printf(tar[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void sample4() {
		// 정변 배열: 2차원 배열에서 각 행렬 값(열) 개수가 동일한 경우
		int[][] tar; // 배열 선언 : 주소저장용 레퍼런스변수 만들기
		// 배열 생성 : 배열 공간 힙 메모리에 할당하고 주소 저장
		tar = new int[3][]; // 배열 생성 시에 열 개수 생략 가능함, 행 개수는 생략 못함
		// 2차원 배열 생성 시 행만 할당한 경우임 : 1차원 배열들의 주소 저장할 배열 레퍼런스변수 3개를 배열로 할당한 것임(주소 배열)

		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "번째 행(레퍼런스방 ): " + tar[i]);
		}

		// 각 행 변수(1차원 배열 주소 저장용 배열 레퍼런스변수)에 1차원 배열 할당하고 발생한 주소 기록 저장함
		tar[0] = new int[5];
		tar[1] = new int[5];
		tar[2] = new int[5];
		
		// 정변배열은 한번에 생성해도 됨
		// int[][] tar = new int[3][5]

		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "번째 행(레퍼런스방 ): " + tar[i].hashCode());
		}

		// 값 접근: 배열명[행 인덱스][열 인덱스]
		for (int i = 0; i < tar.length; i++) {
			for (int j = 0; j < tar[i].length; j++) {
				System.out.printf(tar[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void sample5() {
		// 정변 배열: 2차원 배열에서 각 행렬 값(열) 개수가 동일한 경우
		int[][] tar; // 배열 선언 : 주소저장용 레퍼런스변수 만들기
		// 배열 생성 : 배열 공간 힙 메모리에 할당하고 주소 저장
		tar = new int[3][]; // 배열 생성 시에 열 개수 생략 가능함, 행 개수는 생략 못함
		// 2차원 배열 생성 시 행만 할당한 경우임 : 1차원 배열들의 주소 저장할 배열 레퍼런스변수 3개를 배열로 할당한 것임(주소 배열)

		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "번째 행(레퍼런스방 ): " + tar[i]);
		}

		// 각 행 변수(1차원 배열 주소 저장용 배열 레퍼런스변수)에 1차원 배열 할당하고 발생한 주소 기록 저장함
		tar[0] = new int[4];
		tar[1] = new int[7];
		tar[2] = new int[5];
	
		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "번째 행(레퍼런스방 ): " + tar[i].hashCode());
		}

		// 값 접근: 배열명[행 인덱스][열 인덱스]
		for (int i = 0; i < tar.length; i++) {
			for (int j = 0; j < tar[i].length; j++) {
				System.out.printf(tar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
