package factory.example;

import factory.example.framework.Product;
import factory.example.impl.card.CardFactory;

public class Main {
    public static void main(String[] args) {
        CardFactory cardFactory = new CardFactory();
        Product card1 = cardFactory.create("张三");
        Product card2 = cardFactory.create("李四");
        Product card3 = cardFactory.create("王五");

        card1.use();
        card2.use();
        card3.use();
    }
}
