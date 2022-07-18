package Iterator.example;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private Integer index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    /**
     * 后续是否还有元素？是返回true，否则false
     */
    public boolean hasNext() {
        if (index < bookShelf.books.size()) {
            return true;
        }
        return false;
    }

    /**
     * 返回当前指针指向的元素，并且将指针后移
     * @return
     */
    @Override
    public Book next() {
        return bookShelf.books.get(index++);
    }
}
