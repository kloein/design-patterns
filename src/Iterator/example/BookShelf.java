package Iterator.example;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Aggregate{
    ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
