package com.loop;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ForWhile {

	private Scanner scan = new Scanner(System.in);

	/**
	 * 
	 */
	public void printStar1() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (i == j) {
					System.out.print(j + 1);
				} else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}

	public void printStar2() {

		int num = 0;

		System.out.printf("정수 입력: ");
		num = scan.nextInt();

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		} else if (num == 0) {
			System.out.println("출력 기능이 없습니다.");
		} else {
			for (int i = 0; i < -num; i++) {
				for (int j = 0; j < -num; j++) {
					if (i > j) {
						System.out.printf(" ");
					} else {
						System.out.printf("*");
					}
				}
				System.out.println();
			}
		}

	}
	
	public void countInputCharacter() {
		
		String temp = "";
		char ch;
		int count =0;
		
		System.out.printf("문자열 입력: ");
		temp = scan.next();
		System.out.printf("문자 입력: " );
		ch = scan.next().charAt(0);
		
		if(Pattern.matches("^[a-zA-Z]*$", temp)) {
			System.out.println("입력한 문자열: "+ temp);
			System.out.println("입력한 문자: "+ ch);
			for (int i = 0; i<temp.length(); i++) {
				if(temp.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println("포함된 개수: "+count);
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		
	}

}
