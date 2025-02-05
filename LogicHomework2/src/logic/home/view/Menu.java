package logic.home.view;

import java.util.Scanner;
import logic.home.model.*;

public class Menu {

	private static Scanner sc = new Scanner(System.in);

	public static void mainMenu() {

		char loop = 'n';

		do {
			System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****\n" + "\n" + "1. 변수 테스트\n" + "2. 기본 자료형 테스트\n"
					+ "3. if문 테스트\n" + "4. switch문 테스트\n" + "5. for문 테스트\n" + "6. while문 테스트\n" + "7. do~while문 테스트\n"
					+ "8. break문 테스트\n" + "9. continue문 테스트\n" + "10. static 메소드 사용 테스트\n"
					+ "11. non-static 메소드 사용 테스트\n" + "12. 프로그램 종료\n");
			System.out.printf("메뉴 번호 입력: ");

			switch (sc.nextInt()) {
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

				if (ch == 'y' || ch == 'n') {
					loop = ch;
				} else {
					System.out.println("잘못입력하셨습니다.\n");
				}
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (loop == 'n');
	}

	/**
	 * 변수 테스트
	 */
	public static void subVarMenu() {

		VariableSample variableSample = new VariableSample();

		do {

			System.out.println("*** 변수 테스트 부메뉴 ***\n" + "\n" + "1. 내 신상정보 변수에 담아 출력하기\n" + "2. 사원정보를 키보드로 입력받아 출력하기\n"
					+ "3. 기본 자료형 변수의 초기값 확인하기\n" + "4. 이전 메뉴로 가기\n");
			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				variableSample.myProfile();
				break;
			case 2:
				variableSample.empInformation();
				break;
			case 3:
				variableSample.defaultValue();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");

			}

		} while (true);

	}

