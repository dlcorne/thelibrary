package thelibrary;

public class GovtDocs extends Book {

	private boolean isLeaked;
	
	public GovtDocs() {
		super();
	}
	
	public GovtDocs(boolean isLeaked) {
		super();
		this.isLeaked = isLeaked;
	}
	
	public GovtDocs(int id, String title, String author, int pageCount, boolean checkedOut, boolean isLeaked) {
		super(id, title, author, pageCount, checkedOut);
		this.isLeaked = isLeaked;
	}
	
	public boolean getIsLeaked() {
		return this.isLeaked;
	}
	
	public void setIsLeaked(boolean isLeaked) {
		this.isLeaked = isLeaked;
	}
	
	@Override
	public void kind() {
		System.out.println("Government Documents");
	}
}
