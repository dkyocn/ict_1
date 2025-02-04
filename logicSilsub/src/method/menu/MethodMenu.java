package method.menu;

import java.util.Scanner;

import method.sample.Munjae;

public class MethodMenu {
	
	public static void display() {
		
		Scanner scan  = new Scanner(System.in);
		Munjae munjae = new Munjae();
		
		int no = 0;
		
		do {
			
			System.out.println("제어문 실습문제 (메서드 변형 버전) ****\n");
			
			System.out.println("1. 합격 여부");
			System.out.println("2. 메세지 출력");
			System.out.println("3. 양수 판별");
			System.out.println("4. 짝수 홀수 판별");
			System.out.println("9. 실습끕내기");
			System.out.printf("번호 선택: ");
			no = scan.nextInt();
			
			switch(no) {
			case 1:
				System.out.println(munjae.test1());
				break;
			case 2:
				System.out.println("*** 초기 메뉴 ***");
				System.out.println("1. 입력");
				System.out.println("2. 수정");
				System.out.println("3. 조회");
				System.out.println("4. 삭제");
				System.out.println("7. 종료");
				
				System.out.printf("메뉴번호 입력: ");
				munjae.test2(scan.nextInt());
				break;
			case 3:
				System.out.printf("정수 하나 입력: ");
				if(munjae.test3(scan.nextInt())) {
					System.out.println("양수다");
				} else {
					System.out.println("양수가 아니다");
				}
				break;
			case 4:
				System.out.printf("정수 하나 입력: ");
 				System.out.println(munjae.test4(scan.nextInt())); 
 				break;
			case 9:
				System.out.printf("정말 끝내겠습니까?(y/n): ");
				if(scan.next().toLowerCase().charAt(0) == 'y') {
					return;
				}
			default:
				System.out.println("없는 번호입니다. 확인하고 다시 입력하세요.");
			}
		} while(true);
	}
}
