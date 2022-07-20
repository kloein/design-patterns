package observer.example;

import observer.example.generator.NumberGenerator;
import observer.example.generator.RandomNumberGenerator;
import observer.example.observer.DigitObserver;
import observer.example.observer.GraphObserver;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        //添加观测者
        generator.addObserver(new DigitObserver());
        generator.addObserver(new GraphObserver());
        //随机生成数字
        generator.execute();
    }
}
