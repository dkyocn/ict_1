package member.model.dao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {

	private Scanner scanner = new Scanner(System.in);

	private int memberCount = 0;

	/*
	 * 회원 생성, 삭제, 검색
	 */

	public int getMemberCount() {
		return this.memberCount;
	}

	// 새 회원 등록 - 객체 배열 사용
	public Member memberInput() {
		System.out.println("[등록할 회원 정보 입력]");

		System.out.printf("아이디 입력: ");
		String id = scanner.next();
		System.out.printf("이름 입력: ");
		String name = scanner.next();
		System.out.printf("패스워드 입력: ");
		String pwd = scanner.next();
		System.out.printf("이메일 입력: ");
		String email = scanner.next();
		System.out.printf("성별 입력(M/F): ");
		char gender = scanner.next().toUpperCase().charAt(0);
		System.out.printf("나이 입력: ");
		int age = scanner.nextInt();

		memberCount++;

		return new Member(id, name, pwd, email, gender, age);

	}

	// 회원 삭제
	public void deleteMember(Member[] members) {

		System.out.printf("삭제할 회원의 아이디 입력: ");
		int num = searchMemberId(members, scanner.next());

		if (num != -1) {
			members[num] = null;
			memberCount--;
		} else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	// 모두 출력
	public void printAllMember(Member[] members) {
		for (Member member : members) {
			if (member != null) {
				System.out.println(member.memberInfo());
			}
		}

	}

	// 단일 출력
	public void printMember(Member[] members, int index) {

		if (index != -1) {
			System.out.println(members[index].memberInfo());
		} else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	// 아이디 검색
	public int searchMemberId(Member[] members, String id) {

		int returnNum = -1;

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getId().equals(id)) {
				returnNum = i;
			}
		}

		return returnNum;
	}

	// 이름 검색
	public int searchMemberName(Member[] members, String name) {

		int returnNum = -1;

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getName().equals(name)) {
				returnNum = i;
			}
		}

		return returnNum;

	}

	// 이메일 검색
	public int searchMemberEmail(Member[] members, String email) {

		int returnNum = -1;

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getEmail().equals(email)) {
				returnNum = i;
			}
		}

		return returnNum;

	}

	// id 오름차순 정렬
	public void sortIDAsc(Member[] members) {

		String[] ids = new String[memberCount];
		int num = 0;
		for (int i = 0; i < members.length; i++) {

			if (members[i] != null) {
				ids[num] = members[i].getId();
				num++;
			}
		}

		Arrays.sort(ids, (memberId, member2Id) -> memberId.compareTo(member2Id));

		for (int i = 0; i < ids.length; i++) {
			printMember(members, searchMemberId(members, ids[i]));
		}

	}

	// id 내림차순 정렬
	public void sortIDDes(Member[] members) {

		String[] ids = new String[memberCount];
		int num = 0;
		for (int i = 0; i < members.length; i++) {

			if (members[i] != null) {
				ids[num] = members[i].getId();
				num++;
			}
		}

		Arrays.sort(ids, (memberId, member2Id) -> member2Id.compareTo(memberId));

		for (int i = 0; i < ids.length; i++) {
			printMember(members, searchMemberId(members, ids[i]));
		}

	}

	// 나이 오름차순 정렬
	public void sortAgeAsc(Member[] members) {

		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member m1, Member m2) {
				if (m1 != null && m2 != null) {
					return m1.getAge() - m2.getAge();
				} else {
					return 0;
				}

			}
		});

		printAllMember(members);

	}

	// 나이 내림차순 정렬
	public void sortAgeDes(Member[] members) {

		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member m1, Member m2) {
				if (m1 != null && m2 != null) {
					return m2.getAge() - m1.getAge();
				} else {
					return 0;
				}

			}
		});

		printAllMember(members);
	}

	// 성별 내림차순 정렬
	public void sortGenderDes(Member[] members) {

		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member m1, Member m2) {
				if (m1 != null && m2 != null) {
					if (m1.getGender() > m2.getGender()) {
						return -1;
					} else if (m1.getGender() == m2.getGender()) {
						return 0;
					} else {
						return 1;
					}
				} else {
					return 0;
				}

			}
		});

		printAllMember(members);

	}
}
