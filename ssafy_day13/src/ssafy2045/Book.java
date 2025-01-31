package ssafy2045;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private String desc;

    public Book(String isbn, String title, String author, String publisher, int price, String desc) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.desc = desc;
    }

    String getIsbn() {
        return isbn;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getDesc() {
        return desc;
    }

    void setDesc(String desc) {
        this.desc = desc;
    }

	@Override
	public String toString() {
		return String.format("%-8s|%-12s|%-16s|%-12s|%-12s|%-24s", isbn, title, author, publisher, price, desc);
	}
	
	
}
