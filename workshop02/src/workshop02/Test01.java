package workshop02;

public class Test01 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		
		System.out.printf("입력값: ");
		for(int i =0; i<3; i++) {
			arr[i] = Integer.parseInt(args[i]);
			System.out.printf(arr[i]+" ");
		}

		int max = 0;
		int min = arr[0];
		
		for(int num : arr) {
			if(max < num) {
				max = num;
			}
			
			if(min > num) {
				min = num;
			}
		}
		
		System.out.println("\n최대값: "+max);
		System.out.println("최소값: "+min);
	}

}
