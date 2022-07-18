package Composite.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    private String name;
    private ArrayList<Entry> dir=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
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
            size+=iterator.next().getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator<Entry> iterator = dir.iterator();
        while (iterator.hasNext()) {
            iterator.next().printList(prefix+"/"+name);
        }
    }
}
