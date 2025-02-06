package logic.home.model;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WhileSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
	public void printUniCode() {
		
		char ch;
		
		System.out.printf("문자 입력: ");
		ch = scanner.next().charAt(0);
		
		while(ch != '0') {
			System.out.println(ch + "의 유니코드는 " +(int)ch );
			
			System.out.printf("문자 입력: ");
			ch = scanner.next().charAt(0);
		}
	}

	// 1~100까지 정수들의 합계 출력하기(while 문으로 작성)
	public void sum1To100() {
		
		int i = 0;
		int sum = 0;
		
		while(i<100) {
			sum +=i;
			i++;
		}
		
		System.out.println(" 1 ~ 100가지의 합: " + sum);
	}

	// 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
	public void numberGame() {
		
		Random random = new Random();
		
		int dice = 0;
		int expectedNum = 0;
		
		while(true) {
			dice = random.nextInt(99) + 1;
			
			// 예상 가는 값 입력
			System.out.printf("생성된 숫자를 맞춰보세요: ");
			expectedNum = scanner.nextInt();
			
			// 난수와 입력값 비교로 게임 승패 여부 판단
			if(dice == expectedNum) {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
			
			//게임 계속 진행 여부
			System.out.printf("계속하시겠습니까?(y/n): ");
			char yn = scanner.next().charAt(0);
				
			if(yn == 'n') {
				break;
			}
		}
	}

	// 문자열을 입력받아, 글자 갯수 알아내어 출력하기
	public void countCharacter() {
		
		String temp = "";

		System.out.printf("문자열 입력: ");
		temp = scanner.next();

		while (!temp.equals("exit")) { // 문자열은 클래스이므로 같으냐를 물을 때 '==' 사용할 수 없음 , == 연산자 : 값 == 값 비교
			System.out.println(temp + " 글자 개수: " + temp.length());

			System.out.printf("문자열 입력: ");
			temp = scanner.next();
		}
	}

	// 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기
	public void countInChar() {
		
		String temp = "";
		char ch;
		int count =0;
		
		while(true) {
		
			System.out.printf("문자열 입력: ");
			temp = scanner.next();
			System.out.printf("문자 입력: " );
			ch = scanner.next().charAt(0);
			
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
			
			System.out.printf("계속하시겠습니까?(y/n) ");
			if(scanner.next().toLowerCase().charAt(0) == 'n') {
				break;
			}
		}
		
	}
}
