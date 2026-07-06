package LibraryManagement;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully.");
    }

    // Display All Books
    public void displayBooks() {
        System.out.println("\n----- Library Books -----");
        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search Book by ID
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Issue Book
    public void issueBook(int bookId) {
        Book book = searchBook(bookId);

        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    // Return Book
    public void returnBook(int bookId) {
        Book book = searchBook(bookId);

        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}