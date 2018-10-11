package AbstractFactoryPattern;

import DecoratorPattern.MallardDuck;
import DecoratorPattern.QuackCounter;
import DecoratorPattern.QuackEcho;
import DecoratorPattern.Quackable;

public class DuckFactory3 {
    public Quackable makeDuck(){
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }
}
