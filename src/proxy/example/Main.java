package proxy.example;

public class Main {
    public static void main(String[] args) {
        PrinterProxy printerProxy = new PrinterProxy("Alice");
        System.out.println("现在的名字是:"+printerProxy.getPrinterName()+".");
        printerProxy.setPrinterName("Bob");
        System.out.println("现在的名字是:"+printerProxy.getPrinterName()+".");
        printerProxy.print("Hello");
    }
}
