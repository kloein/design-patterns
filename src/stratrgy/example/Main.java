package stratrgy.example;

import stratrgy.example.strategy.ProbStrategy;
import stratrgy.example.strategy.WinningStrategy;

public class Main {
    public static void main(String[] args) {
        int seed1=103;
        int seed2=321;

        Player player1 = new Player("tom", new WinningStrategy(seed1));
        Player player2 = new Player("jerry", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                player1.win();
                player2.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                player1.lose();
                player2.win();
            } else {
                player1.even();
                player2.even();
            }
        }
        System.out.println("result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
