package logic.home.view;

import java.util.Scanner;
import logic.home.model.*;

public class Menu {
	
	private static Scanner sc = new Scanner(System.in); 

	public static void mainMenu() {
		
		char loop = 'n';
		
		do {
			System.out.println("	***** 프로그래밍 기본 기능 테스트 프로그램 *****\r\n"
					+ "\r\n"
					+ "		1. 변수 테스트\r\n"
					+ "		2. 기본 자료형 테스트\r\n"
					+ "		3. if문 테스트\r\n"
					+ "		4. switch문 테스트\r\n"
					+ "		5. for문 테스트\r\n"
					+ "		6. while문 테스트\r\n"
					+ "		7. do~while문 테스트\r\n"
					+ "		8. break문 테스트\r\n"
					+ "		9. continue문 테스트\r\n"
					+ "		10. static 메소드 사용 테스트\r\n"
					+ "		11. non-static 메소드 사용 테스트\r\n"
					+ "		12. 프로그램 종료\r\n");
			System.out.printf("메뉴 번호 입력: ");
			
			switch(sc.nextInt()) {
			case 1:
				subVarMenu();
				break;
			case 2:
				subTypeMenu();
				break;
			case 3:
				subIfMenu();
				break;
			case 4:
				subSwitchMenu();
				break;
			case 5:
				subForMenu();
				break;
			case 6:
				subWhileMenu();
				break;
			case 7:
				subDoWhileMenu();
				break;
			case 8:
				subBreakMenu();
				break;
			case 9:
				subContinueMenu();
				break;
			case 10:
				subStaticMethodMenu();
				break;
			case 11:
				subNonStaticMethodMenu();
				break;
			case 12:
				System.out.printf("정말로 종료하시겠습니까?(예:y/아니오:n) : ");
				char ch = sc.next().toLowerCase().charAt(0);
				if(ch == 'y' || ch == 'n') {
					loop = ch;
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
				break;
			default:
				
			}
			
		} while(loop == 'n');
	}

	public static void subVarMenu() {
	}

	public static void subTypeMenu() {
	}

	public static void subIfMenu() {
	}

	public static void subSwitchMenu() {
	}

	public static void subForMenu() {
	}

	public static void subWhileMenu() {
	}

	public static void subDoWhileMenu() {
	}

	public static void subBreakMenu() {
	}

	public static void subContinueMenu() {
	}

	public static void subStaticMethodMenu() {
	}

	public static void subNonStaticMethodMenu() {
	}

}
