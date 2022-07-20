package singleton.example;

public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {
        System.out.println("懒汉式生成实例");
    }

    private static LazySingleton getInstance() {
        if (singleton != null) {
            singleton=new LazySingleton();
        }
        return singleton;
    }
}
