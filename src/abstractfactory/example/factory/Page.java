package abstractfactory.example.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content=new ArrayList<Item>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String filename = title+".html";
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(this.makeHTML());
            fileWriter.close();
            System.out.println(filename+"±‡–¥ÕÍ≥…");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
