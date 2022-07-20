package memento.example.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    public Memento(int money) {
        this.money = money;
        fruits=new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruit() {
        return fruits;
    }
}
