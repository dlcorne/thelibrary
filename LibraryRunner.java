package thelibrary;

public class LibraryRunner {
	
	public static void main(String[] args) {
	Library theLibrary = new Library();
	LibMember k = new LibMember("Keith");
	Journals j1 = new Journals(4, "b", "c", 15, false, true);
	
	theLibrary.addBook(new GovtDocs(1, "a", "b", 14, true, false));
	theLibrary.addBook(new Dissos(2, "Pride and Prescriptivism", "H. M. Roberts", 15, true, false));
	theLibrary.addBook(new Journals(3, "Routledge Handbook of Forensic Linguistics", "Routledge Foundation", 649, false, true));
	
	theLibrary.remove(1);
	theLibrary.remove("routledge handbook of forensic linguistics");
	
	theLibrary.addUser(k);
	LibMember libMember = new LibMember(null);
	libMember.borrowItem((IsBorrowable) j1);
	
	theLibrary.removeUser(k);
	
	
	
	}
	
	
	

	
}
