package test.set;

import java.util.Iterator;
import java.util.TreeSet;

public class UserTreeSet {

	public static void main(String[] args) {
		//  TreeSet : 자동 오르차순정렬이 내장된 Set 클래스임
		TreeSet users = new TreeSet(new UserNameAscending()); // 정렬 기준을 지정하면서  TreeSet 객체 생성함

		// User 객체만 저장해야 함
		// 저장 시 userName 값으로 자동 오름차순정렬되면서 저장될 것임
		users.add(new User("user01", "pass01", "홍길동"));
		users.add(new User("user02", "pass02", "김유신"));
		users.add(new User("user03", "pass03", "이영희"));

		System.out.println(users);

		Iterator iterator = users.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println();

		TreeSet users2 = new TreeSet(new UserNameDescending());

		users2.add(new User("user01", "pass01", "홍길동"));
		users2.add(new User("user02", "pass02", "김유신"));
		users2.add(new User("user03", "pass03", "이영희"));

		System.out.println(users2);

		Iterator iterator2 = users2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
