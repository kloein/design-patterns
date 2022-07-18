package adapter.example.isClass;

public class BannerAdapter extends Print {
    private static Banner banner=new Banner();
    @Override
    public void Print_a() {
        banner.print_A();
    }

    @Override
    public void Print_b() {
        banner.print_B();
    }
}
