package exam01;

import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1000, "책1", "책1"));
        books.add(new Book(1000, "책1", "책1"));
        books.add(new Book(1000, "책2", "책2"));
        books.add(new Book(1000, "책3", "책3"));
        books.add(new Book(1000, "책4", "책4"));
        books.add(new Book(1000, "책5", "책5"));

        for(Book book : books){
            System.out.println(book);
        }
    }
}
