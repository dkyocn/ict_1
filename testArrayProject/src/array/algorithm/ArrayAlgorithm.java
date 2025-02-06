package array.algorithm;

import java.util.Random;

public class ArrayAlgorithm {

	public void inputData(int[] arr) {
		// 1 ~ 100 사이의 랜덤 정수를 배열 각 방에 기록
		for(int i = 0; i <arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}

	// 배열 공간의 값 출력 확인하는 메서드
	public void printArray(int[] arr) {
		
		for(int i = 0; i <arr.length; i++) {
			System.out.printf(arr[i]+ " "); // 반복 실행할 구문이 1개이면 {} 블럭 생략 가
		}
		System.out.println();
		
	}

	// 배열 공간의 값 섞기 알고리즘
	public void shuffle(int[] arr) {
		
		Random random = new Random();
		
		for(int i =0; i <arr.length; i++) {
			// 값 바꿀 인덱스 랜덤으로 추출
			int j = random.nextInt(arr.length);
			
			// swap 공식 : i 번째와 j 번째 방의 값을 바꿈
			swap(arr,i,j);
		}
		
	}
	
	// 배열 공간 안의 두 변수 값을 교환하는 알고리즘
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*
	 *  값을 순서대로 배치하는 것 : 정렬(sort)
	 *  정렬의 결과는 오름차순(asc) 정렬, 내림차순(des) 정렬 2가지
	 *  오름차순 정렬: 작은 값부터 큰 값 순으로 배치
	 *  내림차순 정렬: 큰 값에서 작은 값 순으로 배치
	 *  정렬 방식 select, bubble, insert, quick, mearge, radix, dual-pivot
	 *  실제 코드로는 여러 방식을 섞어서 하나의 정렬 알고리즘을
	 */
	
	// 선택 정렬(selection) 방식으로 오름차순 정렬 메서드
	public void sortAscending(int[] arr) {
		
		for(int step = 0; step < arr.length; step++) { // 각 단계별 반복, 값을 정할 기준 위치
			for(int i = step+ 1; i<arr.length; i++) { // 값을 비교하는 반복
				if(arr[step]>arr[i]) { // 앞자리의 값이 크면 두 값을 교환
					swap(arr, step, i); // 작은 값을 계속 앞으로 보내는 방식
				}
				
			}
		}
	}
	
	// 선택 정렬(selection) 방식으로 내림차순 정렬 메서드
	public void sortDescending(int[] arr) {
		
		for(int step = 0; step < arr.length; step++) { // 각 단계별 반복, 값을 정할 기준 위치
			for(int i = step+ 1; i<arr.length; i++) { // 값을 비교하는 반복
				if(arr[step]<arr[i]) { // 뒷자리의 값이 크면 두 값을 교환
					swap(arr, step, i); // 작은 값을 계속 앞으로 보내는 방식
				}
				
			}
		}
	}
	

}
