package memento.example;

import memento.example.game.Gamer;
import memento.example.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();//存档
        for (int i = 0; i < 100; i++) {
            System.out.println("=========="+i);
            System.out.println("当前状态:"+gamer);
            gamer.bet();//进行游戏
            System.out.println("所持金钱为"+gamer.getMoney()+"元");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("所持金钱增加，存档");
                memento=gamer.createMemento();
            } else if(gamer.getMoney()< memento.getMoney()/2) {
                System.out.println("所持金钱减少许多，读档");
                gamer.restoreMemento(memento);
            }
        }
    }
}

