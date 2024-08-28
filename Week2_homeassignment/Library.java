package Week2_homeassignment;

public class Library {

	// Method to add a book
    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    // Method to issue a book
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        // Create an object of Library
        Library library = new Library();

        // Call methods using the object
        String addedBookTitle = library.addBook("Java Programming");
        System.out.println("Added Book Title: " + addedBookTitle);

        library.issueBook();
    }
}
