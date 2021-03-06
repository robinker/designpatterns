package lab8.DecoratorPattern;

import java.util.ArrayList;

public class DuckSimulator {
    private ArrayList<Quackable> quackables = new ArrayList<>();

    public void addQuackables(Quackable quackable) {
        this.quackables.add(quackable);
    }

    public void simulate() {
        quackables.forEach(Quackable::quack);
    }
}
