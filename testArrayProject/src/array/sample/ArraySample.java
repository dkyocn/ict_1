package array.sample;

import java.awt.SystemTray;
import java.util.Date;

/**
 * 자료형이 같은 변수 공간이 여러 개 필요한 경우 
 * int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 배열을
 * 사용하면 편리함, 소스 코드도 짧아짐, 데이터 처리 속도도 빨라짐 자바에서는 배열 공간은 동적메모리의 heap을 사용하도록 정해 놓았음
 * => new 를 사용함 int[] ar; // int 배열공간의 주소를 저장할 배열레퍼런스 변수 선언함 (주소 저장용 변수 준비함) ar
 * = new int[10]; // int 자료형 변수방 10개 힙메모리에 연속 나열 할당되고, 시작주소가 ar에 기록 저장됨 할당된
 * 배열공간의 각 변수방에는 순번이 자동 부여됨 : 0부터 시작됨, 끝 인덱스는 배열크기(방 개수) - 1 배열은 주로 for 문 사용함
 * 배열은 반드시 저장 값들이 연속 나열 기록되어 있어야 함 : 중간에 값이 비워지면 안됨
 */
public class ArraySample {

	/**
	 * 배열 사용 시
	 * 구문 작성 순서: 
	 * 1. 배열 선언 : 배열공간의 주소 저장용 레퍼런스변수(배열명 이라고 함) 만들기 자료형[] 배열명; or 자료형 []배열명; or 자료형 배열명[];
	 * 2. 배열 할당 : 힙메모리에 배열공간을 생성하는 것 배열명 = new 자료형[개수]; 배열 선언과 배열할당은 한번에 작성해도 됨 자료형[] 배열명 = new 자료형[개수];
	 * 3. 배열 사용 : 할당된 배열공간의 각 변수방에 값
	 * 기록, 출력, 계산, 조회 등의 연산 처리 
	 * for(int 인덱스변수 = 0; 인덱스 변수 < 배열명. length; 인덱스 변수++) {
	 * 	배열명[인덱스변수] = 값 기록 또는 변경; syso(배열명[인덱스변수]); 
	 * } 
	 * 자바에서는 모든 배열레퍼런스(배열명)에 length 필드를 사용할 수 있도록 제공하고 있음 배열명.length == 할당된 개수
	 */
	public void testArray1() {

		int[] ar;
		ar = new int[10];

		System.out.println("ar이 가진 배열공간의 시작 주소: " + ar.hashCode());
		System.out.println("할당된 배열공간의 방 개수(배열의 크기) : " + ar.length);

		// 자바에서는 힙(heap) 메모리와 정적(static) 메모리에 할당된는 변수방에는 jvm에 의해 준비된 기본값이 자동으로 기록됨
		// jvm 에 의해 준비된 기본값이 먼저 기록됨 => 지정된 변수의 초기값으로 변경됨
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}

		System.out.println("boolean 배열 기본값 확인 ----------------------");
		boolean[] bar = new boolean[5];
		for (int i = 0; i < bar.length; i++) {
			System.out.println(i + " : " + bar[i]);
		}

		System.out.println("char 배열 기본값 확인 ----------------------");
		char[] car = new char[5];
		for (int i = 0; i < car.length; i++) {
			System.out.println(i + " : " + car[i]);
		}

		System.out.println("double 배열 기본값 확인 ----------------------");
		double[] dar = new double[5];
		for (int i = 0; i < dar.length; i++) {
			System.out.println(i + " : " + dar[i]);
		}
		
		System.out.println("String 배열 기본값 확인 ----------------------");
		String[] sar = new String[5];
		for (int i = 0; i < sar.length; i++) {
			System.out.println(i + " : " + sar[i]);
		}
	}
	
	/**
	 * 배열 할당 시에 배열크기(방 개수)는 반드시 정수여야 함
	 * 정수리터럴 또는 정수 변수 사용할 수 있음
	 * 배열레퍼런스 = new 자료형[정수 숫자];
	 * 배열레퍼런스 = new 자료형[정수 변수];
	 */
	public void testArray2() {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		// import 선언하면 클래스 명만
		Date today = new Date();
		// import 선언하지 않으면 패키지명부터 설정
		java.sql.Date today2 = new java.sql.Date(today.getTime());
		System.out.println(today+"\n"+today2);
		
		System.out.printf("배열 할당 크기: ");
		int size = scan.nextInt();
		
//		int[] ar = new int [size];
		int[] ar = new int [scan.nextInt()];
		System.out.println("length: "+ar.length);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
	}
	
	public void testArray3() {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		String[] sar = new String[5];
		
		// 각 방에 기록할 문자열 값을 키보드로 입력받아서 기록 처리 : 배열은 순서대로 연속 처리가 원칙임
		for(int i = 0; i< sar.length; i++) {
			System.out.printf(i+"번째 문자열 입력 : ");
			sar[i] = scanner.next();
		}
		
		// 출력확인
		for(int i =0; i<sar.length; i++) {
			System.out.println(i+" : "+sar[i]);
		}
	}
	
	/**
	 * 배열의 초기화 : 배열공간 할당과 동시에 준비된 초기값으로 값 기록 처리하는 것
	 * 실제로는 jvm에 의해 기본값이 기록되고 나서, 초기값으로 변경됨
	 * 자료형[] 레퍼런스변수 = {초기값, 초기값, ...., 초기값};
	 * 자료형[] 레퍼런스변수 = new 자료형[]{초기값, 초기값, ..., 초기값}; => 단, [] 안에 첨자(할당크기) 사용 못 함
	 * 초기값의 개수가 할당할 방 개수가 됨
	 */
	public void testArray4() {
		
		int[] ar = {11,22,33,44,55}; // 초기값의 개수가 할당크기가 되어서 자동 배열공간이 할당되고, 초기값이 순서대로 기록됨
		
//		int[] bar;
//		bar = {10,20,30}; // error, 두 개의 구문으로 나눌 수 없음 반드시 한번에 선언해야 함
		
		int[] bar;
		bar = new int[]{10,20,30}; // 두개의 구문으로 배열 초기화 가능함
		
		System.out.println("ar length: "+ar.length);
		System.out.println("bar length: "+bar.length);
		
		for(int i =0; i<ar.length; i++) {
			System.out.println(i+" : "+ ar[i]);
		}
		
		for(int i =0; i<bar.length; i++) {
			System.out.println(i+" : "+ bar[i]);
		}
	}
}
