package test.set;

import java.util.Comparator;

public class UserNameDescending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		int result = 0;

		if (o1 instanceof User && o2 instanceof User) {

			User user1 = (User)o1;
			User user2 = (User)o2;

			result = user1.getUserName().compareTo(user2.getUserName());
		}

		return -result;
	}

}
