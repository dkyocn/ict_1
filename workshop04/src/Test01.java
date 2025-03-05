public class Test01 {

	public static void main(String[] args) {

		int sum =0;
		int totalLength = 0;
		double avg = 0;
		
		int[][] arr = {
			{5,5},
			{10,10,10,10,10},
			{20,20,20},
			{30,30,30,30}
		};

		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				sum += arr[i][j];
				totalLength++;
			}
		}

		avg = sum/totalLength;

		System.out.println("total = "+sum);
		System.out.printf("aberage = %.1f",avg);

	}

}
