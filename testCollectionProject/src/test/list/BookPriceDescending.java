package test.list;

import java.util.Comparator;

public class BookPriceDescending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int reult = 0;

		if (o1 instanceof Book && o2 instanceof Book) {
			Book book1 = (Book)o1;
			Book book2 = (Book)o2;

			reult = Integer.compare(book2.getPrice(), book1.getPrice());
		}

		return reult;
	}

}
