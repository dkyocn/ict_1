package test.synch;

public class AccountManager extends Thread {
	private Account acc;
	private String name;  //인출방법 이름 (통장, 카드 등)
	
	public AccountManager() {}
	
	public AccountManager(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {  //스래드 start() 시 자동 run() 이 구동됨
		acc = new Account();
		acc.setBalance(1000);
				
		while(acc.getBalance() > 0) {
			System.out.println(name + " 이용 현재 잔액 : " + acc.getBalance());
			//인출할 금액을 난수로 발생시켜서 사용함
			int money = new java.util.Random().nextInt(10) * 100;  //100 ~ 900 사이의 정수 발생
			System.out.println(name + "이 인출한 금액 : " + money);
			acc.withDraw(money);  //인출 처리함
			System.out.println(name + "이 인출하고 남은 잔액 : " + acc.getBalance());
		}  //인터넷뱅킹이 점유하고 있는 동안 체크카드는 잔액에 접근할 수 없는지 확인함
	}
}








