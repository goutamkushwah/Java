// Date : 24/04/2025
// You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        this.no_of_books++;
    }

    void showAvailableBooks() {
        System.out.println("Available books are:");
        for (int i = 0; i < no_of_books; i++) {
            if (books[i] != null) { // Check if the book is not null
                System.out.println(books[i]);
            }
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < no_of_books; i++) {
            if (books[i] != null && books[i].equals(book)) { // Check if the book matches and is not null
                System.out.println("Issuing book: " + book);
                books[i] = null; // Mark the book as issued
                return; // Exit the method after issuing the book
            }
        }
        System.out.println("Book not found in the library.");
    }

    void returnBook(String book) {
        addBook(book);
        System.out.println("Book returned: " + book);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Harry Potter");
        lib.addBook("The Lord of the Rings");
        lib.addBook("To Kill a Mockingbird");

        lib.showAvailableBooks();

        lib.issueBook("Harry Potter");
        lib.showAvailableBooks();

        lib.returnBook("Harry Potter");
        lib.showAvailableBooks();

        lib.issueBook("The Great Gatsby"); // Book not found in the library.
    }
}