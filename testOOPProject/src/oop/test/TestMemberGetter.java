package oop.test;

import oop.encapsulation.Member;

public class TestMemberGetter {

	public static void main(String[] args) {

		// Member 객체 3개 생성: 전체 필드 초기화  생성자 사용

		Member member = new Member("김두식", "kim123", "1234", "kim@naver.com", 45, 'M', "010-1234-5678");
		Member member1 = new Member("max", "max23", "1111", "max@naver.com", 28, 'M', "010-2325-7788");
		Member member2 = new Member("park", "park-5", "4571", "park@naver.com", 35, 'F', "010-6572-1234");

		// 출력 확인
		member.printMember();
		member1.printMember();
		member2.printMember();

		// 회원 3명의 나이의 평균 계산해서 출력 처리

		int avg = member.getAge() + member1.getAge() + member2.getAge() / 3;

		System.out.println("세 회원의 평균 나이: " + avg);
	}

}
