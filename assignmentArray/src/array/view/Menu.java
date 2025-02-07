package array.view;

import java.util.Scanner;

import array.controller.OneDimensionalArray;
import array.controller.TwoDimensionalArray;

public class Menu {
	
	public static  final Scanner scanner = new Scanner(System.in);
	public static final	OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
	public static final TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
	
	public static void display() {
		
		
		
		int num = 0;
		char loop = 'n';
		
		do {
			
			System.out.println("***** 기본자료형 배열 과제 테스트 프로그램 *****\n"
					+ "\n"
					+ "[기본자료형 1차원배열] --------------\n"
					+ "1. 최대값과 최소값 찾기\n"
					+ "2. 평균 계산 및 이상치 찾기\n"
					+ "3. 중복 제거하기\n"
					+ "[기본자료형 2차원배열] -------------\n"
					+ "4. 행과 열의 합 구하기\n"
					+ "5. 대각선 원소 합 구하기\n"
					+ "6. 행렬의 전치 구하기\n"
					+ "7. 프로그램 끝내기\n");
			System.out.printf("번호 선택: ");
			num = scanner.nextInt();
			
			loop = switchMenu(num);
			
			
		} while(loop == 'n');
		
	}
	
	private static char switchMenu(int menuNum) {

		
		char end = 'n';
		
		switch(menuNum) {
		case 1:
			oneDimensionalArray.findMaxMin();
			break;
		case 2:
			oneDimensionalArray.findAverageGreater();
			break;
		case 3:
			oneDimensionalArray.removeDuplicate();
			break;
		case 4:
			twoDimensionalArray.sumRowAndColumn();
			break;
		case 5:
			twoDimensionalArray.computeDiagonalSum();
			break;
		case 6:
			twoDimensionalArray.transposeOfMatrix();
			break;
		case 7:
			System.out.printf("정말로 종료하시겠습니까?(예:y/아니오:n) : ");
			char ch = scanner.next().toLowerCase().charAt(0);

			if (ch == 'y' || ch == 'n') {
				end = ch;
			} else {
				System.out.println("잘못입력하셨습니다.\n");
			}
			break;
		}
		
		return end;
	}

}
