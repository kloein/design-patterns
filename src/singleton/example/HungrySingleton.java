package singleton.example;

public class HungrySingleton {
    private static HungrySingleton singleton=new HungrySingleton();

    private HungrySingleton() {
        System.out.println("饿汉式生成实例");
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
