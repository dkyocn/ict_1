package workshop03;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num1 = random.nextInt(6)+1;
		int num2 = random.nextInt(6)+1;
		
		
		if(num1 - num2 > 0 && num1 - num2 <=3) {
			System.out.println(num1+ " - "+ num2 +" = "+(num1-num2));
		}
	}

}
