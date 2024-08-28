package Week2_homeassignment;

public class LibraryManagement {

	 public static void main(String[] args) {
	        // Create an object of Library
	        Library library = new Library();

	        // Call methods of Library class using the object
	        String addedBookTitle = library.addBook("Data Structures");
	        System.out.println("Added Book Title from LibraryManagement: " + addedBookTitle);

	        library.issueBook();
	    }

}
