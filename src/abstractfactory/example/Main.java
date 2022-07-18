package abstractfactory.example;


import abstractfactory.example.factory.Factory;
import abstractfactory.example.factory.Link;
import abstractfactory.example.factory.Page;
import abstractfactory.example.factory.Tray;

public class Main {
    public static void main(String[] args) {
        String factoryName="abstractfactory.example.listfactory.ListFactory";
        Factory factory = Factory.getFactory(factoryName);

        Link people = factory.createLink("人民日报", "https://www.people.cpm.cn/");
        Link gmw = factory.createLink("光明日报", "https://www.gmw.cpm.cn/");

        Link baidu = factory.createLink("百度", "https://www.baidu.com");
        Link excite = factory.createLink("Excite", "https://www.excite.com");
        Link google = factory.createLink("Google", "https://www.google.com");

        Tray trayNews=factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray baiduTray = factory.createTray("百度");
        baiduTray.add(baidu);

        Tray searchTray = factory.createTray("搜索引擎");
        searchTray.add(baidu);
        searchTray.add(google);

        Page page = factory.createPage("LinkPage", "kloein");
        page.add(trayNews);
        page.add(baiduTray);
        page.add(searchTray);
        page.output();
    }
}
