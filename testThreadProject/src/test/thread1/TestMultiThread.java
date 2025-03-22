package test.thread1;

public class TestMultiThread {

	public static void main(String[] args) {
		// 멀티 스래드 프로그램 : 여러 개의 스래드들을 동시에 실행되게 만드는 기술임
		Thread t1 = new Thread(new Star());
		Thread t2 = new Thread(new Number());

		t1.start();
		t2.start();
	}

}
