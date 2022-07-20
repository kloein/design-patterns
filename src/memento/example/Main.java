package memento.example;

import memento.example.game.Gamer;
import memento.example.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();//�浵
        for (int i = 0; i < 100; i++) {
            System.out.println("=========="+i);
            System.out.println("��ǰ״̬:"+gamer);
            gamer.bet();//������Ϸ
            System.out.println("���ֽ�ǮΪ"+gamer.getMoney()+"Ԫ");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("���ֽ�Ǯ���ӣ��浵");
                memento=gamer.createMemento();
            } else if(gamer.getMoney()< memento.getMoney()/2) {
                System.out.println("���ֽ�Ǯ������࣬����");
                gamer.restoreMemento(memento);
            }
        }
    }
}

