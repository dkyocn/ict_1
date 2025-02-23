package io.silsub3;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {

	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discount;

	public Book() {
		super();
	}

	public Book(String title, String author, int price, Calendar dates, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy'년' MM'월' dd'일 출간'");

		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates="
			+ dateFormat.format(dates.getTime()) + ", discount="
			+ discount + "]";
	}

}
