package logic.testswitch.sample;

import java.util.Scanner;

/**
 * switch 문 사용 클래스
 * switch 문: 선택문(변수가 가진 값이 뭐냐? 또는 계산의 결과 값이 뭐냐?에 따라서 준비된 내용이 작동되게 한느 문장)
 * 조건표현식 사용 불가
 * switch(변수 또는 계산식) {
 * 	case 값1: 
 * 		값1이 맞으면 실행할 구문
 * 		break;
 * 	....
 *  default: <- 아닐때의 조건이 없으면 생략가능
 * 		case가 전부 아닐 때 실행할 구문
 * }
 * 
 * 실행할 구문 마지막에 break; 문 반드시 사용해야 함 => 사용하지 않으면 다음 case에서 실행할 내용도 같이 실행함
 * => break 문 만날때까지 아래의 다른 case의 실행 내용들을 작동시키면서 내려감 (fall through 현상)
 * => break 문은 switch 문 강제 종료 시키는 문장
 * 
 * switch 문은 모두 if 문으로 변경 가능
 */
public class SwitchSample {

	// Field : 캡슐화가 원칙 => private(비공개) : 클래스 안에서만 사용
	private Scanner scan = new Scanner(System.in);
	
	// constructor
	public SwitchSample() {} // 기본 생성자 (매개변수 없는 생성자)
	
	// method
	/**
	 * 정수 하나를 입력받아서
	 * 1이면 "입장하세요" 출력
	 * 2이면 "줄 서세요" 출력
	 * 3이면 "퇴장하세요" 출력
	 * 제시한 값이 모두 아니면 "즐겁게 구경하세요" 출력
	 */
	public void printMessage() {
		
		// 1. 변수 선언과 값 기록 처리
		System.out.printf("정수 하나 입력: ");
		int num = scan.nextInt();
		String message = "";
		
		// 2. 준비된 값에 대한 연산 처리
		switch(num) {
			case 1:
				message= "입장하세요";
				break;
			case 2:
				message= "줄 서세요";
				break;
			case 3:
				message= "퇴장하세요";
				break;
			default:
				message= "즐겁게 구경하세요";
		}
		
		// 3. 처리 결과 출력 또는 반환
		System.out.println(message);
	}
	
	/**
	 * 입력 예 :
	 * 첫번째 정수 : 25
	 * 두번째 정수 : 7
	 * 연산 문자 (+, -, *, /, %) : +
	 * 
	 * 출력 예:
	 * 25 + 7 = 32
	 * 
	 * 2개의 정수와 연산문자를 입력받아 연산문자에 따라 계산된 결과가 출력되게 처리
	 */
	public void simpleCalculator() {
		
		int first = 0;
		int second = 0;
		char op;
		int result = 0; // 지역 변수는 반드시 초기화 해야됨
		
		System.out.printf("첫번째 정수: ");
		first = scan.nextInt();
		System.out.printf("두번째 정수: ");
		second = scan.nextInt();
		System.out.printf("연산문자 (+, -, *, /, %%) : ");
		op = scan.next().charAt(0);
		
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
			System.out.println("연산기호가 잘못 입력되었습니다. 다시 입력 바랍니다.");
			// result에 결과 값이 없어 에러 발생 
		}
		
		if(op == '+' || op == '-' || op == '*' || op == '/' ||op == '%' ) 
			System.out.println(first + " "+op+" "+second+" = "+ result);
	}
	
	/**
	 * 과일명(String)과 수량(int)을 입력받아 가격을 계산해서 출력
	 * 과일의 가격(int)
	 * 사과 - 1200, 배 - 2500, 포도 - 5000, 오렌지 - 500, 키위 - 800, 그 외 다른 과일은 0
	 * 
	 * 구매가격 : 과일 가격 * 수량
	 * 출력 예 :
	 * 사과 한 개의 가격은 1200원, 구매 수량 5개, 총 구매 가격 : 6000원
	 */
	public void priceCalculator() {
		
		
		String fruit = "";
		int quantity = 0;
		int price = 0;
		String message = "";
		
		System.out.printf("과일명: ");
		fruit = scan.next();
		System.out.printf("구매 수량: ");
		quantity = scan.nextInt();
		
		switch(fruit) {
		case "사과":
			message = "사과 한 개의 가격은 1200원,";
			price = priceCalculator(quantity,1200);
			break;
		case "배":
			message = "배 한 개의 가격은 2500원,";
			price = priceCalculator(quantity,2500);
			break;
		case "오렌지":
			message = "오렌지 한 개의 가격은 500원,";
			price = priceCalculator(quantity,500);
			break;
		case "포도":
			message = "포도 한 개의 가격은 5000원,";
			price = priceCalculator(quantity,5000);
			break;
		case "키위":
			message = "키위 한 개의 가격은 800원,";
			price = priceCalculator(quantity,800);
			break;
		default:
			System.out.println("판매되지 않는 과일입니다. 확인하고 다시 입력하세요.");
			
		}
		
		if(fruit != "")
		System.out.println(message+" 구매 수량 "+quantity+"개, 총 구매 가격: "+price);
	}
	
	private int priceCalculator(int quantity, int price) {
		return  quantity*price;
	}
}
