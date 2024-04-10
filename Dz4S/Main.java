package Dz4S;

public class Main {
    public static void main(String[] args) {
        Book<String> book1 = new Book<>("Над пропастью во ржи.");
        Book<String> book2 = new Book<>("О дивный новый мир.");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.issuedBooks(book2);
        library.issuedBooks(book1);
        library.displayIssuedBooks();
    }
}
