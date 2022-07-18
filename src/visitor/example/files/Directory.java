package visitor.example.files;

import visitor.example.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    private String name;

    private ArrayList<Entry> dir=new ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator<Entry> iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            size+=next.getSize();
        }
        return size;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }
}
