package observer.example.observer;

import observer.example.generator.NumberGenerator;

public interface Observer {
    public abstract void update(NumberGenerator generator);
}
