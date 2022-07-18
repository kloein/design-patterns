package prototype.example;

import prototype.example.framework.Manager;
import prototype.example.framework.Product;
import prototype.example.impl.MessageBox;
import prototype.example.impl.UnderlinePen;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        //创建实例
        UnderlinePen upen = new UnderlinePen('#');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        //登记注册
        manager.register("upen", upen);
        manager.register("mbox", mbox);
        manager.register("sbox", sbox);
        //复制生成
        Product product1 = manager.create("upen");
        Product product2 = manager.create("mbox");
        Product product3 = manager.create("sbox");
        //测试
        product1.use("Hello World");
        product2.use("Hello World");
        product3.use("Hello World");
    }
}
