package template.example;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay stringDisplay = new StringDisplay("Hello World");
        AbstractDisplay charDisplay = new CharDisplay('H');

        stringDisplay.display();
        charDisplay.display();
    }
}
