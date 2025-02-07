package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	
	private Scanner scanner = new Scanner(System.in);

	// 내 신상정보 변수에 담아 출력하기
	public void myProfile() {
		
		String name = "";
		int age = 0;
		String gender = "";
		String personality = "";
		
		// 신상 정보 입력
		System.out.printf("이름: ");
		name = scanner.next();
		System.out.printf("나이: ");
		age = scanner.nextInt();
		System.out.printf("성별(남자/여자): ");
		gender = scanner.next();
		System.out.printf("성격: ");
		personality = scanner.next();
		
		System.out.println("\n[신상정보]");
		System.out.println("이름: "+name+"\n나이: "+age+"\n성별: "+gender+"\n성격: "+personality);
	}

	// 사원정보를 키보드로 입력받아 출력하기
	public void empInformation() {
		
		String group = "";
		String position = "";
		String name = "";
		int age = 0;
		char gender = 'M';
		String email = "";
		String phone = "";
		int money = 0;
		
		System.out.printf("소속 입력: ");
		group = scanner.next();
		System.out.printf("직책 입력: ");
		position = scanner.next();
		System.out.printf("이름 입력: ");
		name = scanner.next();
		System.out.printf("나이 입력: ");
		age = scanner.nextInt();
		System.out.printf("성별 입력(M/F): ");
		gender = scanner.next().toUpperCase().charAt(0);
		System.out.printf("이메일 입력: ");
		email = scanner.next();
		System.out.printf("전화번호 입력: ");
		phone = scanner.next();
		System.out.printf("급여 입력: ");
		money = scanner.nextInt();
		
		System.out.println("\n우리회사 사원 정보");
		System.out.println("소속: "+ group+", 직책: "+position+", 이름: "+name+", 나이: "+age+", 성별: "+gender+", 이메일: "+email+", 전화번호: "+phone+", 급여: "+money);
		
		
	}

	// 기본 자료형 변수의 초기값 확인하기
	public void defaultValue() {
		
		String name = "rick";
		int age = 29;
		double hight = 181.5;
		float weight = 65.4f;
		long shortest = 0L;
		short longest = 12;
		char gender = 'M';
		
		
		System.out.println("String의 초기값: "+name+", int의 초기값: "+age+", double의 초기값: "+hight+", float의 초기값: "+weight+", long의 초기값: "+shortest+", short의 초기값: "+longest+", char의 초기값: "+gender );
	}

}
