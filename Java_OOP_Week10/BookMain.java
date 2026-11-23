public class BookMain {

    public static void main(String[] args) {

        // Create books
        Book b1 = new Book();
        b1.title = "The Hobbit";
        b1.author = "J.R.R. Tolkien";
        b1.isBorrowed = false;

        Book b2 = new Book();
        b2.title = "1984";
        b2.author = "George Orwell";
        b2.isBorrowed = false;

        // Print books
        System.out.println("=== BOOK LIST ===");
        b1.print();
        System.out.println();
        b2.print();

        // Borrow book
        System.out.println("\n=== BORROWING ===");
        if (b1.borrowBook()) {
            System.out.println("Successfully borrowed " + b1.title);
        } else {
            System.out.println("Book is already borrowed.");
        }

        // Try borrowing again
        if (b1.borrowBook()) {
            System.out.println("Successfully borrowed " + b1.title);
        } else {
            System.out.println("Cannot borrow " + b1.title + ". It is already borrowed.");
        }

        // Return book
        System.out.println("\n=== RETURNING ===");
        b1.returnBook();
        System.out.println(b1.title + " has been returned.");

        // Borrow again
        if (b1.borrowBook()) {
            System.out.println(b1.title + " can now be borrowed again.");
        }
    }
}
