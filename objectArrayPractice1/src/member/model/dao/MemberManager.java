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
		
		return new Member(id, name, pwd, email, gender, age);

	}

	// 회원 삭제
	public void deleteMember(Member[] members) {

		System.out.printf("삭제할 회원의 아이디 입력: ");
		int num = searchMemberId(members,scanner.next());
		
		if (num != -1) {
			members[num] = null;
		} else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	// 모두 출력
	public void printAllMember(Member[] members) {
		for(Member member : members) {
			if(member != null) {
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
		
		for(int i = 0; i<members.length;i++) {
			if(members[i] != null && members[i].getId().equals(id)) {
				returnNum = i;
			}
		}

		return returnNum;
	}

	// 이름 검색
	public int searchMemberName(Member[] members, String name) {
		
		int returnNum = -1;
		
		for(int i = 0; i<members.length;i++) {
			if(members[i] != null && members[i].getName().equals(name)) {
				returnNum = i;
			}
		}

		return returnNum;

	}

	// 이메일 검색
	public int searchMemberEmail(Member[] members, String email) {
		
		int returnNum = -1;
		
		for(int i = 0; i<members.length;i++) {
			if(members[i] != null && members[i].getEmail().equals(email)) {
				returnNum = i;
			}
		}

		return returnNum;

	}

	public void sortIDAsc(Member[] members) {

//		Arrays.sort(members, new Comparator<Member>() {
//			
//			@Override
//			public int compare(Member member, Member member2) {
//				return  Integer.c
//			}
//		});
//		
	}

	public void sortIDDes() {
		// TODO Auto-generated method stub
		
	}

	public void sortAgeAsc() {
		// TODO Auto-generated method stub
		
	}

	public void sortAgeDes() {
		// TODO Auto-generated method stub
		
	}

	public void sortGenderDes() {
		// TODO Auto-generated method stub
		
	}
	
	
	/*
	 * 
	 */
	
	
}