	/**
	 * 기본 자료형 테스트
	 */
	public static void subTypeMenu() {

		PrimitiveTypeSample primitiveTypeSample = new PrimitiveTypeSample();

		do {

			System.out.println("*** 기본자료형 테스트 부메뉴 ***\n" + "\n" + "	1. 기본자료형 메모리 할당크기 확인하기\n"
					+ "2. 기본자료형 값의 최소값, 최대값 출력하기\n" + "3. 기본자료형 비트갯수 확인하기\n" + "4. 이전 메뉴로 가기\n");
			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				primitiveTypeSample.typeSize();
				break;
			case 2:
				primitiveTypeSample.minMaxValue();
				break;
			case 3:
				primitiveTypeSample.bitSize();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");

			}

		} while (true);
	}

	/**
	 * if문 테스트
	 */
	public static void subIfMenu() {

		IfSample ifSample = new IfSample();

		do {

			System.out.println("*** if문 테스트 부메뉴 ***\n" + "\n" + "1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기\n"
					+ "2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기\n" + "3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기\n"
					+ "4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기\n" + "5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기\n"
					+ "6. 점수를 입력받아, 학점 확인하기\n" + "7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기\n"
					+ "8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기\n" + "9. 이전 메뉴로 가기\n");
			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				ifSample.maxNumber();
				break;
			case 2:
				ifSample.minNumber();
				break;
			case 3:
				ifSample.threeMaxMin();
				break;
			case 4:
				ifSample.checkEven();
				break;
			case 5:
				ifSample.isPassFail();
				break;
			case 6:
				ifSample.scoreGrade();
				break;
			case 7:
				ifSample.checkPlusMinusZero();
				break;
			case 8:
				ifSample.whatCaracter();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);
	}

	/**
	 * switch문 테스트
	 */
	public static void subSwitchMenu() {

		SwitchSample switchSample = new SwitchSample();

		do {

			System.out.println("*** switch문 테스트 부메뉴 ***\n" + "\n" + "1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기\n"
					+ "2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기\n" + "3. 이전 메뉴로 가기\n");
			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				switchSample.calculator();
				break;
			case 2:
				switchSample.fruitPrice();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);
	}

	/**
	 * for문 테스트
	 */
	public static void subForMenu() {

		ForSample forSample = new ForSample();

		do {

			System.out.println("*** for문 테스트 부메뉴 ***\n" + "\n" + "1. 1~10까지 정수들의 합계 구하기\n" + "2. 1~100사이의 짝수들의 합게 구하기\n"
					+ "3. 정수 하나 입력받아, 그 수의 구구단 출력하기\n" + "4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기\n"
					+ "5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기\n" + "6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기\n"
					+ "7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)\n" + "8. 구구단 2단부터 9단까지 출력하기\n"
					+ "9. 이전 메뉴로 가기\n");
			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				forSample.sum1To10();
				break;
			case 2:
				forSample.sumEven1To100();
				break;
			case 3:
				forSample.oneGugudan();
				break;
			case 4:
				forSample.sumMinToMax();
				break;
			case 5:
				forSample.printStar();
				break;
			case 6:
				forSample.printNumberStar();
				break;
			case 7:
				forSample.printTriangleStar();
				break;
			case 8:
				forSample.guguDan();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);
	}

	/**
	 * while문 테스트
	 */
	public static void subWhileMenu() {

		WhileSample whileSample = new WhileSample();

		do {

			System.out.println("*** while문 테스트 부메뉴 ***\n" + "\n" + "1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)\n"
					+ "2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)\n" + "3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기\n"
					+ "4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기\n" + "5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기\n"
					+ "6. 이전 메뉴로 가기\n");

			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				whileSample.printUniCode();
				break;
			case 2:
				whileSample.sum1To100();
				break;
			case 3:
				whileSample.numberGame();
				break;
			case 4:
				whileSample.countCharacter();
				break;
			case 5:
				whileSample.countInChar();
				break;
			case 6:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);
	}

	/**
	 * do~while문 테스트
	 */
	public static void subDoWhileMenu() {

		DoWhileSample doWhileSample = new DoWhileSample();

		do {

			System.out.println("*** do~while문 테스트 부메뉴 ***\n" + "\n" + "1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기\n"
					+ "2. 버거킹 메뉴 주문 테스트\n" + "3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기\n" + "4. 이전 메뉴로 가기\n");

			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				doWhileSample.addDashToken();
				break;
			case 2:
				doWhileSample.burgerKingMenu();
				break;
			case 3:
				doWhileSample.isStringAlphabet();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);
	}

	/**
	 * break문 테스트
	 */
	public static void subBreakMenu() {

		BreakSample breakSample = new BreakSample();

		do {

			System.out.println("*** break문 테스트 부메뉴 ***\n" + "\n" + "1. 1~100까지 정수들의 합계 출력하기(break문 사용)\r\n"
					+ "2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)\n" + "3. 이전 메뉴로 가기\n");

			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				breakSample.sumBreak();
				break;
			case 2:
				breakSample.guguDanBreak();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);
	}

	/**
	 * continue문 테스트
	 */
	public static void subContinueMenu() {

		ContinueSample continueSample = new ContinueSample();

		do {

			System.out.println("*** continue문 테스트 부메뉴 ***\n" + "\n" + "1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기\n"
					+ "2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기\n" + "3. 이전 메뉴로 가기\n");

			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				continueSample.sumJumpThree();
				break;
			case 2:
				continueSample.rowColJump();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);

	}

	/**
	 * static 메소드 사용 테스트
	 */
	public static void subStaticMethodMenu() {

		StaticMethodSample staticMethodSample = new StaticMethodSample();

		do {

			System.out
					.println("*** static 메소드 사용 테스트 부메뉴 ***\n" + "\n" + "1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력\n"
							+ "2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기\n"
							+ "3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기\n" + "4. 이전 메뉴로 가기\n");

			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				staticMethodSample.testMathRandom();
				break;
			case 2:
				staticMethodSample.testMathAbs();
				break;
			case 3:
				staticMethodSample.testMathMax();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);

	}

	/**
	 * non-static 메소드 사용 테스트
	 */
	public static void subNonStaticMethodMenu() {

		NonStaticMethodSample nonStaticMethodSample = new NonStaticMethodSample();

		do {

			System.out.println("*** non-static 메소드 사용 테스트 부메뉴 ***\n" + "\n"
					+ "1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\n" + "2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기\n"
					+ "3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기\n" + "4. 이전 메뉴로 가기\n");

			System.out.printf("메뉴 선택: ");

			switch (sc.nextInt()) {
			case 1:
				nonStaticMethodSample.testScanner();
				break;
			case 2:
				nonStaticMethodSample.testDate();
				break;
			case 3:
				nonStaticMethodSample.testRandom();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력 바랍니다.\n");
			}

		} while (true);

	}

}
