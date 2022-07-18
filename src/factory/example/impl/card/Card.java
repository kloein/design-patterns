package factory.example.impl.card;

import factory.example.framework.Product;

public class Card extends Product {
    private String owner;

    public String getOwner() {
        return owner;
    }

    Card(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的card");
    }
}
