package prototype.example.impl;

import prototype.example.framework.Product;

public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char c) {
        decoChar=c;
    }

    @Override
    public void use(String s) {
        int len=s.length();
        for (int i = 0; i < len+4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar+" "+s+" "+decoChar);
        for (int i = 0; i < len+4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p=null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
