public class Book {

    public String title;
    public String author;
    public boolean isBorrowed;

    public boolean borrowBook() {
        if (isBorrowed) {
            return false;
        }

        isBorrowed = true;
        return true;
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        }
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + isBorrowed);
    }
}
