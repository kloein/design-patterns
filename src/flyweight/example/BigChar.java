package flyweight.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BigChar {
    private char charName;

    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "./src/flyweight/example/big" + charName + ".txt"  //Í¨¹ýtxt´æ´¢
            ));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontData=buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
