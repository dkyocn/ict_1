package test.generics;

import test.list.Book;

public class TestMyGenerics {

	public static void main(String[] args) {
		// MyGenerics class 사용 테스트
		MyGenerics<String> test1 = new MyGenerics<String>(5);

		try {
			test1.add("java");
			test1.add("oracle");
			test1.add("idbc");

			for (int i = 0; i < test1.getCount(); i++) {
				System.out.println(test1.get(i));
			}

			test1.add("spring");
			test1.add("mybatis");
			test1.add("jquery"); // 5개까지만 저장할 수 있어 exception 발생

		} catch (SizeOverflowException e) {
			e.printStackTrace();
		}

		MyGenerics<Book> books = new MyGenerics<Book>(10);

		try {
			books.add(new Book("html5", 20000));
			books.add(new Book("css3", 25000));
			books.add(new Book("javascript", 35000));

			for (int i = 0; i < books.getCount(); i++) {
				System.out.println(books.get(i));
			}
		} catch (SizeOverflowException e) {
			e.printStackTrace();
		}
	}

}
