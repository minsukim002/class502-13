package exam01;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1000, "책2", "저자2"));
        books.add(new Book(1000, "책2", "저자2"));
        books.add(new Book(1000, "책3", "저자3"));
        books.add(new Book(1000, "책4", "저자4"));
        books.add(new Book(1000, "책5", "저자5"));

        for(Book book : books){
            System.out.println(book);
        }
    }
}
