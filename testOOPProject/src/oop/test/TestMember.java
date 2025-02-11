package oop.test;

import oop.encapsulation.Member;

public class TestMember {

	public static void main(String[] args) {

		Member member = new Member();
		Member member2 = new Member("루이스", "lewis", "44");
		Member member3 = new Member("막스", "max", "1", "max@naver.com", 29, 'M', "010-1234-5678");

		member.printMember();
		member2.printMember();
		member3.printMember();
	}

}
