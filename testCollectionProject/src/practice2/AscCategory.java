package practice2;

import java.util.Comparator;

public class AscCategory implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;

		if (o1 instanceof Book && o2 instanceof Book) {
			Book book1 = (Book)o1;
			Book book2 = (Book)o2;

			result = Integer.compare(book1.getCategory(), book2.getCategory());
		}

		return result;
	}

}
