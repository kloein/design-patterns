package proxy.example;

public class Printer implements Printable{
    private String name;

    public Printer(String name) {
        this.name=name;
        heavyJob("Printer实例生成中");
    }

    @Override
    public void setPrinterName(String name) {
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("========="+name+"=======");
        System.out.println(str);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("end");
    }
}
