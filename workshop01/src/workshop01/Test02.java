package workshop01;

public class Test02 {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		
		if(num<=10 && num>=5) {
			double sum = 0.0;
			double mul = 1.0;
			
			for(int i = 1; i<=num; i++) {
				sum += i;
				mul *= i;
			}
			
			System.out.println("합: "+sum);
			System.out.println("곱: "+mul);
			System.out.println("평균: "+sum/num);
	
		} else {
			System.out.println("다시 입력하세요");
		}

	}

}
