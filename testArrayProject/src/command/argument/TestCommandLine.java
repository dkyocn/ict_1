package command.argument;


public class TestCommandLine {

	
	/*
	 *  java는 main() 메서드의 시그니처(signature)를 정해 놓음
	 *  메서드 ()안에 선언하는 변수 : 매개변수(parameter) 라고 함, 지역변수(Local Variable) 임
	 *  지역변수: 메서드가 실행될 때,  메서드 방 안에 만들어지는 변수
	 *  static 이 표시된 메서드는 정적메모리(static)에 메서드방을 만듦 :
	 *  	프로그램이 실행될 때 자동 할당되고, 프로그램이 종료되면 자동 삭제됨 (프로그램 구동 동안은 계속 존재함)
	 *  	싱글톤(SingleTone) 디자인패턴을 적용할 때 이용함
	 *  static 이 없는 메서드는 동적메모리의 stack에 메서드 방을 만듦 :
	 *  	메서드 실행하면 할당되고, 메서드가 리턴되면서 종료되면 자동 삭제됨
	 */
	public static void main(String[] args) {
		// 프로그램 실행  시 main() 메서드의 메개변수로 값을 전달할 수 있음
		System.out.println("main 에게 전달된 값 개수 : "+ args.length);
		
		for(int i =0; i<args.length; i++  ) {
			System.out.println(i + "번째 전달값 : "+args[i]);
		}
	}

}
