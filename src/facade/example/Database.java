package facade.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    public Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename=dbname+".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
