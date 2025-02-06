package logic.home.model;

import java.util.Scanner;

public class PrimitiveTypeSample {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	// 기본자료형 메모리 할당크기 확인하기
	public void typeSize() {

			System.out.printf("메모리 할당 크기가 궁금한 자료형 입력(int,float,double,long,short,char): ");
			switch(scanner.next()) {
			case "int":
				System.out.println("int 메모리 할당 크기 : "+Integer.BYTES+ "바이트");
				break;
			case "float":
				System.out.println("float 메모리 할당 크기 : "+Float.BYTES+ "바이트");
				break;
			case "double":
				System.out.println("double 메모리 할당 크기 : "+Double.BYTES+ "바이트");
				break;
			case "long":
				System.out.println("long 메모리 할당 크기 : "+Long.BYTES+ "바이트");
				break;
			case "short":
				System.out.println("short 메모리 할당 크기 : "+Short.BYTES+ "바이트");
				break;
			case "char":
				System.out.println("char 메모리 할당 크기 : "+Character.BYTES+ "바이트");
				break;
			default:
				System.out.println("잘못된 자료형입니다.\n");
			}
		
	}

	//  기본자료형 값의 최소값, 최대값 출력하기
	public void minMaxValue() {
		
		System.out.printf("메모리 할당 크기가 궁금한 자료형 입력(int,float,double,long,short): ");
		switch(scanner.next()) {
		case "int":
			System.out.println("int 최대값 : "+Integer.MAX_VALUE+ ", int 최소값 : "+Integer.MIN_VALUE);
			break;
		case "float":
			System.out.println("float 최대값 : "+Float.MAX_VALUE+ ", float 최소값 : "+Float.MIN_VALUE);
			break;
		case "double":
			System.out.println("double 최대값 : "+Double.MAX_VALUE+ ", double 최소값 : "+Double.MIN_VALUE);
			break;
		case "long":
			System.out.println("long 최대값 : "+Long.MAX_VALUE+ ", long 최소값 : "+Long.MIN_VALUE);
			break;
		case "short":
			System.out.println("short 최대값 : "+Short.MAX_VALUE+ ", short 최소값 : "+Short.MIN_VALUE);
			break;
		default:
			System.out.println("잘못된 자료형입니다.\n");
		}
		
	}

	// 기본자료형 비트갯수 확인하기
	public void bitSize() {
		
		System.out.printf("메모리 할당 크기가 궁금한 자료형 입력(int,float,double,long,short,char): ");
		switch(scanner.next()) {
		case "int":
			System.out.println("int 기록 비트수 : "+Integer.SIZE+ "비트");
			break;
		case "float":
			System.out.println("float 기록 비트수 : "+Float.SIZE+ "비트");
			break;
		case "double":
			System.out.println("double 기록 비트수 : "+Double.SIZE+ "비트");
			break;
		case "long":
			System.out.println("long 기록 비트수 : "+Long.SIZE+ "비트");
			break;
		case "short":
			System.out.println("short 기록 비트수 : "+Short.SIZE+ "비트");
			break;
		case "char":
			System.out.println("char 기록 비트수 : "+Character.SIZE+ "비트");
			break;
		default:
			System.out.println("잘못된 자료형입니다.\n");
		}
		
	}

}
