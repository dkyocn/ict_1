package workshop02;

public class Test02 {

	public static void main(String[] args) {

		for(int inx = 0; inx<=6; inx++) {
			for(int jnx = 0; jnx<=inx; jnx++) {
				System.out.printf("*");
			}
			System.out.printf("@");
		}
	}

}
