package logic.home.model;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
	
	private Scanner scanner = new Scanner(System.in);
	private Date date = new Date();
	private Random random = new Random();
	
	
	// Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기
	public void testScanner() {
		
		String str = "";
		int num = 0;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		long longNum = 0;
		short sh = 0;
		char ch;
		
		
		System.out.printf("String에 저장할 값 입력: ");
		str = scanner.next();
		System.out.printf("int에 저장할 값 입력: ");
		num = scanner.nextInt();
		System.out.printf("float에 저장할 값 입력: ");
		floatNum = scanner.nextFloat();
		System.out.printf("double에 저장할 값 입력: ");
		doubleNum = scanner.nextDouble();
		System.out.printf("long에 저장할 값 입력: ");
		longNum = scanner.nextLong();
		System.out.printf("short에 저장할 값 입력: ");
		sh = scanner.nextShort();
		System.out.printf("char에 저장할 값 입력: ");
		ch = scanner.next().charAt(0);
		
		System.out.println("String에 저장된 값: "+str+", int에 저장된 값: "+num+", float에 저장된 값: "+floatNum+"double에 저장된 값: "+doubleNum+
				"long에 저장된 값: "+longNum+"short에 저장된 값: "+sh+"char에 저장된 값: "+ch);
		
	}

	// Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기
	public void testDate() {
		
		
		
		System.out.println("오늘 날짜: "+(date.getMonth()+1)+"월 "+ date.getDate()+"일, 현재 시간: "+ date.getHours()+"시 "+date.getMinutes()+"분 "+date.getSeconds()+"초");
	}

	// Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기
	public void testRandom() {
	}

}
