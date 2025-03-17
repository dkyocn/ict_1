package month;

public class MonthsTest {

	public static void main(String[] args) {
	
		Months months = new Months();
		
		if(args.length == 1) {
			
			int month = Integer.parseInt(args[0]);
			int day = months.getDays(month);
			if(day != 0) {
				System.out.println("입려받은 월: "+ month);
				System.out.println("마지막일자: "+day);	
			}
			
		} else {
			System.out.println("다시 입려해 주세요");
		}

	}

}
