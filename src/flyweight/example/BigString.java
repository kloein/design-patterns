package flyweight.example;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String str) {
        BigCharFactory bigCharFactory = BigCharFactory.getInstance();
        bigChars=new BigChar[str.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i]=bigCharFactory.getBigChar(str.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
