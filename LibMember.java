package thelibrary;

import java.util.LinkedList;

public class LibMember {

	private int id;
	private String name;
	double feesOwed = 0;
	LinkedList<IsBorrowable> checkedOut = new LinkedList<>();
	
	public LibMember(String name) {
		this.setName(name);
	}
	
	public LibMember returnItem(IsBorrowable item) {
		this.checkedOut.remove(item);
		item.checkIn();
		return this;
	}
	
	public LibMember borrowItem(IsBorrowable item) {
		item.checkOut();
		this.checkedOut.add(item);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

