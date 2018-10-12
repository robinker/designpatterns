package lab8.CompositePattern;

import lab8.DecoratorPattern.*;

public class Main {
    public static void main(String[] args) {
        Flock flock = new Flock();
        for(int i = 0; i < 8; i++)
            flock.add(new MallardDuck());
        flock.add(new PigeonAdaptor(new Pigeon()));
        flock.add(new GooseAdaptor(new Goose()));

        flock.quackAll();
    }
}
