package composite.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making entries....");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        root.add(bin);
        root.add(tmp);

        bin.add(new File("vim", 1000));
        bin.add(new File("ls", 500));

        tmp.add(new File("mysql_log", 20000));
        tmp.add(new File("system_security_log)",100000));
        root.printList();
    }
}
