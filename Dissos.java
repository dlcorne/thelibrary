package thelibrary;

public class Dissos extends Book {

	private boolean isPublished;
	
	public Dissos() {
		super();
	}
	
	public Dissos(boolean isPublished) {
		super();
		this.isPublished = isPublished;
	}
	
	public Dissos(int id, String title, String author, int pageCount, boolean checkedOut, boolean isPublished) {
		super(id, title, author, pageCount, checkedOut);
		this.isPublished = isPublished;
	}
	
	public boolean getisPublished() {
		return this.isPublished;
	}
	
	public void setisPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	
	@Override
	public void kind() {
		System.out.println("Dissertations");
	}
}
