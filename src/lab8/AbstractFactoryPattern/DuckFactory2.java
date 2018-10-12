package lab8.AbstractFactoryPattern;

import lab8.DecoratorPattern.MallardDuck;
import lab8.DecoratorPattern.QuackCounter;
import lab8.DecoratorPattern.Quackable;

public class DuckFactory2  {


    public Quackable makeDuck(){
        return new QuackCounter(new MallardDuck());
    }

}
