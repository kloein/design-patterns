package memento.example.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits=new ArrayList();
    private Random random=new Random();
    private static String[] fruitName={"ƻ��","����","�㽶","����"};

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
            System.out.println("���ֽ�Ǯ����100.");
        } else if (dice == 2) {
            money/=2;
            System.out.println("���ֽ�Ǯ����.");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("���ˮ����" + f + "��.");
            fruits.add(f);
        } else {
            System.out.println("ʲô�¶�û�з���");
        }
    }
    //�浵
    public Memento createMemento() {
        Memento m=new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String f=(String) iterator.next();
            if (f.startsWith("�óԵ�")) {
                m.addFruit(f);
            }
        }
        return m;
    }
    //����
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
            prefix="�óԵ�";
        }
        return prefix+fruitName[random.nextInt(fruitName.length)];
    }
}
