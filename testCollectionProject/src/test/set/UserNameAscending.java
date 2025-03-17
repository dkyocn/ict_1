package test.set;

/*
 *  User 객체의 userName 필드 값을 가지고 오름차순정렬 기준을 만드는 클래스임 (정렬 기준용 클래스임)
 *  작성 기준:
 *  1. Comparator 인터페이스를 상속받아야 함
 *  2. 상속받은 추상메서드인 compare() 오버라이딩함
 *  3. compare() 메서드 안에서, 대상 클래스의 맴버 변수(field) 중에서 정렬 기준이 될 필드에 대한 비교 연산 처리 구현할 것
 */

public class UserNameAscending implements java.util.Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// userName끼리 비교 연산해서 결과를 리턴하는 코드 구현 : String 클래스의 compareTo() : int 사용
		int result = 0;

		if (o1 instanceof User && o2 instanceof User) {
			User user1 = (User)o1;
			User user2 = (User)o2;

			result = user1.getUserName().compareTo(user2.getUserName());
		}

		return result;
	}

}
