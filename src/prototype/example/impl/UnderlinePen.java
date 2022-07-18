package prototype.example.impl;

import prototype.example.framework.Product;

public class UnderlinePen implements Product {
    private char ulChar;

    public UnderlinePen(char c) {
        ulChar=c;
    }

    @Override
    public void use(String s) {
        int len=s.length();
        System.out.println("\""+s+"\"");
        System.out.print(" ");
        for (int i = 0; i < len; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p=null;
        try {
            p=(Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
