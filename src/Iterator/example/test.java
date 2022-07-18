package Iterator.example;

import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.books.add(new Book("海底两万里"));
        bookShelf.books.add(new Book("十万个为什么"));
        bookShelf.books.add(new Book("水浒传"));
        bookShelf.books.add(new Book("西游记"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
