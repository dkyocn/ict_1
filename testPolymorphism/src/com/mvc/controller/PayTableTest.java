package com.mvc.controller;

import java.util.Scanner;

import com.mvc.model.PayTable;
import com.mvc.model.Salary;

public class PayTableTest {

	public static void main(String[] args) {
		Salary[] salaries = new Salary[3];
		Scanner scanner = new Scanner(System.in);

		salaries[0] = new PayTable("소서노", 750000, 2, 3);
		salaries[1] = new PayTable("고주몽", 800000, 1, 4);
		salaries[2] = new PayTable("모팔모", 650000, 6, 2);

		System.out.printf("인센티브(%%)입력: ");
		Salary.setIncentive(scanner.nextFloat());
		System.out.println();
		System.out.println("                               *** 급여명세서 ***                               ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("이름  기본급   가족수  가족수당  시간외근무  시간외수당  세금   인센티브(%) 성과금   실수령액");
		for (int i = 0; i < salaries.length; i++) {
			PayTable payTable = (PayTable)salaries[i];
			payTable.calc(); // 나머지 계산
			payTable.out(); // 출력

			/*
			 *  정적 바인딩 : 컴파일 시에 소스 코드 구문에 사용한 메서드를 원래 소유한 클래스와 연결시킴
			 *  즉, 컴파일 할 때는 부모의 메서드와 연결시킴
			 *  
			 *  동적 바인딩(다형성이 적용된 레퍼런스와 메서드에 사용됨) : 실행할 때 레퍼런스가 참조하는 객체에 대한 클래스가
			 *  부모 메서드를 오버라이딩하였다면 후손의 오버라이딩된 메서드로 연결을 바뀌면서 실행이 되는 것 
			 */

			//			((Calculate)salaries[i]).calc(); // 동적 바인딩됨
			//			((Output)salaries[i]).out(); // 동적 바인딩됨
		}
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("인원수: " + Salary.getCount() + "명");
	}

}
