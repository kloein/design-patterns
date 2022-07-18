package adapter.example.isInterface;

public class test {
    public static void main(String[] args) {
        print(new BannerAdapter());
    }

    public static void print(Print printer) {
        printer.Print_a();
        printer.Print_b();
    }
}
