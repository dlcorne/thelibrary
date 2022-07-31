package thelibrary;

public class Journals extends Book {
	
	private boolean isPeerReviewed;
	
	public Journals() {
		super();
	}
	
	public Journals(boolean isPeerReviewed) {
		super();
		this.isPeerReviewed = isPeerReviewed;
	}
	
	public Journals(int id, String title, String author, int pageCount, boolean checkedOut, boolean isPeerReviewed) {
		super(id, title, author, pageCount, checkedOut);
		this.isPeerReviewed = isPeerReviewed;
	}
	
	public boolean getisPeerReviewed() {
		return this.isPeerReviewed;
	}
	
	public void setisPeerReviewed(boolean isPeerReviewed) {
		this.isPeerReviewed = isPeerReviewed;
	}
	
	@Override
	public void kind() {
		System.out.println("Journals");
	}
}