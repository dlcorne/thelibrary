package thelibrary;

import java.util.*;

public class Library {

	private ArrayList<Book> inv = new ArrayList<>();
	private ArrayList<LibMember> users = new ArrayList<>();
	
	public void addBook(Book b) {
		int count = 0;
		b.setId(count++);
		this.inv.add(b);
	}
	
	public void addUser(LibMember m) {
		int count = 0;
		m.setId(count++);
		this.users.add(m);
	}
	
	public void removeBook(Book b) {
		this.inv.remove(b);
	}
	
	public void remove(String type) {
		ArrayList<Book> toRemove = new ArrayList<>();
		for (Book b : this.inv) {
			if (b.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(b);
			}
		}
		this.inv.removeAll(toRemove);
	}
	
	public void remove(int id) {
		for (Book b : this.inv) {
			if (b.getId() == id) {
				this.inv.remove(b);
				return;
			}
		}
	}
	
	public void removeUser(LibMember m) {
		this.users.remove(m);
	}
	
	Book findTitle(String atitle) {
		for (Book item : this.inv) {
			if (item.getTitle().equalsIgnoreCase(atitle)) {
				return item;
			}
		}
		return null;
	}	
	
}
