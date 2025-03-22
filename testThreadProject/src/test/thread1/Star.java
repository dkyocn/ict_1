package test.thread1;

public class Star extends Thread {

	@Override
	public void run() {
		for (int k = 1; k <= 50; k++) {
			System.out.println("※");
			try {
				Thread.sleep(100); // misisecond : 1000 == 초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
