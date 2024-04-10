package Dz4S;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Book> issuedBooks = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void issuedBooks(Book book){
        if (books.contains(book)){
            books.remove(book);
            issuedBooks.add(book);
        } else {
            System.out.println("Книга не найдена в библиотеке.");
        }
    }

    public void displayIssuedBooks(){
        System.out.println("Выданные книги: ");
        for (Book book : issuedBooks){
            System.out.println(book.getTitle());
        }
    }
}
