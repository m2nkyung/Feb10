public class Book {
	private String title, author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		this("", "");
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
	
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author;
	}
}