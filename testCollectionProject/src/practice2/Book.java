package practice2;

public class Book {

	private String bNO;
	private int category;
	private String title;
	private String author;

	public Book() {
		super();
	}

	public Book(String bNO, int category, String title, String author) {
		super();
		this.bNO = bNO;
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNO() {
		return bNO;
	}

	public void setbNO(String bNO) {
		this.bNO = bNO;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	@Override
	public String toString() {
		return "Book [bNO=" + bNO + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}

}
