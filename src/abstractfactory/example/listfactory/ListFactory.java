package abstractfactory.example.listfactory;

import abstractfactory.example.factory.Factory;
import abstractfactory.example.factory.Link;
import abstractfactory.example.factory.Page;
import abstractfactory.example.factory.Tray;
import factory.example.framework.Product;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
