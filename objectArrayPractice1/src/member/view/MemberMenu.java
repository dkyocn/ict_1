package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;
import member.model.dto.Member;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();

	public static final int SIZE = 10;

	Member[] members = new Member[SIZE];

	public void mainMenu() {

		do {
			System.out.printf("\n최대 등록 가능한 회훤 수는 %d명 입니다.", SIZE);
			System.out.printf("\n현재 등록된 회원수는 %d명 입니다.\n", mManager.getMemberCount());
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
					//					for (Member member : members) {
					//						if (member == null) {
					//							member = mManager.memberInput();
					//							break;
					//						}
					//					}

					for (int i = 0; i < members.length; i++) {
						if (members[i] == null) {
							members[i] = mManager.memberInput();
							break;
						}
					}
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
					mManager.deleteMember(members);
					break;
				case 6:
					mManager.printAllMember(members);
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
					System.out.printf("검색할 아이디 입력: ");
					mManager.printMember(members, mManager.searchMemberId(members, sc.next()));
					break;
				case 2:
					System.out.printf("검색할 이름 입력: ");
					mManager.printMember(members, mManager.searchMemberName(members, sc.next()));
					break;
				case 3:
					System.out.printf("검색할 이메일 입력: ");
					mManager.printMember(members, mManager.searchMemberEmail(members, sc.next()));
					break;
				case 9:
					System.out.printf("메인 메뉴로 화면 이동합니다. ");
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력바랍니다.");
			}

		} while (true);

	}

	// 회원 정보 정렬	compareto 사용
	public void sortMenu() {

		do {

			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****\n"
				+ "	\n"
				+ "1. 아이디 오름차순 정렬 출력\n"
				+ "2. 아이디 내림차순 정렬 출력\n"
				+ "3. 나이 오름차순 정렬 출력\n"
				+ "4. 나이 내림차순 정렬 출력\n"
				+ "5. 성별 내림차순 정렬 출력(남여순)\n"
				+ "9. 이전 메뉴로 가기");
			System.out.printf("메뉴 선택: ");
			int num = sc.nextInt();

			switch (num) {
				case 1:
					mManager.sortIDAsc(members);
					break;
				case 2:
					mManager.sortIDDes(members);
					break;
				case 3:
					mManager.sortAgeAsc(members);
					break;
				case 4:
					mManager.sortAgeDes(members);
					break;
				case 5:
					mManager.sortGenderDes(members);
					break;
				case 9:
					System.out.printf("메인 메뉴로 화면 이동합니다. ");
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력바랍니다.");
			}

		} while (true);
	}

	// 회원 정보 수정 - setter 사용
	public void modifyMenu() {

		int memberId = -1;

		do {

			System.out.println("***** 회원 정보 수정 메뉴 *****\n"
				+ "\n"
				+ "1. 암호 변경\n"
				+ "2. 이메일 변경\n"
				+ "3. 나이 변경\n"
				+ "9. 이전 메뉴로 가기");
			System.out.printf("메뉴 선택: ");
			int num = sc.nextInt();

			switch (num) {
				case 1:
					System.out.printf("비밀번호를 변경할 회원의 아이디 입력: ");
					memberId = mManager.searchMemberId(members, sc.next());

					if (memberId != -1) {
						System.out.println(members[memberId].memberInfo());

						System.out.printf("변경할 암호: ");
						members[memberId].setPassword(sc.next());
						System.out.println("회원의 정보가 변경되었습니다.");
					} else {
						System.out.println("회원정보가 존재하지 않습니다.");
					}

					break;
				case 2:
					System.out.printf("이메일을 변경할 회원의 아이디 입력: ");
					memberId = mManager.searchMemberId(members, sc.next());

					if (memberId != -1) {
						System.out.println(members[memberId].memberInfo());

						System.out.printf("변경할 이메일: ");
						members[memberId].setEmail(sc.next());
						System.out.println("회원의 정보가 변경되었습니다.");
					} else {
						System.out.println("회원정보가 존재하지 않습니다.");
					}

					break;
				case 3:
					System.out.printf("이메일을 변경할 회원의 아이디 입력: ");
					memberId = mManager.searchMemberId(members, sc.next());

					if (memberId != -1) {
						System.out.println(members[memberId].memberInfo());

						System.out.printf("변경할 나이: ");
						members[memberId].setAge(sc.nextInt());
						System.out.println("회원의 정보가 변경되었습니다.");
					} else {
						System.out.println("회원정보가 존재하지 않습니다.");
					}

					break;
				case 9:
					System.out.printf("메인 메뉴로 화면 이동합니다. ");
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력바랍니다.");
			}

		} while (true);
	}

}
