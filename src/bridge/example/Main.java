package bridge.example;

import bridge.example.func.CountDisplay;
import bridge.example.func.Display;
import bridge.example.impl.DisplayImpl;
import bridge.example.impl.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        Display hello_world = new Display(new StringDisplayImpl("Hello World"));
        CountDisplay hello_china = new CountDisplay(new StringDisplayImpl("Hello China"));
        CountDisplay hello_universe = new CountDisplay(new StringDisplayImpl("Hello Universe"));
        hello_world.display();
        hello_china.display();
        hello_universe.display();
        hello_universe.multiDisplay(5);
    }
}
