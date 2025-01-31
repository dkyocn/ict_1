package logic.view;

import java.util.Scanner;

import logic.controller.Function;

public class Menu {

	/**
	 * 게임 메뉴 출력 메서드
	 */
	public static void displayMenu() {
		
		Menu menu = new Menu();
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		
		do {
			System.out.println("\n*** 지역변수/연산자/제어문 연습 프로그램 ***");
			System.out.println("\n1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 난수까지의 합게 구하기");
			System.out.println("6. 구구단");
			System.out.println("7. 주사위 숫자 알아맞추기 게임");
			System.out.println("8. 프로그램 종료");
			System.out.printf("메뉴 번호 입력: ");
			// 선택한 게임 입력
			loop = menu.choiceGame(scan.nextInt());
			
		} while(loop);
	}
	
	/*
	 * 게임 선택 메서드
	 */
	private boolean choiceGame(int num) {
		
		Function function = new Function();
		
		boolean exit = true;
		
		switch(num) {
		case 1:
			function.calculator();
			break;
		case 2: 
			function.totalCalculator();
			break;
		case 3: 
			function.profile();
			break;
		case 4: 
			function.sungjuk();
			break;
		case 5: 
			function.sumRandomNumber();
			break;
		case 6:
			function.continueGugudan();
			break;
		case 7:
			function.shutNumber();
			break;
		case 8:
			exit = false;
			break;
		}
		
		return exit;
	}
}
