package array.controller;

import java.util.Scanner;

public class TwoDimensionalArray {
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * 행과 열의 합 구하기
	 * 
	 * 행과 열의 크기를 입력받은 후 2차원 정수배열 생성
	 * 배열에 저장할 정수 입력받아 각 행과 각 열의 합 출력
	 */
	public void sumRowAndColumn() {
		
		int line = 0;
		int row = 0;
		
		String lineResult ="각 행의 합: ";
		String rowResult ="각 열의 합: ";
		
		System.out.printf("2차원 배열 행 크기: ");
		line = scanner.nextInt();
		System.out.printf("2차원 배열 열 크기: ");
		row = scanner.nextInt();
		
		int[][] arr = new int[line+1][row+1];
		
		// 입력
		for(int i =0; i<arr.length-1; i++) {
			int sum = 0;
			System.out.printf(i+"번째 행에 기록할 "+(arr[i].length-1)+"개의 정수를 입력하세요: ");
			
			for(int j = 0; j<arr[i].length-1; j++) {
				arr[i][j] = scanner.nextInt();
				sum += arr[i][j];
			}
			
			arr[i][arr[i].length-1] = sum; 
		}
		
		// 열 값 합계
		for(int i =0; i<arr.length-1; i++) {
			int sum = 0;
			for(int j = 0; j<arr[i].length-1; j++) {
				sum += arr[j][i];
			}
			
			arr[arr.length-1][i] = sum; 
		}
		
		// 출력
		for(int i = 0; i<arr.length-1; i++) {
			
			lineResult += arr[i][arr.length-1]+" ";
			
			if( i == arr.length-2) {
				for(int j = 0; j<arr.length-1; j++) {
					rowResult += arr[2][j]+" ";
				}
			}
		}
		
		System.out.println(lineResult);
		System.out.println(rowResult);
		
	}
	
	/**
	 * 
	 */
	public void computeDiagonalSum() {
		
		int line = 0;
		int mainLine = 0;
		int line1 = 0;
		
		System.out.printf("정방배열 크기: ");
		line = scanner.nextInt();
	
		int[][] arr = new int[line][line];
		
		for(int i =0; i<arr.length; i++) {
			int sum = 0;
			System.out.printf(i+"번째 행에 기록할 "+arr.length+"개의 정수를 입력하세요: ");
			
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
				
			}
			
		}
		
		for(int i =0; i< line; i++) {
			mainLine += arr[i][i];
			line1 += arr[i][line - i -1];
		}
		
		System.out.println("주대각선 합: "+mainLine);
		System.out.println("부대각선 합: "+line1);
		
	}
	
	/**
	 * 행렬의 전치 구하기
	 * 
	 * 
	 */
	public void transposeOfMatrix() {
		
		int line = 0;
		int row = 0;
		
		String lineResult ="각 행의 합: ";
		String rowResult ="각 열의 합: ";
		
		System.out.printf("2차원 배열 행 크기: ");
		line = scanner.nextInt();
		System.out.printf("2차원 배열 열 크기: ");
		row = scanner.nextInt();
		
		int[][] arr = new int[line][row];
		int[][] brr = new int[row][line];
		
		// 입력
		for(int i =0; i<arr.length; i++) {
			int sum = 0;
			System.out.printf(i+"번째 행에 기록할 "+(arr[i].length)+"개의 정수를 입력하세요: ");
			
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		// brr
		for(int i =0; i<arr.length; i++) {
			
			for(int j = 0; j<arr[i].length; j++) {
				brr[j][i] = arr[i][j];
			}
		}
		
		System.out.println("[전치 행렬]");
		for(int i =0; i<brr.length; i++) {
			
			for(int j = 0; j<brr[i].length; j++) {
				System.out.printf(brr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
