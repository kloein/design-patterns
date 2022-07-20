package state.example;

public class Main {
    public static void main(String[] args) {
        SafeFrame state_simple = new SafeFrame("State Simple");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                state_simple.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
