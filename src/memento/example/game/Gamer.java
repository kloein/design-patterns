package memento.example.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits=new ArrayList();
    private Random random=new Random();
    private static String[] fruitName={"苹果","葡萄","香蕉","橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice=random.nextInt(6)+1;
        if (dice == 1) {
            money+=100;
            System.out.println("所持金钱增加100.");
        } else if (dice == 2) {
            money/=2;
            System.out.println("所持金钱减半.");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果（" + f + "）.");
            fruits.add(f);
        } else {
            System.out.println("什么事都没有发生");
        }
    }
    //存档
    public Memento createMemento() {
        Memento m=new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String f=(String) iterator.next();
            if (f.startsWith("好吃的")) {
                m.addFruit(f);
            }
        }
        return m;
    }
    //读档
    public void restoreMemento(Memento memento) {
        this.money=memento.money;
        this.fruits=memento.fruits;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                '}';
    }

    private String getFruit() {
        String prefix="";
        if (random.nextBoolean()) {
            prefix="好吃的";
        }
        return prefix+fruitName[random.nextInt(fruitName.length)];
    }
}
