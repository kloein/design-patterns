package stratrgy.example.strategy;

import stratrgy.example.Hand;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
