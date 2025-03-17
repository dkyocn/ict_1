package month;

public class Months {
	
	public int getDays(int months) {
		
		int lastDay = 0;
		
		switch(months) {
		case 2:
			lastDay = 28;
			break;
		case 9:
		case 4:
		case 6:
		case 11:
			lastDay = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		default:
			System.out.println("입력된 값이 잘못 되었습니다.");
		}
		
		return lastDay;
		
	}

}
