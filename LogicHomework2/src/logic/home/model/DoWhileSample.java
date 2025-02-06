package logic.home.model;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DoWhileSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기
	public void addDashToken() {
		
		String temp = "";
		int loop = 0;
		String result = "";
		int num = 0;

		System.out.printf("문자열 입력: ");
		temp = scanner.next();

		loop = temp.length();

		do {

			if (num != temp.length()-1) {
				result += temp.charAt(num) + "-";
			} else {
				result += temp.charAt(num) + "";
			}
			
			num++;
			loop--;
			
		} while (loop > 0);
		
		System.out.println(result);
	}

	// 버거킹 메뉴 주문 테스트
	public void burgerKingMenu() {
		

		int num = 0;
		String out = "y";
		String order = "";

		int count = 0;
		int price = 0;

		do {
System.out.println("check: " + price);
			
			System.out.println("*** 메뉴를 선택하세요 ***\n" + "\n" + "햄버거 ***************\n" + "1. 불고기버거	3500원\n"
					+ "2. 치킨버거		3200원\n" + "추가 ****************\n" + "3. 감자튀김		1000원\n" + "4. 치즈스틱		400원\n"
					+ "5. 샐러드		2000원\n" + "음료수 ***************\n" + "6. 콜라		700원\n" + "7. 에이드		1200원\n"
					+ "8. 커피		1000원\n" + "********************\n");
			System.out.printf("메뉴 선택: ");
			num = scanner.nextInt();

			switch (num) {
			case 1:
				System.out.println("불고기버거를 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("불고기버거", count);
				order += "불고기 버거 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 2:
				System.out.println("치킨버거를 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("치킨버거", count);
				order += "치킨버거 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 3:
				System.out.println("감자튀김을 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("감자튀김", count);
				order += "감자튀김 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 4:
				System.out.println("치즈스틱을 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("치즈스틱", count);
				order += "치즈스틱 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 5:
				System.out.println("샐러드를 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("샐러드", count);
				order += "샐러드 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 6:
				System.out.println("콜라를 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("콜라", count);
				order += "콜라 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 7:
				System.out.println("에이드를 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("에이드", count);
				order += "에이드 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			case 8:
				System.out.println("커피를 선택하셨습니다.");
				System.out.printf("수량은? ");
				count = scanner.nextInt();
				price += priceCalculator("커피", count);
				order += "커피 : "+count+"개 - "+price+"원\n";
				System.out.println(count + "개 주문하셨습니다.");
				break;
			}
			
			System.out.printf("추가 주문하시겠습니까?(y/n): ");
			out = scanner.next();
		
		System.out.println("*주문하신 정보는 다음과 같습니다.*");
		System.out.println("---------------------------");
		System.out.println(order);
		System.out.println("---------------------------");
		System.out.println("총 가격: "+price);
		} while (out.equals("y"));

			
		
	}
	
	// 음식 값 계산
	private int priceCalculator(String menu, int count) {

		int menuPrice = 0; 
		
		switch (menu) {
		case "불고기버거":
			menuPrice =  3500 * count;
			break;
		case "치킨버거":
			menuPrice =  3200 * count;
			break;
		case "감자튀김":
			menuPrice =  1000 * count;
			break;
		case "치즈스틱":
			menuPrice =  400 * count;
			break;
		case "샐러드":
			menuPrice =  2000 * count;
			break;
		case "콜라":
			menuPrice =  700 * count;
			break;
		case "에이드":
			menuPrice =  1200 * count;
			break;
		case "커피":
			menuPrice =  1000 * count;
			break;
		}
		return menuPrice;
	}
		
	// 문자열 입력받아, "모든 글자 영문자다" "영문자 아니다." 출력하기
	public void isStringAlphabet() {
		
		String temp = "";
		
		System.out.printf("문자열 입력(종료: exit): ");
		temp = scanner.next();
		
		do {
			
			if (Pattern.matches("^[a-zA-Z]*$", temp)) {
				System.out.println("모든 글자 영문자다");
			} else {
				System.out.println("영문자 아니다.");
			}

			System.out.printf("문자열 입력(종료: exit): ");
			temp = scanner.next();
			
			
		} while(!temp.equals("exit"));
	}

}
