package workshop01;

public class Test01 {

	public static void main(String[] args) {
		
		double first = Integer.parseInt(args[0]);
		double second = Integer.parseInt(args[1]);
		
		if(first>=1 && first<=10 && second>=1 && second<=10 ) {
			if(first%second > 1) {
				System.out.println("나머지가 1보다 크다!");
			} else {
				System.out.println("나머지가 1보다 작거나 같다");
			}
		}

	}

}
