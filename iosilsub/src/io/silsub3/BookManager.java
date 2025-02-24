package io.silsub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BookManager {

	Scanner scanner = new Scanner(System.in);

	public BookManager() {

	}

	public void fileSave() {

		Book[] books = new Book[] {
			new Book("개미", "베르나르 베르베르", 12000, new GregorianCalendar(2015, 2, 10), 0.12),
			new Book("자산어보", "정약전", 24000, new GregorianCalendar(1817, 5, 20), 0.2),
			new Book("대동여지도", "김정호", 54000, new GregorianCalendar(1827, 10, 2), 0.3),
			new Book("로미오와 줄리엣", "톨스토이", 87000, new GregorianCalendar(1725, 3, 7), 0.1),
			new Book("삼국지", "미상", 110000, new GregorianCalendar(157, 4, 7), 0.56),
		};

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("books.dat"))) {

			for (Book book : books) {
				objectOutputStream.writeObject(book);
			}

			objectOutputStream.flush();
			System.out.println("books.dat 저장 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fileRead() {

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("books.dat"))) {

			Book[] books = new Book[5];

			for (int i = 0; i < books.length; i++) {
				books[i] = (Book)inputStream.readObject();
				System.out.println(books[i]);
			}

			System.out.println("books.dat 읽기 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
