package logic.loop.sample; // 소속된 패키지 선언문은 반드시 첫 줄에 기록함

// 소스 코드 상에서 이용하는 다른 패키지(자바가 제공하는 클래스)에 소속된 클래스 사용을 위해 import 선언함
import java.util.Scanner;

// 클래스 작성부
public class ForSample {

	/*
	 * Filed : 반드시 캡슐화(데이터 보호가 목적임)해야 함
	 * 클래스 밖에서 접근 못하게 해야함
	 * 기본자료형 맴버변수 : 접근제한자 [예약어] 자료형 변수 [ = 초기값]
	 * 참조자료형 맴버변수 : 접근제한자 [예약어] 클래스명 레퍼런스변수[ = new 클래스생성자(초기값, ......)];
	 */
	private Scanner scan = new Scanner(System.in);

	/*
	 * Constructor : 접근제한자 클래스명([자료형 매개변수, ......]) {필드 = 매개변수; 필드의 초기화 처리가 목적}
	 * 기본 public(공개: 클래스 밖, 패키지 안/밖)을 사용함
	 */
	public ForSample() {} // 매개변수가 없는 생성자(기본생성자, 생성자가 없는 클래스는 자동으로 추가됨)

	/*
	 * Method : 접근제한자 [예약어] 반환자료형 메소드명([자료형 매개변수,....]){ 처리할 소스 코드 구문}
	 * 객체지향 프로그래밍에서는 필드는 캡슐화 처리하고, 매서드를 public 으로 만들어서 필드에 대한 값 처리를 메서드를 통해서 간접적으로 사용
	 */

	/**
	 * 1 ~ 100 까지 정수들의 합을 구하는 메서드
	 * for 문 이용
	 */
	public void add1To100() {

		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			System.out.printf(i + " + ");
			sum += i; // 100번 수행됨
		}

