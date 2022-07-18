package decorator.example;

import decorator.example.border.FullBorder;
import decorator.example.border.SideBorder;

public class Main {
    public static void main(String[] args) {
        StringDisplay hello_world = new StringDisplay("Hello World");
        SideBorder b1 = new SideBorder(hello_world, '#');
        FullBorder b2 = new FullBorder(b1);
        hello_world.show();
        b1.show();
        b2.show();
    }
}
