package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();

	public static final int SIZE = 10;

	public void mainMenu() {

		do {
			System.out.println("***** 회원 관리 프로그램 *****\n"
				+ "\n"
				+ "1. 새 회원 등록		\n"
				+ "2. 회원 조회		\n"
				+ "3. 회원 정보 수정	\n"
				+ "4. 회원 정보 정렬	\n"
				+ "5. 회원 삭제		\n"
				+ "6. 모두 출력\n"
				+ "9. 끝내기");
			System.out.printf("메뉴 선택: ");
			int num = sc.nextInt();

			switch (num) {
				case 1:
					mManager.memberInput();
					break;
				case 2:
					searchMenu();
					break;
				case 3:
					modifyMenu();
					break;
				case 4:
					sortMenu();
					break;
				case 5:
					mManager.deleteMember();
					break;
				case 6:
					mManager.printAllMember();
					break;
				case 9:
					System.out.printf("정말 끝내시겠습니까?(Y/N) ");
					if (sc.next().toUpperCase().charAt(0) == 'Y') {
						return;
					}
				default:
					System.out.println("잘못된 입력입니다. 다시 입력바랍니다.");
			}

		} while (true);
	}

	// 회원 조회 - equals 사용
	public void searchMenu() {

		do {

			System.out.println("***** 회원 정보 검색 메뉴 *****\n"
				+ "\n"
				+ "1. 아이디로 검색\n"
				+ "2. 이름으로 검색\n"
				+ "3. 이메일로 검색\n"
				+ "9. 이전 메뉴로 가기");
			System.out.printf("메뉴 선택: ");
			int num = sc.nextInt();

			switch (num) {
				case 1:
					mManager.memberInput();
					break;
				case 2:
					searchMenu();
					break;
				case 3:
					modifyMenu();
					break;
				case 4:
					sortMenu();
					break;
				case 5:
					mManager.deleteMember();
					break;
				case 6:
					mManager.printAllMember();
					break;
				case 9:
					System.out.printf("정말 끝내시겠습니까?(Y/N) ");
					if (sc.next().toUpperCase().charAt(0) == 'Y') {
						return;
					}
				default:
					System.out.println("잘못된 입력입니다. 다시 입력바랍니다.");
			}

		} while (true);

	}

	// 회원 정보 수정 - setter사용
	public void sortMenu() {}

	// 회원 정보 정렬 - compareto 사용
	public void modifyMenu() {}

}
