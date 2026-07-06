package LibraryManagement;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Create Books
        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Data Structures", "Mark Allen");
        Book b3 = new Book(103, "Computer Networks", "Andrew Tanenbaum");

        // Add Books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Create Member
        Member member = new Member(1, "Bhumika Gupta");

        System.out.println("\n----- Member Details -----");
        member.displayMember();

        // Display Books
        library.displayBooks();

        // Issue Book
        System.out.println("\nIssuing Book ID 101...");
        library.issueBook(101);

        // Return Book
        System.out.println("\nReturning Book ID 101...");
        library.returnBook(101);

        // Final Book List
        library.displayBooks();
    }
}