package com.loop.test;

import java.util.Scanner;

import com.loop.ForWhile;
import com.loop.LogicSample;

import home.menu.CashBugerKing;

public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		
		Scanner scanner = new  Scanner(System.in);
		
		int menu = 0;
		boolean loop = true;
		
		do {
			System.out.println("\n******** 반복문 실습 실행 테스트 ********\n");
			System.out.println("1. 문제1");
			System.out.println("2. 문제2");
			System.out.println("3. 문제3");
			System.out.println("4. 문제4");
			System.out.println("5. 문제5");
			System.out.println("6. 문제6");
			System.out.println("7. 문제7");
			System.out.println("8. 문제8");
			System.out.println("9. 문제9");
			System.out.println("10. 문제10");
			System.out.println("11. 문제11");
			System.out.println("12. 프로그램 끝내기\n");
			System.out.printf("메뉴 번호 선택: ");
			menu = scanner.nextInt();
	
			loop = main.selectMenu(menu);
			
		} while(loop);
	}
	
	public boolean selectMenu(int menu) {
		
		ForWhile forWhile = new ForWhile();
		CashBugerKing bugerKing = new CashBugerKing();
		LogicSample logicSample = new LogicSample();
		
		boolean excape = true;
		
		switch(menu) {
		case 1:
			forWhile.printStar1();
			excape = true;
			break;
		case 2:
			forWhile.printStar2();
			excape = true;
			break;
		case 3:
			bugerKing.selectMenu();
			excape = true;
			break;
		case 4:
			forWhile.countInputCharacter();
			excape = true;
			break;
		case 5:
			logicSample.inputProfile();
			excape = true;
			break;
		case 6:
			logicSample.inputScore();
			excape = true;
			break;
		case 7:
			logicSample.calcGrade();
			excape = true;
			break;
		case 8:
			logicSample.multiLogic();
			excape = true;
			break;
		case 9:
			logicSample.sumNumbers();
			excape = true;
			break;
		case 10:
			logicSample.countChar();
			excape = true;
			break;
		case 11:
			logicSample.inChar();
			excape = true;
			break;
		case 12:
			System.out.println("반복문 실습 프로그램을 종료합니다.");
			excape = false;
			break;
		default:
			System.out.println("없는 번호 입니다. 다시 입력해 주세요.");
			excape = true;
			break;
		}
		
		return excape;
	}

}
