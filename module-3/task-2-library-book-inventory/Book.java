public class Book {

    private String isbn;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(
            String isbn,
            String title,
            String author
    ) {

        setIsbn(isbn);
        setTitle(title);

        this.author = author;
        this.isBorrowed = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {

        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException(
                    "ISBN cannot be empty"
            );
        }

        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException(
                    "Title cannot be empty"
            );
        }

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {

        if (!isBorrowed) {

            isBorrowed = true;

            System.out.println(
                    title + " has been borrowed."
            );

        } else {

            System.out.println(
                    title + " is already borrowed."
            );
        }
    }

    public void returnBook() {

        if (isBorrowed) {

            isBorrowed = false;

            System.out.println(
                    title + " has been returned."
            );

        } else {

            System.out.println(
                    title + " was not borrowed."
            );
        }
    }

    public static void main(String[] args) {

        Book book = new Book(
                "978-1234567890",
                "Java Basics",
                "John Smith"
        );

        book.borrowBook();

        book.returnBook();
    }
}
