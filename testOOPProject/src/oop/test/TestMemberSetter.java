package oop.test;

import java.util.Scanner;

import oop.encapsulation.Member;

public class TestMemberSetter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Member member = new Member();

		System.out.printf("이름: ");
		member.setName(scanner.next());
		System.out.printf("아이디: ");
		member.setId(scanner.next());
		System.out.printf("비밀번호: ");
		member.setPwd(scanner.next());
		System.out.printf("이메일: ");
		member.setEmail(scanner.next());
		System.out.printf("나이: ");
		member.setAge(scanner.nextInt());
		System.out.printf("성별(M/F): ");
		member.setGender(scanner.next().charAt(0));
		System.out.printf("전화번호: ");
		member.setPhone(scanner.next());

		member.printMember();
	}

}
