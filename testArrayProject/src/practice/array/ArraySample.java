package practice.array;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	
	private Random random = new Random();
	private Scanner scan = new Scanner(System.in); 

	public void test1() {

		int sum = 0;
		int[] intArr = new int[10];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = random.nextInt(100);
			sum += intArr[i];
		}
		
		System.out.println("난수 10개의 정수들의 합: "+sum);
	}
	
	public void test2() {
		
		int[] intArr = new int[10];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random() * 100) + 1;
		}
				
		for (int i = 0; i < intArr.length-1; i++) {
			for (int j =1; i<intArr.length; j++) {
				
				if(intArr[i] > intArr[j]) {
					int num = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = num;
				}
			}
		}
		
		System.out.println("기록된 값중 가장 큰값 : "+intArr[9]+", 기록된 값중 가장 작은 값: "+intArr[0]);
	}
	
	public void test3() {
		
		int sum = 0;
		byte[] arr = new byte[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (byte)(random.nextInt(255)- 128);
			
			if(arr[i]>0 && arr[i] % 2 ==0) {
				sum += arr[i];
			}
		}
		
		System.out.println("합계: "+sum);
	}
	
	public void test4() {
		
		String temp = "";
		int sum =0;
		int[] arr = new int[100];
		
		System.out.printf("숫자로된 문자열 입력: ");
		temp = scan.next();
		
		for (int i = 0; i<temp.length(); i++) {
	
			arr[i] = Integer.parseInt(temp.substring(i,i+1));
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("합계: "+sum);
		
	}
	
	public void test5() {
		
		String temp = "";
		int sum =0;
		int[] arr = new int[100];
		
		System.out.printf("숫자로된 문자열 입력: ");
		temp = scan.next();
		
		for (int i = 0; i<temp.length(); i++) {
			arr[i] = Character.getNumericValue(temp.charAt(i));
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("합계: "+sum);
		
	}
	
	public void test6() {
		
//		Date date = new Date();
		
		String personID = "881225-1234567";
		String gender = "";
		int num = 0;
		
		String[] arr = new String[4];
	
		for(int i=0;i<8;i+=2) {
			
			arr[num] = personID.substring(i,i+2);
			num++;
		} // 0 2 24 3  
		
		if(arr[3].endsWith("1")) {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
			LocalDate localDate = LocalDate.of(1900+Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
			
			String day = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
			
			int age = LocalDate.now().getYear() -  localDate.getYear();
			
			System.out.println("생일: "+localDate+", 요일: "+day+", 성별: "+gender+", 나이: "+age);
		
	}
}
