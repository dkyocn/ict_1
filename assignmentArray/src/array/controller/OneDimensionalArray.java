package array.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class OneDimensionalArray {
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * 최대 값과 최소 값 찾기
	 * 
	 * 배열 크기 입력 받아 정수 배열 공간 할당
	 * 각 배열 공간에 저장할 정수 입력받은 후 최대 값과 최소값 찾아서 출력
	 */
	public void findMaxMin() {
		
		
		int arrayLength = 0;
		
		int max = 0;
		int min = 0;
		
		
		System.out.printf("배열 크기: ");
		arrayLength = scanner.nextInt();
		
		int[] arr = new int[arrayLength];
		
		System.out.printf(arrayLength+"개의 정수를 입력하세요: ");
		
		for(int i = 0; i<arrayLength; i++) {
			arr[i] = scanner.nextInt();
		}
		
//		for(int i = 0; i<arr.length; i++) {
//			
//			if(i ==  0) {
//				max = arr[0];
//				min = arr[0];
//			}
//			
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//			
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
		
		max = Arrays.stream(arr).max().getAsInt();
		min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
	}

	/**
	 * 평균 계산 및 이상치 찾기
	 * 
	 * 배열 크기 입력 받아 실수 배열 공간 할당
	 * 배열에 저장할 실수 입력받은 후 평균 계산하고 평균보다 큰 값만 출력
	 */
	public void  findAverageGreater() {
		
		int arrayLength = 0;
		
		double sum = 0;
		double avg = 0.0;
		String result = "평균보다 큰 값: ";
		
		
		System.out.printf("배열 크기: ");
		arrayLength = scanner.nextInt();
		
		double[] arr = new double[arrayLength];
		
		System.out.printf(arrayLength+"개의 실수를 입력하세요(소수 첫째자리까지): ");
		
		for(int i = 0; i<arrayLength; i++) {
			arr[i] = scanner.nextDouble();
			sum += arr[i];
		}
		
		avg = sum / 3.0;

		// for 문 사용	
//		for(int i = 0; i<arr.length; i++) {
//			
//			if(arr[i] > avg) {
//				result += arr[i]+" ";
//			}
//		}
		
		
		// for each 문 사용한 경우 : 객체배열, 컬렉션 반복 처리에 주로 사용함
		for (double num : arr) { // for(자료형 변수: 배열) : 자동으로 인덱스 순서대로 값을 꺼내어 앞에 변수에 저장
			if(num > avg) { // 값을 저장한 변수를 for 문 안에서 사용
				result += num+" ";
			}
		}
		
		System.out.println(result);
		
	}
	
	/**
	 * 중복 제거하기
	 * 
	 * 배열 크기 입력 받아 정수 배열 공간 할당
	 * 배열에 저장할 정수 입력받은 후 중복 제거한 배열 출력
	 */
	public void removeDuplicate() {
		
		int arrLength = 0;
		
		
		System.out.printf("배열 크기: ");
		arrLength = scanner.nextInt();
		
		int[] arr = new int[arrLength];
		
		System.out.printf(arrLength+"개의 정수를 입력하세요: ");
		
		for(int i = 0; i<arrLength; i++) {
			arr[i] = scanner.nextInt();
		}
		
// 직접 연산 처리		
//		Arrays.sort(arr); // 정렬
//		
//		for(int i = 1; i<arr.length; i++) {
//			
//			if( i == 1) {
//				
//			}
//			
//			if(array[i-1] != arr[i]) {
//				array[i] = arr[i];
//			}
//		}
		
		HashSet<Integer> integers = new HashSet<>();
		
		for(int num : arr) {
			integers.add(num);
		}
		
		System.out.println("중복 제거 결과: "+integers);
	}
}
