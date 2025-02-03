package logic.testIf.sample;

import java.util.Scanner;

/**
 * if(조건표현식) {
 * 	조건의 결과가 true일 때 처리할 내용
 * } else {
 * 	조건의 결과가 false일 때 처리할 내용
 * }
 * 삼항연산자와 작동 구조는 같음
 */
public class IfElseSample {
	private Scanner scan = new Scanner(System.in);
	
	public IfElseSample() {}
	
	/**
	 * 정수를 하나 입력받아, 짝수이면 "짝수"라고 출력하고, 짝수가 아니면 "홀수"라고 출력
	 */
	public void testEven() {
		
		System.out.printf("정수 하나 입력: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+"은(는) 짝수");
		} else {
			System.out.println(num+"은(는) 홀수");
		}
		
	}
	
	/**
	 * 삼항 연산자 사용으로 바꾼다면
	 */
	public void testEven2() {
		
		System.out.printf("정수 하나 입력: ");
		int num = scan.nextInt();
		
		System.out.println(num % 2 ==0 ? num+"은(는) 짝수" : num+"은(는) 홀수");
		
	}
	
	/**
	 * 국어, 영어, 수학 점수를 입력받아, 총점과 평균을 계산하고
	 * 각 과목별 점수가 각각 40점 이상이고, 평균이 60점 이상이면 합격 아니면 불합격
	 * 모든 값은 정수형
	 */
	public void testPass() {
		
		System.out.printf("국어 점수: ");
		int korean = scan.nextInt();
		System.out.printf("영어 점수: ");
		int english = scan.nextInt();
		System.out.printf("수학 점수: ");
		int math = scan.nextInt();
		
		if (korean >=40 && english >=40 && math >=40 && (korean+english+math)/3>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	/**
	 * 삼항 연산자 사용으로 바꾼다면
	 */
	public void testPass2() {
		
		System.out.printf("국어 점수: ");
		int korean = scan.nextInt();
		System.out.printf("영어 점수: ");
		int english = scan.nextInt();
		System.out.printf("수학 점수: ");
		int math = scan.nextInt();
		
		System.out.println(korean >=40 && english >=40 && math >=40 && (korean+english+math)/3>=60 ? "합격" : "불합격");
		
		return; // 메서드 안에서 맨마지막에 한번만 사용함, return 문 아래에는 소스 코드 작성할 수 없음
	}
	
	/**
	 * 두 개의 정수를 입력받아,
	 * 두 수 모두 양수일 때만 두 수의 합, 차, 곱, 몫 ,나머지를 계산 출력
	 * 하나라도 양수가 아니면 "양수가 아닌 값은 계산할 수 없습니다." 출력
	 */
	public void testCalculator() {
	
		System.out.printf("첫번째 정수: ");
		int num1 = scan.nextInt();
		System.out.printf("두번째 정수: ");
		int num2 = scan.nextInt();
		
		if(num1>0 && num2>0) {
			 System.out.println(num1+" + "+num2+" = "+(num1+num2));
			 System.out.println(num1+" - "+num2+" = "+(num1-num2));
			 System.out.println(num1+" * "+num2+" = "+(num1*num2));
			 System.out.println(num1+" / "+num2+" = "+(num1/num2));
			 System.out.println(num1+" % "+num2+" = "+(num1%num2));
		} else {
			System.out.println("양수가 아닌 값은 계산할 수 없습니다.");
		}
	}
	
	/**
	 * 두 개의 정수를 입력받아서, 큰 값과 작은 값으로 분류해서 출력
	 * 두 수중 큰 값은 max 변수에, 두 수중 작은 값은 min 변수에 저장해서 출력
	 */
	public void checkMaxMin() {
		
		int max = 0; // 지역변수(Local Variable) :  선언된 블럭 {} 내에서만 사용할 수 있음
		int min = 0;
		int change = 0;
		
		System.out.printf("첫번째 숫자 입력: ");
//		max = scan.nextInt();
		int first = scan.nextInt();
		System.out.printf("두번째 숫자 입력: ");
//		min = scan.nextInt();
		int second = scan.nextInt();
		
//		if (max > min) {
//			System.out.println("큰 값 :"+max +", 작은 값: "+min);
//		} else {
//			
//			// max와 min 자리 바꿈
//			change = max;
//			max = min;
//			min = change;
//			System.out.println("큰 값 :"+max +", 작은 값: "+min);
//		}
		
		if(first>second) {
			
			// 이 안에서 지역 변수 생성시 if문 내에서만 사용 가능
			max =  first;
			min = second;
		} else {
			min =  first;
			max = second;
		}
		System.out.println("큰 값 :"+max +", 작은 값: "+min);
	}
}
