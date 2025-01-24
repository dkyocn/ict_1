package cast.practice;

import java.util.Scanner;

public class CastingSample {
	
	Scanner scan = new Scanner(System.in);
	
	/**
	 * 문자 하나를 입력받아, 그 문자의 유니코드를 출력
	 */
	
	public void printUniCode() {
		
		System.out.printf("문자 입력: ");
		char ch = scan.next().charAt(0);
		
		System.out.printf("%s is unicode: %d",ch, (int)ch);
	}
	
	/**
	 * 실수형으로 국어, 영어, 수학 세과목의 점수를 입력받아 총점과  평균을 계산해서 출력
	 */
	public void calculatorScore() {
		
		double korean;
		double english;
		double math;
		
		System.out.printf("국어: ");
		korean = scan.nextDouble();
		System.out.printf("영어: ");
		english = scan.nextDouble();
		System.out.printf("수학: ");
		math = scan.nextDouble();
		
		System.out.printf("총점: %d\n평균: %d",(int)(korean+english+math),(int)(korean+english+math)/3);
	}
	
	/**
	 * 정수를 하나 입력받아, 그 정수의 2진수 값에서 1의 개수가 몇 개인지 출력
	 */
	public void printBitCount() {
		
		int num;
		
		System.out.printf("정수 입력: ");
		num = scan.nextInt();
		
		// 프로그래밍에서는 한 문장은 한 line에 기록하는  것이 원칙
		// 자바는 한 문장을 여러 줄로 끊어서 작성해도 됨 
		System.out.printf("%d의 2진수에 포함된 1의 개수: %d",num, Integer.bitCount(num));
	}
	
	// 자동형 변환 확인용
	public void autoCasting() {
		
		// 계산원칙 1: 자료형이 같은 것 끼리만 대입 가능
		int num = 125;
		double dnum = 3.3;
		
		// 원칙이 지켜지지 않을 때 형변환 필요
		// 자동형변환 되는 경우 1: 큰 자료형 변수방에 작은 자료형 값이 대입될 때
		double pay = 4570000; // 8파이트 double 변수방에 4바이트 정수가 대입되는 경우
		// int 4570000 -> double 4570000.0 으로 변환되어 대입됨(원칙 지킴)
		
		// 계산원칙 2: 같은 자료형끼리만 계산 가능
		System.out.println("계산 결과: "+ (num+dnum)); // int + double (원칙 위배)
		// 자동형변환 되는 경우 2: 큰 자료형 값으로 자동 형변환됨
		// int + double -> double 로 바뀜 + double -> double 결과가 나옴
		// 125 + 3.3 -> 125.0 + 3.3 => 158.3
		
		System.out.println("pay: "+ pay);
	}

	// 강제(명시적) 형변환 확인용
	public void testCasting() {
		
		int a =  Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		// 계산원칙 3 : 계산의 결과도 같은 자료형이여야 함
		int result = a + b; // 정수 오버플로우 적용됨 : -2
		long result2 = (long)a + b; // long 변수 <= 계산 결과 int가 대입
		// long 결과 => long + long 이어야 함
		
		System.out.println("result: "+ result);
		System.out.println("result2: "+ result2);
	}
	
	// byte, short 자료형 값 계산 결과는 자바가 무조건 int가 되게 함
	public void testCasting2() {
		
		byte b1 = 12;
		byte b2 = 20;
		byte result = (byte)(b1 + b2); // byte + byte -> 결과는 int 임
		int resultInt = b1 + b2;
		
		short s1 = 123;
		short s2 = 234;
		short result2 = (short)(s1 + s2); // short + short -> 결과는 int 임
		int resultShort = s1 + s2;
		
		System.out.println("resultInt: "+ resultInt);
		System.out.println("resultShort: "+ resultShort);
	}
	
	// char <=> int 서로 형변환 가능
	// java는 유니코드(unicode) 문자셋 사용함 : 글자 1개가 2바이트(16비트)임
	// 유니코드 정수 범위 0 ~ 65535 (음수를 양수로 변환하였음 : unsigned int)
	// 정수(음수, 0, 양수) 2바이트의 값의 범위 : -32768 ~ 0 ~ 32767 
	public void testUnicode() {
		
		System.out.printf("유니코드 정수 입력(0 ~ 65535) : ");
		int code = scan.nextInt();
		
		System.out.println("unicode "+ code+" -> 문자: "+ (char)code);
	}
}
