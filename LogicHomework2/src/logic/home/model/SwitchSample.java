package logic.home.model;

import java.util.Scanner;

public class SwitchSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기
	public void calculator() {
		
		int first = 0;
		int second = 0;
		char op;
		int result = 0; 
		
		System.out.printf("첫번째 정수: ");
		first = scanner.nextInt();
		System.out.printf("두번째 정수: ");
		second = scanner.nextInt();
		System.out.printf("연산문자 (+, -, *, /, %%) : ");
		op = scanner.next().charAt(0);
		
		switch(op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		case '%':
			result = first % second;
			break;
		default:
			System.out.println("연산기호가 잘못 입력되었습니다.");
		}
		
		if(op == '+' || op == '-' || op == '*' || op == '/' ||op == '%' ) 
			System.out.println(first + " "+op+" "+second+" = "+ result);
		
	}

	// 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기
	public void fruitPrice() {
		
		String fruit = "";
		int quantity = 0;
		int price = 0;
		
		System.out.printf("과일명(사과, 배, 오렌지, 포도, 키위): ");
		fruit = scanner.next();
		
		switch(fruit) {
		case "사과":
			price = 1200;
			break;
		case "배":
			price = 2500;
			break;
		case "오렌지":
			price = 500;
			break;
		case "포도":
			price = 5000;
			break;
		case "키위":
			price = 800;
			break;
		default:
			System.out.println("판매되지 않는 과일입니다. 확인하고 다시 입력하세요.");
			
		}
		
		if(!fruit.isBlank())
		System.out.println(fruit+" 한 개의 가격은 "+price+"원");
	}

}
