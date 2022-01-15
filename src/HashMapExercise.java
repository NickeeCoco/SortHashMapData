import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<String, Book> books = new HashMap<String, Book>();
        books.put("Book 1", new Book("To Kill A Mockingbird", "Harper Lee", 1960));
        books.put("Book 2", new Book("Pride And Prejudice", "Jane Austen", 1813));
        books.put("Book 3", new Book("1984", "George Orwell", 1949));
        books.put("Book 4", new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        books.put("Book 5", new Book("The Catcher In The Rye", "J.D. Salinger", 1951));

        Collection<Book> booksCollection = books.values();
        ArrayList booksList = new ArrayList(booksCollection);
        System.out.println(booksList);
        Collections.sort(booksList);
        System.out.println(booksList);

    }
}
