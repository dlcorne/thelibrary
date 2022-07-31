package thelibrary;

public abstract class Book extends Object {
	
	private int id;
	private String title;
	private String author;
	private int pageCount;
	private boolean checkedOut;
	
	public Book() {
		super();
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public Book(int id, String title, String author, int pageCount, boolean checkedOut) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.checkedOut = checkedOut;
	}
	
	public void print() {
		System.out.println("ID: " + id);
		System.out.println("This item is titled " + title);
		System.out.println(", written by " + author);
		System.out.println("It is " + pageCount + " pages long");
		System.out.println("Is this item checked out: " + checkedOut);
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPageCount() {
		return this.pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public void kind() {
		System.out.println("Something is very wrong");
	}
	
	public Book checkOut() {
	    this.checkedOut = false;
	    return this;
	}
	
	public Book checkIn() {
		this.checkedOut = true;
		return this;
	}
}



