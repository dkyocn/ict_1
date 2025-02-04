package logic.loop.sample;

/**
 * for 문 안에 for문을 사용하는 경우 : 다중 for 문
 * 이중 for 문, 삼중 for 문 이라고 함
 * 반복되는 내용 전체가 다시 반복되는 경우에 사용함
 * 
 * for(초기식; 조건식; 증감식) {
 *  // 안쪽 for 문을 여러 번 반복 실행해야 될 때 for 문으로 묶을 수 있음
 * 	for(초기식; 조건식; 증감식) {
 * 		반복 실행 내용
 *  }
 * }
 */
public class DoubleForSample {
	
	/**
	 * 가로 한줄로 1 ~ 10까지 정수를 출력
	 * 1 2 3 4 5 6 7 8 9 10 <= for 문 사용
	 * 
	 * for 문을 한 개의 실행 문장으로 생각한다면, 실행문장 5번 반복한다고 보면 됨 
	 */
	public void printNumber() {
		for(int j = 0; j <5; j ++) {
			for(int i = 1; i <=10; i++) {
				System.out.printf(i+" ");
			}
			System.out.println();	
		}
	}
	
	/**
	 * 구구단 2단부터 9단까지 출력
	 */
	public void printGugudan() {
		
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" * "+ j+" = "+(i*j));
			}
			System.out.println("=============");
		}
	}
	
	/**
	 * 콘솔에 출력
	 * ***** 5줄
	 */
	public void printStar() {
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 콘솔에 출력
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public void printStar2() {
		for(int i=0; i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 콘솔에 출력
	 * 1
	 * *2 
	 * **3
	 * ***4
	 * ****5
	 */
	public void printStar3() {
		for(int i=0; i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			System.out.println(i+1);
		}
	}
	
	/**
	 * 콘솔에 출력
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 */
	public void printStar4() {
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>j) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * 콘솔에 출력
	 *    *
	 *   ***
	 *  *****
	 * *******
	 */
	public void printStar10() {
		for(int i=4; i>0;i++) {
			for(int j=4;j<8;j++) {
				if(i==j) {
					System.out.printf("*");	
				} else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}

}
