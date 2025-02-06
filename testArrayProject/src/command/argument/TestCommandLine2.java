package command.argument;

public class TestCommandLine2 {

	/*
	 * 실행 시 main 으로 이름(String) 성별(char) 나이(int) 키(double) 몸무게(double) 순으로 string_prompt 방식으로 값을 입력받아 전달하고
	 * main 은 받은 값을 자료형 별로 변환해서 출력 처리함
	 * 단, 전달 값은 반드시 5개여야 함
	 * 5개가 아닌 경우 "전달값은 반드시 5개여야 합니다." 출력 
	 */
	public static void main(String[] args) {

		String name ="";
		char gender;
		int age = 0;
		double hight = 0.0;
		double weight = 0.0;
		
		if(args.length == 5) {
			
			name = args[0];
			gender =  args[1].charAt(0);
			age = Integer.parseInt(args[2]);
			hight = Double.parseDouble(args[3]);
			weight = Double.parseDouble(args[4]);
			
			System.out.println("이름: "+name+", 성별: "+gender+", 나이: "+age+", 키: "+hight+", 몸무게: "+weight);
			
		} else {
			System.out.println("전달값은 반드시 5개여야 합니다.");
		}
	}

}