		System.out.println("\n1 ~ 100까지 정수들의 합: "+ sum);
	}

	/**
	 * 1 ~ 100 까지 정수들의 합을 구하는 메서드
	 * for 문 이용
	 * 출력을 아래의 형식으로 만듦 => if - else 사용
	 * 1+2+3+....+100 = 5050
	 */
	public void add1To100_2() {

		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			sum += i; // 100번 수행됨
			if (i != 100) {
				System.out.printf(i+" + ");
			} else {
				System.out.printf(i+" = "+sum);
			}
		}
	}

	/**
	 * 1 ~ 100 까지 정수들의 합을 구하는 메서드
	 * for 문 이용
	 * 계산된 합계값을 메소드가 실행되는 위치로 보내서(반환) 메서드 실행 위치에서 반환되는 값을 받아서 출력되게 한다면
	 */
	public int add1To100_3() {

		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			sum += i; // 100번 수행됨
		}

		// return; // 반환값 없이 돌아감(실행 위치로 되돌아감) => void 표시함
		return sum; // 계산 결과인 합계값을 가지고 위치로 돌아감 => 반환값의 자료형을 메서드 명 앞에 표시해야 함
	}

	/**
	 * 1 ~ 100까지 홀수들의 합계를 구해서 출력
	 * for 문만 사용
	 */
	public void sumOdd() {

		int sum = 0;

		for(int i = 1; i <= 100; i+=2) {
			sum += i; // 100번 수행됨

			if (i != 99) {
				System.out.printf(i+" + ");
			} else {
				System.out.printf(i+" = "+sum);
			}
		}
	}

	/**
	 * 1 ~ 100까지 짝수들의 합계를 구해서 출력
	 * for 문만 사용
	 */
	public void sumEven() {

		int sum = 0;

		for(int i = 0; i <= 100; i+=2) {
			sum += i; // 100번 수행됨

			if (i != 100) {
				System.out.printf(i+" + ");
			} else {
				System.out.printf(i+" = "+sum);
			}
		}
	}

	/**
	 * 구구단의 단수를 키보드로 입력받아서, 해당 단의 구구단 출력
	 * 수 * 수 = 수 구문 9번 반봅 : 횟수가 정해진 반복이므로 for 문 사용
	 */
	public void printGugudan() {

		int num = 0;

		System.out.printf("단수 입력: ");
		num = scan.nextInt();

		for (int i = 1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	
	/**
	 * 두 개의 정수를 입력받아, 두 수중 작은 값을 초기값으로 큰 값을 종료값으로 해서
	 * 작은 수에서 큰 수까지 정수들의 합계를 구해 출력하는 메서드
	 */
	public void sumMinToMax() {
		
		int max =  0;
		int min = 0;
		int change = 0;
		int sum = 0;
		
		System.out.printf("첫번째 정수 입력: ");
		max = scan.nextInt();
		System.out.printf("두번째 정수 입력: ");
		min = scan.nextInt();
		
		// 입력받은 값 대소 비교
		if (min > max) {
			change = max;
			max = min;
			min = change;
		}
		
		// 작은 수부터 큰 수까지의 합
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min+"부터 "+max+"까지의 합: "+sum);
	}
	
	/**
	 * 두 개의 정수를 입력받아, 두 수중 작은 값을 초기값으로 큰 값을 종료값으로 해서
	 * 작은 수에서 큰 수까지 정수들의 합계를 구해 반환하는 메서드
	 * 해당 메서드 실행 위치에서 반환값 받아서 출력 처리
	 */
	public int sumMinToMax2() {
		
		int max =  0;
		int min = 0;
		int change = 0;
		int sum = 0;
		
		System.out.printf("첫번째 정수 입력: ");
		max = scan.nextInt();
		System.out.printf("두번째 정수 입력: ");
		min = scan.nextInt();
		
		// 입력받은 값 대소 비교
		if (min > max) {
			change = max;
			max = min;
			min = change;
		}
		
		// 작은 수부터 큰 수까지의 합
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	/**
	 * 메서드 실행 위치에서 두 개의 정수를 입력받아, 메서드로 전달하고
	 * 메서드 안에서는 전달받은 두 수 중 작은 값을 초기값으로 큰 값을 종료값으로 해서
	 * 작은 수에서 큰 수까지 정수들의 합계를 구해 반환하는 메서드
	 * 해당 메서드 실행 위치에서 반환값 받아서 출력 처리
	 * 
	 * 전달값(argument)이 있는 메서드는 메서드 작성부에서 전달값 받을 변수(매개변수 : parameter)를 반드시
	 * 자료형과 갯수가 일치되게 메서드() 안에 선언해야 함
	 * 
	 * 매개변수도 있고 반환값도 있는 메서드
	 */
	public int sumMinToMax3(int max, int min) {
		
		int change = 0;
		int sum = 0;
		
		// 입력받은 값 대소 비교
		if (min > max) {
			change = max;
			max = min;
			min = change;
		}
		
		// 작은 수부터 큰 수까지의 합
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public void testMathRandom() {
		
		System.out.println("임의의 실수값: " + Math.random()); // 0.0 <= value < 1.0
		
		/*
		 *  1 ~ 100 사이의 임의의 정수를 발생시킨다면
		 *  (int)(Math.random()*끝값) + 시작값
		 */
		System.out.println("1 ~ 100사이의 임의의 정수: "+((int)(Math.random()*100)+1));
		
		/*
		 *  51 ~ 80 사이의 임의의 정수를 발생시킨다면
		 *  (int)(Math.random()*(끝값-시작값 +1)) + 시작값
		 */
		System.out.println("51 ~ 80사이의 임의의 정수: "+((int)(Math.random()*30)+51));
	}
	
	/**
	 * 1 ~ 100 사이의 임의의 정수를 랜덤하게 발생시켜서
	 * 1부터 랜덤값까지의 정수들의 합계를 구해서 출력
	 */
	public void sumOneToRandomNumber() {
		
		int sum  = 0;
		int randomNum = (int)(Math.random()*100)+1;
		
		for (int i = 1; i<=randomNum; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ "+randomNum+"까지 정수들의 합계: "+ sum);
	}
	
	/**
	 * 매서드 실행 위치에서 1 ~ 100 사이의 임의의 정수를 랜덤하게 발생시켜서 메서드로 전달함
	 * 메서드 안에서 전달받은 랜덤값을 가지고
	 * 1부터 랜덤값까지의 정수들의 합계를 구해서 리턴
	 * 메서드 실행 위치에서 리턴받은 값 출력 확인 처리
	 */
	public int sumOneToRandomNumber2(int randomNum) {
		
		int sum  = 0;
		
		for (int i = 1; i<=randomNum; i++) {
			sum += i;
		}
		
		return sum;
	}
}
