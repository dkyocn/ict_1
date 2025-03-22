package test.thread1;

public class Number extends Thread {
	@Override
	public void run() {
		for (int k = 1; k <= 50; k++) {
			System.out.println(k);
			try {
				Thread.sleep(100); // misisecond : 1000 == 초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
