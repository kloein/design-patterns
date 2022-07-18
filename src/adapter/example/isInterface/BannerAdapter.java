package adapter.example.isInterface;

public class BannerAdapter extends Banner implements Print{
    @Override
    public void Print_a() {
        print_A();
    }

    @Override
    public void Print_b() {
        print_B();
    }
}
