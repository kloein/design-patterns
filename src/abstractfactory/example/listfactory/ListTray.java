package abstractfactory.example.listfactory;

import abstractfactory.example.factory.Item;
import abstractfactory.example.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</li>\n");
        buffer.append("</ul>\n");
        return buffer.toString();
    }
}
