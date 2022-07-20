package proxy.example;

public class Main {
    public static void main(String[] args) {
        PrinterProxy printerProxy = new PrinterProxy("Alice");
        System.out.println("���ڵ�������:"+printerProxy.getPrinterName()+".");
        printerProxy.setPrinterName("Bob");
        System.out.println("���ڵ�������:"+printerProxy.getPrinterName()+".");
        printerProxy.print("Hello");
    }
}
