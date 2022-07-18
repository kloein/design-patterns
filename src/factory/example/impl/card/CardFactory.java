package factory.example.impl.card;

import factory.example.framework.Factory;
import factory.example.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class CardFactory extends Factory {
    private List owners=new ArrayList<String>();
    @Override
    protected Product createProduct(String owner) {
        return new Card(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((Card)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
