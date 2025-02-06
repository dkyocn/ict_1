package logic.home.model;

import java.util.Scanner;

public class BreakSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 1~100까지 정수들의 합계 출력하기(break문 사용)
	public void sumBreak() {
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			
			sum+=i;
			i++;
			
			if(i==101) {
				break;
			}
		}
		
		System.out.println("1 ~ 100까지의 정수들의 합계: "+sum);
		
	}

	// 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)
	public void guguDanBreak() {
		
		for (int i = 1; i<10; i++) {
			System.out.println("구구단 "+i+" 단");
			for(int j = 1;  i<10; j++) {
				if(j == 5) {
					break;
				}
				System.out.println(i+" * "+j+"  = "+(i*j));
			}
			
		}
	}

}
