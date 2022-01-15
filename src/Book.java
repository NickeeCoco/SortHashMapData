public class Book implements Comparable<Book> {
    public String title;
    public String author;
    public int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book book) {
        return this.publicationYear - book.publicationYear;
    }

    @Override
    public String toString() {
        return this.title + " is a book by " + this.author + " published in " + publicationYear;
    }
}
