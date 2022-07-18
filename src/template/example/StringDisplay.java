package template.example;

public class StringDisplay extends AbstractDisplay{
    private String s;

    public StringDisplay(String s) {
        this.s=s;
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < s.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+s+"|");
    }

    @Override
    public void close() {
        printLine();
    }
}
