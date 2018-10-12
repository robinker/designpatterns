package lab8.AbstractFactoryPattern;

import lab8.DecoratorPattern.MallardDuck;
import lab8.DecoratorPattern.QuackCounter;
import lab8.DecoratorPattern.QuackEcho;
import lab8.DecoratorPattern.Quackable;

public class DuckFactory3 {
    public Quackable makeDuck(){
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }
}
