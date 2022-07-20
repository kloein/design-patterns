package flyweight.example;

import java.util.HashMap;

public class BigCharFactory {
    private HashMap pool=new HashMap<Character,BigChar>();
    private static BigCharFactory singleton=new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = (BigChar)pool.get(charName);
        if (bigChar == null) {
            bigChar=new BigChar(charName);
            pool.put(charName, bigChar);
        }
        return bigChar;
    }
}
