package workshop03;

public class Test02 {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		
		if(num>=5 && num <=10) {
			sum = calc.calculate(num);	
		} else {
			System.out.println("다시 입력하세요");
		}
		
		System.out.println("결과: "+sum);

	}

}
