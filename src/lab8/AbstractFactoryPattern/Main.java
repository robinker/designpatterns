package lab8.AbstractFactoryPattern;

import lab8.DecoratorPattern.QuackCounter;
import lab8.DecoratorPattern.Quackable;

public class Main {
    public static void main(String[] args) {
        DuckFactory1 f1 = new DuckFactory1();
        DuckFactory2 f2 = new DuckFactory2();
        DuckFactory3 f3 = new DuckFactory3();

        f1.makeDuck().quack();
        Quackable d2 = f2.makeDuck();
        d2.quack();
        System.out.println("Quack : " + QuackCounter.getNum() + " times");
        f3.makeDuck().quack();
    }
}
