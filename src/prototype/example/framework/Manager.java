package prototype.example.framework;

import java.util.HashMap;
import java.util.Hashtable;

public class Manager {
    private HashMap<String,Product> showcase=new HashMap<String,Product>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product product = showcase.get(protoName);
        return product.createClone();
    }
}
